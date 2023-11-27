package com.aliberkaygedikoglu.todolistodev.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.aliberkaygedikoglu.todolistodev.data.entity.ToDo;

@Database(entities = {ToDo.class},version = 1)
public abstract class DB extends RoomDatabase {
    public abstract ToDoDao getKisilerDao();
}
