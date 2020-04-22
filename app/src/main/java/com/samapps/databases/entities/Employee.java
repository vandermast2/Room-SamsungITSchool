package com.samapps.databases.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Employee {
    @PrimaryKey
    public long id;

    public String name;

    public int salary;
}
