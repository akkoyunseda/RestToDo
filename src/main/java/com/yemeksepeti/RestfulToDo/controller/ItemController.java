package com.yemeksepeti.RestfulToDo.controller;

import com.yemeksepeti.RestfulToDo.model.Item;
import com.yemeksepeti.RestfulToDo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/todo")
    public ResponseEntity<List<Item>> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") int id){
        return itemService.getItemById(id);
    }

    @PostMapping(value = "/todo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @PutMapping("/todo/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable("id") int id, @RequestBody Item item){
       return itemService.updateItem(id, item);
    }

    @DeleteMapping("/todo/{id}")
    public  ResponseEntity<Item> deleteItem(@PathVariable("id") int id){
        return itemService.deleteItem(id);
    }

}
