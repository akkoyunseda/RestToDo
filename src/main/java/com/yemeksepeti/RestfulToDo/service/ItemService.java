package com.yemeksepeti.RestfulToDo.service;

import com.yemeksepeti.RestfulToDo.model.Item;
import com.yemeksepeti.RestfulToDo.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public ResponseEntity<List<Item>> getAllItems(){
        try {
            List<Item> items = new ArrayList<Item>();

            itemRepo.findAll().forEach(items::add);
            return new ResponseEntity<>(items, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Item> getItemById(int id){
        Optional<Item> itemData = itemRepo.findById(id);

        if(itemData.isPresent()){
            return new ResponseEntity<>(itemData.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Item> createItem(Item item){
        try{
            Item _item = itemRepo
                    .save(new Item(item.getID(),item.getTITLE(),item.getDESCRIPTION(),item.getDUE_DATE(),item.getCOMPLETED()));
            return new ResponseEntity<>(_item, HttpStatus.CREATED);
        }catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Item> updateItem(int id, Item item){
        Optional<Item> itemData = itemRepo.findById(id);

        if(itemData.isPresent()){
            Item _item = itemData.get();
            _item.setTITLE(item.getTITLE());
            _item.setDESCRIPTION(item.getDESCRIPTION());
            _item.setDUE_DATE(item.getDUE_DATE());
            _item.setCOMPLETED(item.getCOMPLETED());
            return new ResponseEntity<>(itemRepo.save(_item),HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public  ResponseEntity<Item> deleteItem(int id){
        Optional<Item> itemData = itemRepo.findById(id);
        if(itemData.isPresent()){
            try {
                itemRepo.deleteById(id);
                return new ResponseEntity<>(itemData.get(), HttpStatus.NOT_FOUND);
            }catch (Exception e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
