package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<RecyclerViewItem> items;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    RecyclerViewAdapter(Context context, ArrayList<RecyclerViewItem> items, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.scientificName.setText(items.get(position).getScientificName());
        holder.orderOfFungi.setText(items.get(position).getOrderOfFungi());
        holder.culinaryStatus.setText(items.get(position).getCulinaryStatus());
        holder.heightInCentimeters.setText("Ca "+items.get(position).getHeightInCentimeters()+" cm hög");
        holder.widthInCentimeters.setText("Ca "+items.get(position).getWidthInCentimeters()+" cm bred");
        holder.colorPattern.setText(items.get(position).getColorPattern());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView scientificName;
        TextView orderOfFungi;
        TextView culinaryStatus;
        TextView heightInCentimeters;
        TextView widthInCentimeters;
        TextView colorPattern;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
            scientificName = itemView.findViewById(R.id.scientificName);
            orderOfFungi = itemView.findViewById(R.id.orderOfFungi);
            culinaryStatus = itemView.findViewById(R.id.culinaryStatus);
            heightInCentimeters = itemView.findViewById(R.id.heightInCentimeters);
            widthInCentimeters = itemView.findViewById(R.id.widthInCentimeters);
            colorPattern = itemView.findViewById(R.id.colorPattern);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(items.get(getAdapterPosition()));
        }
    }

    public void updateData(ArrayList<RecyclerViewItem> newItems){
        items.clear();
        items.addAll(newItems);
        notifyDataSetChanged();

    }

    public interface OnClickListener {
        void onClick(RecyclerViewItem item);
    }
}