package com.sample.michaelwheeler.dashlite.restcalls;

import android.util.JsonReader;
import android.util.Log;

import com.sample.michaelwheeler.dashlite.objects.Restaurant;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Michael Wheeler on 2/3/2018.
 */

public class GetCalls {

    private static final String URL_ROOT = "https://api.doordash.com/v2/restaurant/";
    private static final String SEARCH_POINT = "?lat=##LAT##&lng=##LNG##";
    private static final String LAT_PLACE_HOLDER = "##LAT##";
    private static final String LNG_PLACE_HOLDER = "##LNG##";

    /**
     * Stub method to visualize flow as real calls are crafted
     *
     * @throws IOException
     */
    public static List<Restaurant> getRestaurantList(String lat, String lng) throws IOException, JSONException {
        List<Restaurant> Restaurants = new ArrayList<>();
        String compleateURL = URL_ROOT + SEARCH_POINT.replace(LAT_PLACE_HOLDER, lat).replace(LNG_PLACE_HOLDER, lng);
        URL urlEndpoint = new URL(compleateURL);

        HttpsURLConnection myConnection = (HttpsURLConnection) urlEndpoint.openConnection();

        //headers
        myConnection.setRequestProperty("Accept", "application/json");

        if (myConnection.getResponseCode() == 200) {
            InputStream inputStream = myConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder total = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                total.append(line).append('\n');
            }

            Restaurants = buildRestaurantsList(total.toString());
            myConnection.disconnect();
        } else {
            // Error handling code goes here
        }

        return Restaurants;

    }

    private static List<Restaurant> buildRestaurantsList(String json) throws IOException, JSONException {
        List<Restaurant> Restaurants = new ArrayList<>();

        JSONArray jsonRestaurantArray = new JSONArray(json);
        for (int x = 0; x < jsonRestaurantArray.length(); x++ )  {
            Restaurants.add(Restaurant.buildFromJSONObject(jsonRestaurantArray.getJSONObject(x)));
        }
        return Restaurants;
    }
}
