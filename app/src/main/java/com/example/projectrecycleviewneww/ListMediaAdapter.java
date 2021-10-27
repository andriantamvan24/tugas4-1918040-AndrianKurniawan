package com.example.projectrecycleviewneww;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMediaAdapter extends RecyclerView.Adapter<ListMediaAdapter.ListViewHolder>{
    private ArrayList<Media> listMedia;

    public ListMediaAdapter(ArrayList<Media> list){
        this.listMedia = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_media,parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Media media = listMedia.get(position);
        Glide.with(holder.itemView.getContext())
                .load(media.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(media.getName());
        holder.tvDetail.setText(media.getDetail());
    }

    @Override
    public int getItemCount() {
        return listMedia.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvDetail;
        ListViewHolder(@NonNull View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_media);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}
