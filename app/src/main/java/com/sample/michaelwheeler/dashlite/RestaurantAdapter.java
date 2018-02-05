package com.sample.michaelwheeler.dashlite;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sample.michaelwheeler.dashlite.objects.Restaurant;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Wheeler on 2/5/2018.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.DiscoverViewHolder> {

    List<Restaurant> mRestaurants = new ArrayList<>();
    Context mContext;

    public RestaurantAdapter(List<Restaurant> restaurants, Context context) {
        this.mRestaurants = restaurants;
        this.mContext = context;
    }

    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup restaurantsView = (ViewGroup) mInflater.inflate(R.layout.restaurant_list_item, parent, false);
        return new DiscoverViewHolder(restaurantsView);
    }

    @Override
    public void onBindViewHolder(final DiscoverViewHolder holder, int position) {
        final Restaurant restaurant = mRestaurants.get(position);
        Picasso.with(mContext)
                .load(restaurant.getCoverImgUrl())
                .into(holder.imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        holder.tital.setText(restaurant.getName());
                        holder.description.setText(restaurant.getDescription());
                        holder.closingTime.setText(restaurant.getStatus());
                    }

                    @Override
                    public void onError() {

                    }
                });
        if (position%2 == 0){
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.lightGrey));
        } else {
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.white));
        }
    }

    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

    static class DiscoverViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tital;
        TextView description;
        TextView closingTime;
        View root;


        DiscoverViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.restaurant_image);
            tital = itemView.findViewById(R.id.restaurant_name);
            description = itemView.findViewById(R.id.restaurant_description);
            closingTime = itemView.findViewById(R.id.restaurant_closing_time);
            root = itemView.findViewById(R.id.restaurant_root);
        }
    }
}
