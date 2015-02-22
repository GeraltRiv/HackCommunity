package com.hackcommunity.hackcommunity.model;

import android.graphics.drawable.Drawable;

/**
 * Created by taras on 22.02.2015.
 */
public class FoodOrHost {

    Drawable picture;
    String title;

    public FoodOrHost(Drawable picture, String title) {
        this.picture = picture;
        this.title = title;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
