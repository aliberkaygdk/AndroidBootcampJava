package com.aliberkaygedikoglu.mvvmkullanimi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public MutableLiveData<String> sonuc  ;
    public MatematikRepository mRepo = new MatematikRepository();

    public MainActivityViewModel() {
        sonuc = mRepo.sonuc;
    }

    public void topla(String alinanSayi1, String alinanSayi2){

        mRepo.topla(alinanSayi1,alinanSayi2);
    }

    public void carp(String alinanSayi1,String alinanSayi2){
       mRepo.carp(alinanSayi1,alinanSayi2);
    }

}
