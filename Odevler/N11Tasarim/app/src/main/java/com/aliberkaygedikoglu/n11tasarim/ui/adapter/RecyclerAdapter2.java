package com.aliberkaygedikoglu.n11tasarim.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aliberkaygedikoglu.n11tasarim.R;
import com.aliberkaygedikoglu.n11tasarim.data.entity.Cardview;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder> {

    Context context;
    ArrayList<Cardview> cardviews;

    public RecyclerAdapter2(Context context, ArrayList<Cardview> cardviews) {
        this.context = context;
        this.cardviews = cardviews;
    }

    @NonNull
    @Override
    public RecyclerAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recylerview2_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter2.ViewHolder holder, int position) {
        holder.imageViewFirsat.setImageResource(cardviews.get(position).getFirsatImage());
        holder.textViewFiyat.setText(cardviews.get(position).getFiyat());
        holder.textViewIcerik.setText(cardviews.get(position).getIcerik());
        holder.textViewFirsatTop.setText(cardviews.get(position).getFirsatTop());
    }

    @Override
    public int getItemCount() {
        return cardviews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewFiyat,textViewIcerik,textViewFirsatTop;
        ImageView imageViewFirsat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewFiyat=itemView.findViewById(R.id.textViewFiyat);
            textViewIcerik=itemView.findViewById(R.id.textViewFirsatIcerik);
            textViewFirsatTop=itemView.findViewById(R.id.textViewFirsatTop);
            imageViewFirsat=itemView.findViewById(R.id.imageViewFirsat);
        }
    }
}
