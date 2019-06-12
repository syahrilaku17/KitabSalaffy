package com.syahrilirfani.kitabsalaffy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailKitabActivity extends AppCompatActivity {
    public static final String EXTRA_KITAB= "extra_kitab";
    public static final String EXTRA_KATEGORI= "extra_kategori";
    public static final String EXTRA_GAMBAR= "extra_gambar";
    public static final String EXTRA_DETAIL= "extra_detail";
    public static final String EXTRA_PESANTREN= "extra_pesantren";

    TextView tvKitab, tvKategori, detailTxt, pesantrenTxt;
    ImageView gambarKitab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kitab);
        tvKitab = findViewById(R.id.tv_kitab);
        tvKategori = findViewById(R.id.tv_kategori);
        gambarKitab =findViewById(R.id.img_kitab);
        detailTxt = findViewById(R.id.content_detail);
        pesantrenTxt = findViewById(R.id.content_pesantren);

        String kitab = getIntent().getStringExtra(EXTRA_KITAB);
        String kategori = getIntent().getStringExtra(EXTRA_KATEGORI);
        String gambar = getIntent().getStringExtra(EXTRA_GAMBAR);
        String detill = getIntent().getStringExtra(EXTRA_DETAIL);
        String pesantren = getIntent().getStringExtra(EXTRA_PESANTREN);

        tvKitab.setText(kitab);
        tvKategori.setText(kategori);
        detailTxt.setText(detill);
        pesantrenTxt.setText(pesantren);
        Glide.with(DetailKitabActivity.this)
                .load(gambar).apply(new RequestOptions()
                .override(350, 550))
                .into(gambarKitab);
    }
}
