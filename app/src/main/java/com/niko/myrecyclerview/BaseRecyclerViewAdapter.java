package com.niko.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;
import java.util.Map;

/**
 * Created by Niko on 2016/4/27.
 */
public abstract class BaseRecyclerViewAdapter<T> extends RecyclerView.Adapter<BaseViewHandle> {
    protected Context context;
    protected  int size;
    protected List<T> list;
    protected Map<Integer,Integer[]> map;

    public BaseRecyclerViewAdapter(Context context,List<T> list,Map<Integer, Integer[]> map){
        this.context= context;
        this.list =list;
        size = list.size();
        this.map = map;

    }

    @Override
    public BaseViewHandle onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(viewType,parent,false);

        return new BaseViewHandle(view,map.get(viewType));
    }

    @Override
    public void onBindViewHolder(BaseViewHandle holder, int position) {

        onBind(holder,position,list.get(position),getItemViewType(position));
    }

    public abstract void onBind(BaseViewHandle holder, int position,T obj,int viewType);

    @Override
    public int getItemCount() {
        return size;
    }
}
