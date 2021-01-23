package com.example.fragandviewpager2template;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * ViewPager2는 내부적으로 RecyclerView로 구현되어있다.
 * 그러므로, ViewPager2에서 보여질 View는 RecyclerView를 구현하는 것과 동일하게 viewholder와 adapter을 통해 하면된다.
 * 현재는 Viewpager에서 이미지만 보여지기 때문에, imageview만 설정하면 된다.
 */

public class ViewPageAdapter extends RecyclerView.Adapter<ViewPageAdapter.ViewHolderPage> {

    private ArrayList<ImageContentData> imageList;

    public ViewPageAdapter(ArrayList<ImageContentData> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public ViewHolderPage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item_list,parent,false);
        ViewHolderPage holder = new ViewHolderPage(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPage holder, int position) {

        ImageContentData imageContentData = imageList.get(position);

        holder.img_content.setImageResource(imageContentData.getImg_content());
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {

        if(imageList!=null)
            return imageList.size();
        else
            return 0;
    }

    public class ViewHolderPage extends RecyclerView.ViewHolder{

        protected ImageView img_content;

        public ViewHolderPage(@NonNull View itemView) {
            super(itemView);

            img_content = (ImageView)itemView.findViewById(R.id.img_content);
        }
    }
}
