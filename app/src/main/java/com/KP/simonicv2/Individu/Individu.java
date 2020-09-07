package com.KP.simonicv2.Individu;

import android.os.Parcel;
import android.os.Parcelable;

public class Individu implements Parcelable {
    String nama;
    String wilayah;
    String alamat;

    public String getKey() {
        return key;
    }
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Individu(){
    }
    public void setKey(String key) {
        this.key = key;
    }

    String key;
    public Individu(String nama, String wilayah){
        this.nama = nama;
        this.wilayah = wilayah;
    }
    protected Individu(Parcel in) {
        nama = in.readString();
        wilayah = in.readString();
    }

    public static final Creator<Individu> CREATOR = new Creator<Individu>() {
        @Override
        public Individu createFromParcel(Parcel in) {
            return new Individu(in);
        }

        @Override
        public Individu[] newArray(int size) {
            return new Individu[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(wilayah);
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

}