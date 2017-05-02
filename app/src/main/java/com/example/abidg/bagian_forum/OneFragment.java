package com.example.abidg.bagian_forum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.abidg.bagian_forum.Object.ItemObject;
import com.example.abidg.bagian_forum.R;
import com.example.abidg.bagian_forum.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abidg on 5/2/2017.
 */

public class OneFragment extends Fragment {

    private LinearLayoutManager lLayout;
    Context context = getContext();

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_one, container, false);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(context);

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(context, rowListItem);
        rView.setAdapter(rcAdapter);

        return view;
    }


    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Tahukah Anda Bahaya Makan Cepat?", "Vildansvagen 19, Lund Sweden", R.drawable.face));
        allItems.add(new ItemObject("Pernahkan Anda Melihat Kecepatan Cahaya", "3 Villa Crescent London, UK", R.drawable.face));
        allItems.add(new ItemObject("10 Permainan Yang Menegangkan", "Victoria Island Lagos, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Percobaan Tergila Yang Pernah Dilakukan Manusia", "New Heaven Enugu, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("15 Film Terbaik Sepanjang Sejarah", "Italion Gata, Padova, Italy", R.drawable.face));
        allItems.add(new ItemObject("Makanan Terenak Yang Tidak Semua Orang Tahy", "San Fransisco, United States", R.drawable.face));
        allItems.add(new ItemObject("Melihat Ke Dalam Dunia Buatan Disney", "Queens Crescent, New Zealand", R.drawable.face));
        allItems.add(new ItemObject("Marvel VS DC? Lihat Disini Kisahnya", "Ivory Lane, Abuja, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Ketika Batman Kehabisan Duit", "Johnson Road, Port Harcourt, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Tumbuhan Yang Terlupakan Selama Hidupnya", "Federal Quarters, Abuja Nigeria", R.drawable.face));

        return allItems;
    }
}
