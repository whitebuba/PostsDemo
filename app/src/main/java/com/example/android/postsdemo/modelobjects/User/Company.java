package com.example.android.postsdemo.modelobjects.User;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by danielbeleza on 20/10/2017.
 */

public class Company implements Parcelable {
    private String mName;
    private String mCatchPhrase;
    private String mBS;

    public Company(String mName, String mCatchPhrase, String mBS) {
        this.mName = mName;
        this.mCatchPhrase = mCatchPhrase;
        this.mBS = mBS;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mName);
        dest.writeString(this.mCatchPhrase);
        dest.writeString(this.mBS);
    }

    public Company() {
    }

    protected Company(Parcel in) {
        this.mName = in.readString();
        this.mCatchPhrase = in.readString();
        this.mBS = in.readString();
    }

    public static final Parcelable.Creator<Company> CREATOR = new Parcelable.Creator<Company>() {
        @Override
        public Company createFromParcel(Parcel source) {
            return new Company(source);
        }

        @Override
        public Company[] newArray(int size) {
            return new Company[size];
        }
    };
}