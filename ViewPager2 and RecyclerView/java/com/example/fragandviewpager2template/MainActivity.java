package com.example.fragandviewpager2template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ContentData> contentList;
    private ContentAdapter contentAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        contentList = getContentList();
        contentAdapter = new ContentAdapter(contentList);
        recyclerView.setAdapter(contentAdapter);

    }


    /*---------------------예시를 위해 만들어 놓은 메소드(실제로는 필요X)------------------------*/

    public ArrayList<ContentData> getContentList(){

        ArrayList<ContentData> contentList = new ArrayList<ContentData>();

        ContentData contentData1 = new ContentData(R.drawable.img_profile,"shin__seok",getViewPageAdapter1(),"namzizzang님 외 43명이 좋아합니다.","shin__seok","라오스 풍경","2021년 1월 24일");
        ContentData contentData2 = new ContentData(R.drawable.img_profile,"shin__seok",getViewPageAdapter2(),"ggeunhyeok님 외 59명이 좋아합니다.","shin__seok","강릉 여행","2021년 1월 24일");
        ContentData contentData3 = new ContentData(R.drawable.img_profile,"shin__seok",getViewPageAdapter3(),"ggeunhyeok님 외 49명이 좋아합니다.","shin__seok","합천 여행","2021년 1월 24일");

        contentList.add(contentData1);
        contentList.add(contentData2);
        contentList.add(contentData3);

        return contentList;
    }


    public ViewPageAdapter getViewPageAdapter1(){

        ViewPageAdapter viewPageAdapter;

        ArrayList<ImageContentData> imageList = new ArrayList<ImageContentData>();

        ImageContentData imageContentData1 = new ImageContentData(R.drawable.img_laos1);
        ImageContentData imageContentData2 = new ImageContentData(R.drawable.img_laos2);
        ImageContentData imageContentData3 = new ImageContentData(R.drawable.img_laos3);
        ImageContentData imageContentData4 = new ImageContentData(R.drawable.img_laos4);

        imageList.add(imageContentData1);
        imageList.add(imageContentData2);
        imageList.add(imageContentData3);
        imageList.add(imageContentData4);

        viewPageAdapter = new ViewPageAdapter(imageList);

        return viewPageAdapter;
    }

    public ViewPageAdapter getViewPageAdapter2(){

        ViewPageAdapter viewPageAdapter;

        ArrayList<ImageContentData> imageList = new ArrayList<ImageContentData>();

        ImageContentData imageContentData1 = new ImageContentData(R.drawable.img_gangneung1);
        ImageContentData imageContentData2 = new ImageContentData(R.drawable.img_gangneung2);

        imageList.add(imageContentData1);
        imageList.add(imageContentData2);

        viewPageAdapter = new ViewPageAdapter(imageList);

        return viewPageAdapter;
    }

    public ViewPageAdapter getViewPageAdapter3(){

        ViewPageAdapter viewPageAdapter;

        ArrayList<ImageContentData> imageList = new ArrayList<ImageContentData>();

        ImageContentData imageContentData1 = new ImageContentData(R.drawable.img_hapcheon1);
        ImageContentData imageContentData2 = new ImageContentData(R.drawable.img_hapcheon2);

        imageList.add(imageContentData1);
        imageList.add(imageContentData2);

        viewPageAdapter = new ViewPageAdapter(imageList);

        return viewPageAdapter;
    }

}
