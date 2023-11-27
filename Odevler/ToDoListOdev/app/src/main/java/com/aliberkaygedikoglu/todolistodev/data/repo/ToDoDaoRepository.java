package com.aliberkaygedikoglu.todolistodev.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.aliberkaygedikoglu.todolistodev.data.entity.ToDo;
import com.aliberkaygedikoglu.todolistodev.room.ToDoDao;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ToDoDaoRepository {

    public MutableLiveData<List<ToDo>> toDoList = new MutableLiveData<>();

    private ToDoDao tDao;

    public ToDoDaoRepository(ToDoDao tDao) {
        this.tDao = tDao;
    }



    public void create(String name){
        ToDo createtoDo = new ToDo(0,name);
        tDao.create(createtoDo).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void update(int id,String name){
        ToDo updateToDo = new ToDo(id,name);
        tDao.update(updateToDo).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void search(String searchWord){
        tDao.search(searchWord).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<ToDo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onSuccess(List<ToDo> toDos) {
                        toDoList.setValue(toDos);
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void delete(int id){
        ToDo toDo = new ToDo(id,"");
        tDao.delete(toDo).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {
                        toDoLoad();
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }


    public void toDoLoad(){
        tDao.toDoLoad().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<ToDo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<ToDo> toDos) {
                        toDoList.setValue(toDos);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
