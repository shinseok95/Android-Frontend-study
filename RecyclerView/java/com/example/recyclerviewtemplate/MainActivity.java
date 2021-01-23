package com.example.recyclerviewtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<BoardContentData> boardList;
    private BoardAdapter boardAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        boardList =  setTempContent();

        boardAdapter = new BoardAdapter(boardList);
        recyclerView.setAdapter(boardAdapter);

        // content 사이에 구분선 넣기
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
    }

    public ArrayList<BoardContentData> setTempContent(){

        /**
         * 예시 데이터
         */

        ArrayList<BoardContentData> boardContentList = new ArrayList<BoardContentData>();

        BoardContentData boardContentData1 = new BoardContentData(R.drawable.img_profile, R.drawable.img_iu, "신석이","2021.1.23","새로 산 노트북 후기","어제 주문한 노트북이 오늘 배송왔다.",10,6);
        BoardContentData boardContentData2 = new BoardContentData(R.drawable.img_profile, R.drawable.img_river, "신석이","2021.1.23","오랜만에 가본 한강","어제 오랜만에 팔당 스타벅스에 가서 커피를 마셨다",8,12);
        BoardContentData boardContentData3 = new BoardContentData(R.drawable.img_profile, R.drawable.img_cat, "신석이","2021.1.23","카롱이랑 놀아주는 건 너무 힘들어 ㅠㅠ","친구가 고양이를 키우게 됐다고 한다.",16,5);

        boardContentList.add(boardContentData1);
        boardContentList.add(boardContentData2);
        boardContentList.add(boardContentData3);

        return boardContentList;
    }
}
