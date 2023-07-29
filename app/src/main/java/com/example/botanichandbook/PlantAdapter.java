package com.example.botanichandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Plant>  plants;

    public PlantAdapter(Context context, List<Plant>  plants)
    {
        this.inflater = LayoutInflater.from(context);
        this.plants = plants;
    }

    @Override
    public PlantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlantAdapter.ViewHolder holder, int position) {
        Plant plant = plants.get(position);
        holder.plantView.setImageResource(plant.getPlantResource());
        holder.nameView.setText(plant.getName());
        holder.plantDescriptionView.setText(plant.getPlantDescription());
    }


    @Override
    public int getItemCount() {
        return plants.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        final ImageView plantView;
        final TextView nameView, plantDescriptionView;

        ViewHolder(View view)
        {
            super(view);

            plantView = view.findViewById(R.id.plantResource);
            nameView = view.findViewById(R.id.name);
            plantDescriptionView = view.findViewById(R.id.plantDescription);
        }
    }
}
