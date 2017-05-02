package com.example.abidg.bagian_forum;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.abidg.bagian_forum.Object.ItemObject;
import com.example.abidg.bagian_forum.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Card_and_Recycle extends AppCompatActivity {

    private LinearLayoutManager lLayout;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_and__recycle);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(this);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(context, rowListItem);
        rView.setAdapter(rcAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_refresh){
            Toast.makeText(context, "Refresh App", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
            Toast.makeText(context, "Create Text", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Peter James", "Vildansvagen 19, Lund Sweden", R.drawable.face));
        allItems.add(new ItemObject("Henry Jacobs", "3 Villa Crescent London, UK", R.drawable.face));
        allItems.add(new ItemObject("Bola Olumide", "Victoria Island Lagos, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Chidi Johnson", "New Heaven Enugu, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("DeGordio Puritio", "Italion Gata, Padova, Italy", R.drawable.face));
        allItems.add(new ItemObject("Gary Cook", "San Fransisco, United States", R.drawable.face));
        allItems.add(new ItemObject("Edith Helen", "Queens Crescent, New Zealand", R.drawable.face));
        allItems.add(new ItemObject("Kingston Dude", "Ivory Lane, Abuja, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Edwin Bent", "Johnson Road, Port Harcourt, Nigeria", R.drawable.face));
        allItems.add(new ItemObject("Grace Praise", "Federal Quarters, Abuja Nigeria", R.drawable.face));

        return allItems;
    }
}
