package com.aliberkaygedikoglu.todolistodev.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.aliberkaygedikoglu.todolistodev.data.entity.ToDo;
import com.aliberkaygedikoglu.todolistodev.databinding.RecyclerItemBinding;
import com.aliberkaygedikoglu.todolistodev.ui.viewmodel.MainViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoHolder> {

    private List<ToDo> toDoList;
    private Context mContext;
    private MainViewModel viewModel;

    public ToDoAdapter(List<ToDo> toDoList, Context mContext, MainViewModel viewModel) {
        this.toDoList = toDoList;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }


    @NonNull
    @Override
    public ToDoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerItemBinding binding = RecyclerItemBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new ToDoHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoHolder holder, int position) {
        ToDo toDo = toDoList.get(position);
        RecyclerItemBinding recyclerItemBinding = holder.binding;

        recyclerItemBinding.textViewName.setText(toDo.getName());

        recyclerItemBinding.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,toDo.getName()+" silinsin mi?",Snackbar.LENGTH_SHORT)
                        .setAction("EVET",v1 -> {
                            viewModel.delete(toDo.getId());
                        })
                        .show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }

    public class ToDoHolder extends RecyclerView.ViewHolder {
        private RecyclerItemBinding binding;
        public ToDoHolder(RecyclerItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
