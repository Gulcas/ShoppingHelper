package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //onClickListener for VegetablesActivity
        TextView vegetables = findViewById(R.id.vegetables);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, VegetablesActivity.class);
                startActivity(intent);
            }
        });
        ImageView vegetablesImage = findViewById(R.id.vegetablesImage);
        vegetablesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                    Intent intent = new Intent(MainActivity.this, VegetablesActivity.class);
                    startActivity(intent);
        }
        });

        //onClickListener for FruitsActivity
        TextView fruits = findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, FruitsActivity.class);
                startActivity(intent);
            }
        });
        ImageView fruitsImage = findViewById(R.id.fruitsImage);
        fruitsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, FruitsActivity.class);
                startActivity(intent);
            }
        });

        //onClickListener for drinks
        TextView drinks = findViewById(R.id.drinks);
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(intent);
            }
        });
        ImageView drinksImage = findViewById(R.id.drinksImage);
        drinksImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(intent);
            }
        });

        //onClickListener for bakery
        TextView bakery = findViewById(R.id.bakery);
        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, BakeryActivity.class);
                startActivity(intent);
            }
        });
        ImageView bakeryImage = findViewById(R.id.bakeryImage);
        bakeryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, BakeryActivity.class);
                startActivity(intent);
            }
        });

        //TODO finish with the rest of the activities
        //onClickListener for other
        TextView other = findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
//                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
////                startActivity(intent);
                Toast.makeText(MainActivity.this, R.string.notReady, Toast.LENGTH_SHORT).show();
            }
        });
        ImageView otherImage = findViewById(R.id.otherImage);
        otherImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
//                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
//                startActivity(intent);
                Toast.makeText(MainActivity.this, R.string.notReady, Toast.LENGTH_SHORT).show();
            }
        });

        //onClickListener for summary -----------------------------------------------------DONE
        TextView summary = findViewById(R.id.summary);
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, Summary.class);
                startActivity(intent);
            }
        });
        ImageView summaryImage = findViewById(R.id.summaryImage);
        summaryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(MainActivity.this, Summary.class);
                startActivity(intent);
            }
        });

    }
}
