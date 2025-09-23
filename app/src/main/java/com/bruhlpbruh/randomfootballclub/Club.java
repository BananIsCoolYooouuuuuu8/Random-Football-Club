package com.bruhlpbruh.randomfootballclub;

import android.graphics.drawable.Drawable;

public class Club {
    private int logoClub;
    private String nameClub;

    public Club(int logoClub, String nameClub) {
        this.logoClub = logoClub;
        this.nameClub = nameClub;
    }

    public int getLogoClub() {
        return logoClub;
    }

    public String getNameClub() {
        return nameClub;
    }
}
