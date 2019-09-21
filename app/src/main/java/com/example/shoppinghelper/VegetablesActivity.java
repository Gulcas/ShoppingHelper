package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class VegetablesActivity extends AppCompatActivity {

    private static int tomatoQty;
    private static int onionQty;
    private static int cocumberQty;
    private static int potatoQty;
    private static int paprikaQty;
    private static int parsleyQty;
    private static int chiveQty;
    private static int icebergQty;
    private static int garlicQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        TextView vegetables = findViewById(R.id.tomato);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(VegetablesActivity.this, Summary.class);
                startActivity(intent);
            }
        });
    }


    public void incrementTomato(View v) {
        int i = tomatoQty;
        String vegetableString = getString(R.string.tomato);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        tomatoQty = i;
    }
    public void incrementOnion(View v) {
        int i = onionQty;
        String vegetableString = getString(R.string.onion);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        onionQty = i;
    }
    public void incrementCocumber(View v) {
        int i = cocumberQty;
        String vegetableString = getString(R.string.cocumber);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        cocumberQty = i;
    }
    public void incrementPotato(View v) {
        int i = potatoQty;
        String vegetableString = getString(R.string.potato);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        potatoQty = i;
    }

    public void decrementTomato(View v) {
        int i = tomatoQty;
        String vegetableString = getString(R.string.tomato);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        tomatoQty = i;
    }
    public void decrementOnion(View v) {
        int i = onionQty;
        String vegetableString = getString(R.string.onion);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        onionQty = i;
    }
    public void decrementCocumber(View v) {
        int i = cocumberQty;
        String vegetableString = getString(R.string.cocumber);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        cocumberQty = i;
    }
    public void decrementPotato(View v) {
        int i = potatoQty;
        String vegetableString = getString(R.string.potato);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        potatoQty = i;
    }

    //function that will display variables on desired position
    private void display(int qty, String vegetableName) {
        int iD = getResources().getIdentifier(vegetableName, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }
    public static int getTomatoQty () {
        return tomatoQty;
    }
    public static int getOnionQty () {
        return onionQty;
    }
    public static int getCocumberQty () {
        return cocumberQty;
    }
    public static int getPotatoQty () {
        return potatoQty;
    }

}
