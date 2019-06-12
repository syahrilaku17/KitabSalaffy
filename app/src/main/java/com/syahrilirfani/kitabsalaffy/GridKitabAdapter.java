package com.syahrilirfani.kitabsalaffy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKitabAdapter extends RecyclerView.Adapter<GridKitabAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Kitab> listKitab;

    public ArrayList<Kitab> getListKitab() {
        return listKitab;
    }

    public void setListKitab(ArrayList<Kitab> listKitab) {
        this.listKitab = listKitab;
    }

    public GridKitabAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridKitabAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_kitab, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridKitabAdapter.GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListKitab().get(position).getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgGambar);
    }

    @Override
    public int getItemCount() {
        return getListKitab().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.img_kitab);
        }
    }
}
