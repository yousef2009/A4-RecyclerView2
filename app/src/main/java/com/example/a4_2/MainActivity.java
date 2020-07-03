package com.example.a4_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a4_2.adapter.ProductAdapter;
import com.example.a4_2.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvProduct = findViewById(R.id.rvProducts);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rvProduct.setLayoutManager(manager);

        ArrayList<Product> data = new ArrayList<>();
        data.add(new Product(R.drawable.ic_1,
                "GeoFlex3  2-in-1 Laptop Touchscreen Windows 10 Full HD Convertible Intel Pentium 4GB Ram 64GB eMMC Meta",
                "13.3 inch, Sliver, 1.35Kg", 4.3, 1200));

        data.add(new Product(R.drawable.ic_2,
                "GeoFlex3  2-in-1 Laptop Touchscreen Windows 10 Full HD Convertible Intel Pentium 4GB Ram 64GB eMMC Meta",
                "13.3 inch, Sliver, 1.35Kg", 4.3, 1200));

        data.add(new Product(R.drawable.ic_3,
                "GeoFlex3  2-in-1 Laptop Touchscreen Windows 10 Full HD Convertible Intel Pentium 4GB Ram 64GB eMMC Meta",
                "13.3 inch, Sliver, 1.35Kg", 4.3, 1200));

        ProductAdapter adapter = new ProductAdapter(this, data);

        rvProduct.setAdapter(adapter);

    }
}