package com.yemeksepeti.RestfulToDo;

import com.yemeksepeti.RestfulToDo.model.Item;
import com.yemeksepeti.RestfulToDo.repo.ItemRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

/*@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepoTest {

    @Autowired
    private ItemRepo itemRepo;

    @Test
    public void testCreateItem(){
        Item testItem = new Item();
        testItem.setTITLE("testTitle");
        testItem.setDUE_DATE(Date.valueOf("2023-02-26"));
        testItem.setCOMPLETED(false);
        itemRepo.save(testItem);

        Assert.assertNotNull(testItem.getID());
    }

   @Test
    public void testGetItemById(){
        Item testItem = new Item();
        testItem.setTITLE("testTitle");
        testItem.setDUE_DATE(Date.valueOf("2023-02-26"));
        testItem.setDESCRIPTION("testDescription");
        testItem.setCOMPLETED(false);
        itemRepo.save(testItem);

        Item createdItem = itemRepo.findById(testItem.getID()).orElse(null);

        Assert.assertNotNull(createdItem);
        Assert.assertEquals(testItem.getTITLE(), createdItem.getTITLE());
        Assert.assertEquals(testItem.getDUE_DATE(), createdItem.getDUE_DATE());
        Assert.assertEquals(testItem.getDESCRIPTION(), createdItem.getDESCRIPTION());
    }

    @Test
    public void testUpdateItem(){
        Item testItem = new Item();

        testItem.setTITLE("testTitle");
        testItem.setDUE_DATE(Date.valueOf("2023-02-26"));
        testItem.setDESCRIPTION("testDescription");
        testItem.setCOMPLETED(false);
        itemRepo.save(testItem);

        testItem.setTITLE("testUpdatedTitle");
        testItem.setDESCRIPTION("testUpdatedDescription");
        itemRepo.save(testItem);

        Item updatedItem = itemRepo.findById(testItem.getID()).orElse(null);

        Assert.assertNotNull(updatedItem);
        Assert.assertEquals(testItem.getTITLE(), updatedItem.getTITLE());
        Assert.assertEquals(testItem.getDUE_DATE(), updatedItem.getDUE_DATE());
        Assert.assertEquals(testItem.getDESCRIPTION(), updatedItem.getDESCRIPTION());
    }

    @Test
    public void testDeleteItem(){
        Item testItem = new Item();

        testItem.setTITLE("testTitle");
        testItem.setDUE_DATE(Date.valueOf("2023-02-26"));
        testItem.setDESCRIPTION("testDescription");
        testItem.setCOMPLETED(false);
        itemRepo.save(testItem);
        itemRepo.deleteById(testItem.getID());

        Item deletedItem = itemRepo.findById(testItem.getID()).orElse(null);
        Assert.assertNull(deletedItem);
    }

}*/
