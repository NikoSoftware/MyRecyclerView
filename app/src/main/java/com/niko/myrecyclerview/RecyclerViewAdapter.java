package com.niko.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Niko on 2016/4/27.
 */
public class RecyclerViewAdapter extends BaseRecyclerViewAdapter<String> {


    public RecyclerViewAdapter(Context context,List<String> list){
        super(context, list, new HashMap<Integer, Integer[]>() {
            {
              put(  R.layout.item_view,new Integer[]{
                      R.id.imageview,R.id.textview
              });
            }
        });


    }


    @Override
    public int getItemViewType(int position) {
        return R.layout.item_view;
    }

    @Override
    public void onBind(BaseViewHandle holder, int position, String obj, int viewType) {

        ImageView imageView = (ImageView) holder.getView(R.id.imageview);
        TextView textView  = (TextView) holder.getView(R.id.textview);
        imageView.setImageResource(R.mipmap.ic_launcher);
        textView.setText(obj);
    }



}
