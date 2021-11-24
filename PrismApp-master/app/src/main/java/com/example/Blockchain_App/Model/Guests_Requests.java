package com.example.Blockchain_App.Model;

public class Guests_Requests {
    private String guest_name;
    private String Img_url;

    public Guests_Requests(String guest_name, String img_url) {
        this.guest_name = guest_name;
        Img_url = img_url;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public String getImg_url() {
        return Img_url;
    }

    public void setImg_url(String img_url) {
        Img_url = img_url;
    }
}
