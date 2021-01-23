package com.example.fragandviewpager2template;

/**
 * Viewpager를 포함한 객체는 일반적인 Recyclerview를 위한 Data 객체와는 다르다.
 * Viewpager에 데이터를 전달하기 위해, Viewpager에 대한 id값을 가지고있는 것이 아닌 ViewPagerAdapter를 가지고 있어야한다.
 */

public class ContentData {

    private int img_profile;
    private String text_profile_name;
    private ViewPageAdapter viewPagerAdapter;
    private String text_favorite;
    private String text_content_name;
    private String text_content;
    private String text_date;

    public ContentData(int img_profile, String text_profile_name, ViewPageAdapter viewPagerAdapter, String text_favorite, String text_content_name, String text_content, String text_date) {
        this.img_profile = img_profile;
        this.text_profile_name = text_profile_name;
        this.viewPagerAdapter = viewPagerAdapter;
        this.text_favorite = text_favorite;
        this.text_content_name = text_content_name;
        this.text_content = text_content;
        this.text_date = text_date;
    }

    public int getImg_profile() {
        return img_profile;
    }

    public void setImg_profile(int img_profile) {
        this.img_profile = img_profile;
    }

    public String getText_profile_name() {
        return text_profile_name;
    }

    public void setText_profile_name(String text_profile_name) {
        this.text_profile_name = text_profile_name;
    }

    public ViewPageAdapter getViewPagerAdapter() {
        return viewPagerAdapter;
    }

    public void setViewPagerAdapter(ViewPageAdapter viewPagerAdapter) {
        this.viewPagerAdapter = viewPagerAdapter;
    }

    public String getText_favorite() {
        return text_favorite;
    }

    public void setText_favorite(String text_favorite) {
        this.text_favorite = text_favorite;
    }

    public String getText_content_name() {
        return text_content_name;
    }

    public void setText_content_name(String text_content_name) {
        this.text_content_name = text_content_name;
    }

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public String getText_date() {
        return text_date;
    }

    public void setText_date(String text_date) {
        this.text_date = text_date;
    }
}
