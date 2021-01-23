package com.example.recyclerviewtemplate;

public class BoardContentData {

    private int img_profile;
    private int img_content;

    private String text_name;
    private String text_date;
    private String text_title;
    private String text_content;
    private int text_favorite_count;
    private int text_speech_count;

    public BoardContentData(int img_profile, int img_content, String text_name, String text_date, String text_title, String text_content, int text_favorite_count, int text_speech_count) {
        this.img_profile = img_profile;
        this.img_content = img_content;
        this.text_name = text_name;
        this.text_date = text_date;
        this.text_title = text_title;
        this.text_content = text_content;
        this.text_favorite_count = text_favorite_count;
        this.text_speech_count = text_speech_count;
    }

    public int getImg_profile() {
        return img_profile;
    }

    public void setImg_profile(int img_profile) {
        this.img_profile = img_profile;
    }

    public int getImg_content() {
        return img_content;
    }

    public void setImg_content(int img_content) {
        this.img_content = img_content;
    }

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    public String getText_date() {
        return text_date;
    }

    public void setText_date(String text_date) {
        this.text_date = text_date;
    }

    public String getText_title() {
        return text_title;
    }

    public void setText_title(String text_title) {
        this.text_title = text_title;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public int getText_favorite_count() {
        return text_favorite_count;
    }

    public void setText_favorite_count(int text_favorite_count) {
        this.text_favorite_count = text_favorite_count;
    }

    public int getText_speech_count() {
        return text_speech_count;
    }

    public void setText_speech_count(int text_speech_count) {
        this.text_speech_count = text_speech_count;
    }
}
