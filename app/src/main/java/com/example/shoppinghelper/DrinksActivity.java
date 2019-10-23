package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DrinksActivity extends AppCompatActivity {

    private static int waterQty;
    private static int sparklingWaterQty;
    private static int fizzyDrinkQty;
    private static int colaQty;
    private static int juiceQty;
    private static int beerQty;
    private static int vodkaQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        TextView drinks = findViewById(R.id.infoSendDrinks);
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(DrinksActivity.this, Summary.class);
                startActivity(intent);
            }
        });
    }

    //TODO >> add rest of the drinks
    public void incrementWater(View v) {
		
        int i = waterQty;
        String string = getString(R.string.water);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        waterQty = i;
    }
    public void incrementSparklingWater(View v) {

        int i = sparklingWaterQty;
        String string = getString(R.string.sparklingWater);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        sparklingWaterQty = i;
    }
    public void incrementFizzyDrink(View v) {

        int i = fizzyDrinkQty;
        String string = getString(R.string.fizzyDrink);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        fizzyDrinkQty = i;
    }
    public void incrementCola(View v) {

        int i = colaQty;
        String string = getString(R.string.cola);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        colaQty = i;
    }
    public void incrementJuice(View v) {

        int i = juiceQty;
        String string = getString(R.string.juice);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        juiceQty = i;
    }
    public void incrementBeer(View v) {

        int i = beerQty;
        String string = getString(R.string.beer);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        beerQty = i;
    }
    public void incrementVodka(View v) {

        int i = vodkaQty;
        String string = getString(R.string.vodka);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        vodkaQty = i;
    }
	
    public void decrementWater(View v) {
        int i = waterQty;
        String string = getString(R.string.water);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        waterQty = i;
    }
    public void decrementSparklingWater(View v) {
        int i = sparklingWaterQty;
        String string = getString(R.string.sparklingWater);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        sparklingWaterQty = i;
    }
    public void decrementFizzyDrink(View v) {
        int i = fizzyDrinkQty;
        String string = getString(R.string.fizzyDrink);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        fizzyDrinkQty = i;
    }
    public void decrementCola(View v) {
        int i = colaQty;
        String string = getString(R.string.cola);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        colaQty = i;
    }
    public void decrementJuice(View v) {
        int i = juiceQty;
        String string = getString(R.string.juice);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        juiceQty = i;
    }
    public void decrementBeer(View v) {
        int i = beerQty;
        String string = getString(R.string.beer);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        beerQty = i;
    }
    public void decrementVodka(View v) {
        int i = vodkaQty;
        String string = getString(R.string.vodka);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        vodkaQty = i;
    }
    
	//function that will display variables on desired position
    private void display(int qty, String string) {
        int iD = getResources().getIdentifier(string, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }

    public static int getWaterQty () {
        return waterQty;
    }
    public static int getSparklingWaterQty () {
        return sparklingWaterQty;
    }
    public static int getFizzyDrinkQty () {
        return fizzyDrinkQty;
    }
    public static int getColaQty () {
        return colaQty;
    }
    public static int getJuiceQty () {
        return juiceQty;
    }
    public static int getBeerQty () {
        return beerQty;
    }
    public static int getVodkaQty () {
        return vodkaQty;
    }
}
