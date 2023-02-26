package com.yemeksepeti.RestfulToDo.model;

import lombok.*;


import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name= "ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @NonNull
    @Column(name= "title", nullable = false, length = 50)
    private String TITLE;

    @Column(name= "description", nullable = true, length = 255)
    private String DESCRIPTION;

    @NonNull
    @Column(name ="due_date", nullable = false)
    private Date DUE_DATE;

    @NonNull
    @Column(name = "completed", nullable = false)
    private Boolean COMPLETED;

    public Item(String title, String description, Date due_date,Boolean completed){
        this.TITLE = title;
        this.DESCRIPTION = description;
        this.DUE_DATE = due_date;
        this.COMPLETED = completed;
    }
}
