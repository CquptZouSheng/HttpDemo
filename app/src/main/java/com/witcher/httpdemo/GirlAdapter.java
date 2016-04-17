package com.witcher.httpdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Zou Sheng on 2016/4/17.
 */
public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.MyViewHolder> {
    private List<Girl> list;
    public GirlAdapter(List<Girl> list){
        this.list=list;
    }
    @Override
    public GirlAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.girlitem,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.girl.setImageBitmap(list.get(position).getGirl());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView girl;
        public MyViewHolder(View itemView) {
            super(itemView);
            girl= (ImageView) itemView.findViewById(R.id.girl);
        }
    }
}
