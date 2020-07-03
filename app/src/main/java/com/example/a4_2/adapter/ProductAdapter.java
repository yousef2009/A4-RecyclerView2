package com.example.a4_2.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a4_2.R;
import com.example.a4_2.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.myViewHolder> {

    private Activity activity;
    private ArrayList<Product> data;

    public ProductAdapter(Activity activity, ArrayList<Product> data) {
        this.activity = activity;
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(activity).inflate(R.layout.product_item, parent, false);
        return new myViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.image.setImageResource(data.get(position).getImage());
        holder.tvDescription.setText(data.get(position).getDescription());
        holder.tvSpecifications.setText(data.get(position).getSpecifications());
        holder.tvRate.setText(String.valueOf(data.get(position).getRate()));
        holder.tvPrice.setText(String.valueOf(data.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView tvDescription;
        public TextView tvSpecifications;
        public TextView tvRate;
        public TextView tvPrice;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivPhoto);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvSpecifications = itemView.findViewById(R.id.tvSpecification);
            tvRate = itemView.findViewById(R.id.tvRate);
            tvPrice = itemView.findViewById(R.id.tvPrice);

        }
    }
}
