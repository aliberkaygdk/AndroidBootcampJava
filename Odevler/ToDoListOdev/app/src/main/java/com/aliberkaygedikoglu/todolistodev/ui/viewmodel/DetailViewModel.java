package com.aliberkaygedikoglu.todolistodev.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.aliberkaygedikoglu.todolistodev.data.repo.ToDoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class DetailViewModel extends ViewModel {
    public ToDoDaoRepository tRepo;

    @Inject
    public DetailViewModel(ToDoDaoRepository tRepo){
        this.tRepo = tRepo;
    }

    public void update(int id,String name){
        tRepo.update(id,name);
    }
}
