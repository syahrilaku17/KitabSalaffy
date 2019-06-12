package com.syahrilirfani.kitabsalaffy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKitabAdapter extends RecyclerView.Adapter<ListKitabAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Kitab> listKitab;

    public ArrayList<Kitab> getListKitab() {
        return listKitab;
    }

    void setListKitab(ArrayList<Kitab> listKitab) {
        this.listKitab = listKitab;
    }

    ListKitabAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ListKitabAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kitab, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListKitabAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvKitab.setText(getListKitab().get(position).getKitab());
        categoryViewHolder.tvKategori.setText(getListKitab().get(position).getKategori());

        Glide.with(context)
                .load(getListKitab().get(position).getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgGambar);

    }

    @Override
    public int getItemCount() {
        return getListKitab().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvKitab;
        TextView tvKategori;
        ImageView imgGambar;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvKitab = itemView.findViewById(R.id.tv_kitab);
            tvKategori = itemView.findViewById(R.id.tv_kategori);
            imgGambar = itemView.findViewById(R.id.img_kitab);
        }
    }
}
