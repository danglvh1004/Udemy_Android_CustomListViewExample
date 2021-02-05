package com.example.customlistviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvProducts;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts = findViewById(R.id.lvProducts);

        list = new ArrayList<Product>();

        Product product1 = new Product("Dell Latitude 3500",
                "The world's most secure, most manageable and most reliable bussiness-class laptops.",
                "Laptop",
                14500.99,
                true);
        Product product2 = new Product("Acer Aspire 7",
                "Revolutionary convertible computers that feature powerful innovation and forward-thinking design.",
                "Laptop",
                12500.99,
                true);
        Product product3 = new Product("SANDISK 16 GB Cruzer",
                "Low-cost, no-nonsense way of storing and transporting files.",
                "Memory",
                299.99,
                false);
        Product product4 = new Product("Verbatim 1TB",
                "Verbatim's portable hard drive product offerings are exceptionally reliable and fashionably thin.",
                "HDD",
                1020.99,
                false);

        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        ProductAdapter adapter = new ProductAdapter(this, list);

        lvProducts.setAdapter(adapter);
    }
}