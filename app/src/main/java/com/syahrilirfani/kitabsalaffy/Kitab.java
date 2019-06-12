package com.syahrilirfani.kitabsalaffy;

import android.os.Parcel;
import android.os.Parcelable;

public class Kitab implements Parcelable {
    private String kitab;
    private String kategori;
    private String gambar;
    private String deskripsi;
    private String pesantren;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPesantren() {
        return pesantren;
    }

    public void setPesantren(String pesantren) {
        this.pesantren = pesantren;
    }



    public String getKitab() {
        return kitab;
    }

    public void setKitab(String kitab) {
        this.kitab = kitab;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kitab);
        dest.writeString(this.kategori);
        dest.writeString(this.gambar);
        dest.writeString(this.deskripsi);
        dest.writeString(this.pesantren);
    }

    public Kitab() {
    }

    protected Kitab(Parcel in) {
        this.kitab = in.readString();
        this.kategori = in.readString();
        this.gambar = in.readString();
        this.deskripsi = in.readString();
        this.pesantren = in.readString();
    }

    public static final Parcelable.Creator<Kitab> CREATOR = new Parcelable.Creator<Kitab>() {
        @Override
        public Kitab createFromParcel(Parcel source) {
            return new Kitab(source);
        }
        @Override
        public Kitab[] newArray(int size) {
            return new Kitab[size];
        }
    };

}
