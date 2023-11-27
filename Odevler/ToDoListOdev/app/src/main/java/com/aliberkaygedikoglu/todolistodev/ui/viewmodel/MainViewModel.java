package com.aliberkaygedikoglu.todolistodev.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.aliberkaygedikoglu.todolistodev.data.entity.ToDo;
import com.aliberkaygedikoglu.todolistodev.data.repo.ToDoDaoRepository;

import java.io.Closeable;
import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {

    public ToDoDaoRepository tRepo;
    public MutableLiveData<List<ToDo>> toDoList;

    @Inject
    public MainViewModel(ToDoDaoRepository tRepo) {
        this.tRepo = tRepo;
        toDoLoad();
        toDoList = tRepo.toDoList;

    }


    public void search(String searchWord){
        tRepo.search(searchWord);
    }

    public void delete(int id){
        tRepo.delete(id);
    }

    public void toDoLoad(){
        tRepo.toDoLoad();
    }

}
