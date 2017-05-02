package com.example.abidg.bagian_forum.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abidg.bagian_forum.R;

/**
 * Created by abidg on 5/2/2017.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder {
    public TextView personName;
    public TextView personAddress;
    public ImageView personPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        personName = (TextView)itemView.findViewById(R.id.person_name);
        personAddress = (TextView)itemView.findViewById(R.id.person_address);
        personPhoto = (ImageView)itemView.findViewById(R.id.circleView);
    }
}

