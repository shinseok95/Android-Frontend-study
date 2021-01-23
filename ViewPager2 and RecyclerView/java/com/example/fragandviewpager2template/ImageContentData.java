package com.example.fragandviewpager2template;

public class ImageContentData {

    /**
     * Viewpager에서 보여질 imageview에 대한 데이터
     */

    protected int img_content;

    public ImageContentData(int img_content) {
        this.img_content = img_content;
    }

    public int getImg_content() {
        return img_content;
    }

    public void setImg_content(int img_content) {
        this.img_content = img_content;
    }
}
