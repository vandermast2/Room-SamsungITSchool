package com.samapps.databases.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.samapps.databases.entities.Employee;
import com.samapps.databases.entities.EmployeeDao;

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
}
