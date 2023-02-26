package com.yemeksepeti.RestfulToDo.repo;

import com.yemeksepeti.RestfulToDo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
