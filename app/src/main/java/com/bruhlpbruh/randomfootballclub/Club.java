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

    public void setLogoClub(int logoClub) {
        this.logoClub = logoClub;
    }

    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }
}
