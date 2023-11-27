package com.aliberkaygedikoglu.todolistodev.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.aliberkaygedikoglu.todolistodev.data.repo.ToDoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class CreaterViewModel extends ViewModel {

    public ToDoDaoRepository tRepo;

    @Inject
    public CreaterViewModel(ToDoDaoRepository tRepo){
        this.tRepo = tRepo;
    }

    public void create(String name){
        tRepo.create(name);
    }
}
