package com.example.customnavitemplate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private View drawerView;
    private ImageView naviImg;
    private Toolbar toolbar;

    // Navigation 리스너
    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {

        //슬라이드 했을 때
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }
        //오픈이 완료됐을 때
        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }
        //닫혔을 때
        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }
        //상태가 변했을 때
        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){

        drawerLayout = (DrawerLayout)findViewById(R.id.layout_drawer);
        drawerView = (View)findViewById(R.id.view_drawer);
        naviImg = (ImageView) findViewById(R.id.btn_navigation_open);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        // Navigation 버튼 클릭시 Open
        naviImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });

    }


}
