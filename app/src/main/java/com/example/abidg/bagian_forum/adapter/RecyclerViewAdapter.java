package com.example.abidg.bagian_forum.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abidg.bagian_forum.Object.ItemObject;
import com.example.abidg.bagian_forum.R;

import java.util.List;

/**
 * Created by abidg on 5/2/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.personAddress.setText(itemList.get(position).getAddress());
        holder.personPhoto.setImageResource(itemList.get(position).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}