package com.sample.michaelwheeler.dashlite;

import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sample.michaelwheeler.dashlite.objects.Restaurant;
import com.sample.michaelwheeler.dashlite.restcalls.GetCalls;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetRestaurantsTask runner = new GetRestaurantsTask();
        runner.execute();

        recyclerView = findViewById(R.id.display_recycler_view);

        // Layout
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);


    }

    private class GetRestaurantsTask extends AsyncTask<Void, Void ,Void> {

        List<Restaurant> restaurants = new ArrayList<>();

        @Override
        protected Void doInBackground(Void... params) {
            try {
                restaurants = GetCalls.getRestaurantList("37.422740", "-122.139956");
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            updateList(restaurants);
        }

    }

    private void updateList( List<Restaurant> restaurants ){
        RestaurantAdapter adapter = new RestaurantAdapter(restaurants, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}
