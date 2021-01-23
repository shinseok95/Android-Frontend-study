package com.example.fragandviewpager2template;

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
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;

/**
 * Viewpager를 포함한 Recyclerview의 adapter 및 viewholder
 * viewpager를 표현하기 위해서, 앞서 구현한 ViewPagerAdapter를 setAdapter 메소드로 등록해주면 된다.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {

    private ArrayList<ContentData> contentList;

    public ContentAdapter(ArrayList<ContentData> contentList) {
        this.contentList = contentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ContentData contentData = contentList.get(position);

        holder.img_profile.setImageResource(contentData.getImg_profile());
        holder.text_profile_name.setText(contentData.getText_profile_name());
        holder.viewPager2.setAdapter(contentData.getViewPagerAdapter());
        holder.text_favorite.setText(contentData.getText_favorite());
        holder.text_content_name.setText(contentData.getText_content_name());
        holder.text_content.setText(contentData.getText_content());
        holder.text_date.setText(contentData.getText_date());

        // ViewPagerAdapter의 getItemCount() 메소드를 통해 indicator의 수를 정해준다.
        holder.indicator.createIndicators(contentData.getViewPagerAdapter().getItemCount(),0);

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

    @Override
    public int getItemCount() {

        if(contentList !=null)
            return contentList.size();
        else
            return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        protected ImageView img_profile;
        protected TextView text_profile_name;
        protected ViewPager2 viewPager2;
        protected TextView text_favorite;
        protected TextView text_content_name;
        protected TextView text_content;
        protected TextView text_date;
        protected CircleIndicator3 indicator;

        /**
         * indicator는 viewpager를 등록해주면 된다.
         */

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.img_profile = (ImageView)itemView.findViewById(R.id.img_profile);
            this.text_profile_name = (TextView) itemView.findViewById(R.id.text_profile_name);
            this.viewPager2 = (ViewPager2)itemView.findViewById(R.id.viewpager);
            this.text_favorite = (TextView) itemView.findViewById(R.id.text_favorite);
            this.text_content_name = (TextView) itemView.findViewById(R.id.text_content_name);
            this.text_content = (TextView) itemView.findViewById(R.id.text_content);
            this.text_date = (TextView) itemView.findViewById(R.id.text_date);
            indicator = (CircleIndicator3)itemView.findViewById(R.id.indicator);
            indicator.setViewPager(viewPager2);

            this.viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
            this.viewPager2.setCurrentItem(0);
            this.viewPager2.setOffscreenPageLimit(3);

            this.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels);

                    if(positionOffsetPixels == 0)
                        viewPager2.setCurrentItem(position);
                }

                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    indicator.animatePageSelected(position);
                }
            });

            img_profile.setBackground(new ShapeDrawable(new OvalShape()));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                img_profile.setClipToOutline(true);
            }
        }
    }
}
