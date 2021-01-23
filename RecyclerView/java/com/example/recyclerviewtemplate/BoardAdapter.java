package com.example.recyclerviewtemplate;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder> {

    private List<BoardContentData> arrayList;

    public BoardAdapter(ArrayList<BoardContentData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        BoardContentData boardContentData = arrayList.get(position);

        holder.img_profile.setImageResource(boardContentData.getImg_profile());
        holder.img_content.setImageResource(boardContentData.getImg_content());

        holder.text_name.setText(boardContentData.getText_name());
        holder.text_date.setText(boardContentData.getText_date());
        holder.text_title.setText(boardContentData.getText_title());
        holder.text_content.setText(boardContentData.getText_content());
        holder.text_favorite_count.setText(String.valueOf(boardContentData.getText_favorite_count()));
        holder.text_speech_count.setText(String.valueOf(boardContentData.getText_speech_count()));

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                /**
                 *  클릭시, 필요한 작업 넣기
                 */
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                /**
                 *  롱클릭시, 필요한 작업 넣기
                 */
                return true;
            }
        });
    }


    public void removeItem(int position){

        /**
         * 삭제를 원할시 호출
         */
        try{

            arrayList.remove(position);

            // notify란, 새로고침을 의미함
            notifyItemRemoved(position);

        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {

        if(arrayList != null)
            return arrayList.size();
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        protected ImageView img_profile;
        protected ImageView img_content;

        protected TextView text_name;
        protected TextView text_date;
        protected TextView text_title;
        protected TextView text_content;
        protected TextView text_favorite_count;
        protected TextView text_speech_count;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.img_profile = (ImageView)itemView.findViewById(R.id.img_profile);
            this.img_content = (ImageView)itemView.findViewById(R.id.img_content);

            this.text_name = (TextView)itemView.findViewById(R.id.text_name);
            this.text_date = (TextView)itemView.findViewById(R.id.text_date);
            this.text_title = (TextView)itemView.findViewById(R.id.text_title);
            this.text_title = (TextView)itemView.findViewById(R.id.text_title);
            this.text_content = (TextView)itemView.findViewById(R.id.text_content);
            this.text_favorite_count = (TextView)itemView.findViewById(R.id.text_favorite_count);
            this.text_speech_count = (TextView)itemView.findViewById(R.id.text_speech_count);

            // 프로필 사진 둥글게 하기
            img_profile.setBackground(new ShapeDrawable(new OvalShape()));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                img_profile.setClipToOutline(true);
            }
        }
    }
}
