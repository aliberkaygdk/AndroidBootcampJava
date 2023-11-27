package com.aliberkaygedikoglu.todolistodev.di;

import android.content.Context;

import androidx.room.Room;

import com.aliberkaygedikoglu.todolistodev.data.repo.ToDoDaoRepository;
import com.aliberkaygedikoglu.todolistodev.room.DB;
import com.aliberkaygedikoglu.todolistodev.room.ToDoDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public ToDoDaoRepository provideToDoDaoRepository(ToDoDao tDao){
        return new ToDoDaoRepository(tDao);
    }

    @Provides
    @Singleton
    public ToDoDao provideToDoDao(@ApplicationContext Context context){
        DB db = Room.databaseBuilder(context,DB.class,"tododb.sqlite")
                .createFromAsset("tododb.sqlite").build();
        return db.getKisilerDao();
    }
}
