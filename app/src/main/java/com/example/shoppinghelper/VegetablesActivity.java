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
    private static int cucumberQty;
    private static int potatoQty;
    private static int paprikaQty;
    private static int chiveQty;
    private static int parsleyQty;
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
    //TODO >> add rest of the vegetables
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
    public void incrementCucumber(View v) {
        int i = cucumberQty;
        String vegetableString = getString(R.string.cucumber);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        cucumberQty = i;
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
    public void incrementPaprika(View v) {
        int i = paprikaQty;
        String vegetableString = getString(R.string.paprika);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        paprikaQty = i;
    }
    public void incrementChive(View v) {
        int i = chiveQty;
        String vegetableString = getString(R.string.chive);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        chiveQty = i;
    }
    public void incrementParsley(View v) {
        int i = parsleyQty;
        String vegetableString = getString(R.string.parsley);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        parsleyQty = i;
    }
    public void incrementIceberg(View v) {
        int i = icebergQty;
        String vegetableString = getString(R.string.iceberg);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, vegetableString);
        }

        icebergQty = i;
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
    public void decrementCucumber(View v) {
        int i = cucumberQty;
        String vegetableString = getString(R.string.cucumber);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        cucumberQty = i;
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
    public void decrementPaprika(View v) {
        int i = paprikaQty;
        String vegetableString = getString(R.string.paprika);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        paprikaQty = i;
    }
    public void decrementChive(View v) {
        int i = chiveQty;
        String vegetableString = getString(R.string.chive);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        chiveQty = i;
    }
    public void decrementParsley(View v) {
        int i = parsleyQty;
        String vegetableString = getString(R.string.parsley);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        parsleyQty = i;
    }
    public void decrementIceberg(View v) {
        int i = icebergQty;
        String vegetableString = getString(R.string.iceberg);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, vegetableString);
        }

        icebergQty = i;
    }

    //function that will display variables on desired position
    private void display(int qty, String vegetableName) {
        int iD = getResources().getIdentifier(vegetableName, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }
    //TODO >> add rest of the vegetables
    public static int getTomatoQty () {
        return tomatoQty;
    }
    public static int getOnionQty () {
        return onionQty;
    }
    public static int getCucumberQty () {
        return cucumberQty;
    }
    public static int getPotatoQty () {
        return potatoQty;
    }
    public static int getPaprikaQty () {
        return paprikaQty;
    }
    public static int getChiveQty () {
        return chiveQty;
    }
    public static int getParsleyQty () {
        return parsleyQty;
    }
    public static int getIcebergQty () {
        return icebergQty;
    }

}
