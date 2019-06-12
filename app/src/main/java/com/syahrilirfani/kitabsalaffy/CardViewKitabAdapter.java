package com.syahrilirfani.kitabsalaffy;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewKitabAdapter extends RecyclerView.Adapter<CardViewKitabAdapter.CardViewViewHolder> {
    public CardViewKitabAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Kitab> getListKitab() {
        return listKitab;
    }

    public void setListKitab(ArrayList<Kitab> listKitab) {
        this.listKitab = listKitab;
    }

    private ArrayList<Kitab> listKitab;


    @NonNull
    @Override
    public CardViewKitabAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_kitab, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewKitabAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        final Kitab p = getListKitab().get(i);

        Glide.with(context)
                .load(p.getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgGambar);
        cardViewViewHolder.tvKitab.setText(p.getKitab());
        cardViewViewHolder.tvKategori.setText(p.getKategori());

        cardViewViewHolder.btnSuka.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda baru saja menyukai "+getListKitab().get(position).getKitab(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnBagi.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda baru saja berbagi "+getListKitab().get(position).getKitab(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.imgGambar.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailKitabActivity.class);
                intent.putExtra(DetailKitabActivity.EXTRA_KITAB, getListKitab().get(position).getKitab());
                intent.putExtra(DetailKitabActivity.EXTRA_KATEGORI, getListKitab().get(position).getKategori());
                intent.putExtra(DetailKitabActivity.EXTRA_GAMBAR, getListKitab().get(position).getGambar());
                intent.putExtra(DetailKitabActivity.EXTRA_DETAIL, getListKitab().get(position).getDeskripsi());
                intent.putExtra(DetailKitabActivity.EXTRA_PESANTREN, getListKitab().get(position).getPesantren());
                context.startActivity(intent);
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListKitab().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvKitab, tvKategori;
        Button btnSuka, btnBagi;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.img_kitab);
            tvKitab = itemView.findViewById(R.id.tv_kitab);
            tvKategori = itemView.findViewById(R.id.tv_kategori);
            btnSuka = itemView.findViewById(R.id.btn_suka);
            btnBagi = itemView.findViewById(R.id.btn_bagi);

        }
    }
}
