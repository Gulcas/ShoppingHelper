package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FruitsActivity extends AppCompatActivity {

    private static int appleQty;
    private static int bananaQty;
    private static int lemonQty;
    private static int mandarinQty;
    private static int orangeQty;
    private static int peachQty;
    private static int nectarineQty;
    private static int pearQty;
    private static int grapeQty;
    private static int watermelonQty;
    private static int cherryQty;
    private static int sweetCherryQty;
    private static int kiwiQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        TextView vegetables = findViewById(R.id.infoSendFruits);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(FruitsActivity.this, Summary.class);
                startActivity(intent);
            }
        });
    }

    //TODO >> add rest of the fruits
    public void incrementApple(View v) {
        int i = appleQty;
        String string = getString(R.string.apple);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        appleQty = i;
    }
    public void incrementBanana(View v) {
        int i = bananaQty;
        String string = getString(R.string.banana);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        bananaQty = i;
    }
    public void incrementLemon(View v) {
        int i = lemonQty;
        String string = getString(R.string.lemon);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        lemonQty = i;
    }
    public void incrementMandarin(View v) {
        int i = mandarinQty;
        String string = getString(R.string.mandarin);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        mandarinQty = i;
    }
    public void incrementOrange(View v) {
        int i = orangeQty;
        String string = getString(R.string.orange);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        orangeQty = i;
    }
    public void incrementPeach(View v) {
        int i = peachQty;
        String string = getString(R.string.peach);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        peachQty = i;
    }
    public void incrementNectarine(View v) {
        int i = nectarineQty;
        String string = getString(R.string.nectarine);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        nectarineQty = i;
    }
    public void incrementPear(View v) {
        int i = pearQty;
        String string = getString(R.string.pear);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        pearQty = i;
    }
    public void incrementGrape(View v) {
        int i = grapeQty;
        String string = getString(R.string.grape);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        grapeQty = i;
    }
    public void incrementWatermelon(View v) {
        int i = watermelonQty;
        String string = getString(R.string.watermelon);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        watermelonQty = i;
    }
    public void incrementCherry(View v) {
        int i = cherryQty;
        String string = getString(R.string.cherry);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        cherryQty = i;
    }
    public void incrementSweetCherry(View v) {
        int i = sweetCherryQty;
        String string = getString(R.string.sweetCherry);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        sweetCherryQty = i;
    }
    public void incrementKiwi(View v) {
        int i = kiwiQty;
        String string = getString(R.string.kiwi);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        kiwiQty = i;
    }

    public void decrementApple(View v) {
        int i = appleQty;
        String string = getString(R.string.apple);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        appleQty = i;
    }
    public void decrementBanana(View v) {
        int i = bananaQty;
        String string = getString(R.string.banana);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        bananaQty = i;
    }
    public void decrementLemon(View v) {
        int i = lemonQty;
        String string = getString(R.string.lemon);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        lemonQty = i;
    }
    public void decrementMandarin(View v) {
        int i = mandarinQty;
        String string = getString(R.string.mandarin);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        mandarinQty = i;
    }
    public void decrementOrange(View v) {
        int i = orangeQty;
        String string = getString(R.string.orange);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        orangeQty = i;
    }
    public void decrementPeach(View v) {
        int i = peachQty;
        String string = getString(R.string.peach);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        peachQty = i;
    }
    public void decrementNectarine(View v) {
        int i = nectarineQty;
        String string = getString(R.string.nectarine);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        nectarineQty = i;
    }
    public void decrementPear(View v) {
        int i = pearQty;
        String string = getString(R.string.pear);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        peachQty = i;
    }
    public void decrementGrape(View v) {
        int i = grapeQty;
        String string = getString(R.string.grape);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        grapeQty = i;
    }
    public void decrementWatermelon(View v) {
        int i = watermelonQty;
        String string = getString(R.string.watermelon);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        watermelonQty = i;
    }
    public void decrementCherry(View v) {
        int i = cherryQty;
        String string = getString(R.string.cherry);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        cherryQty = i;
    }
    public void decrementSweetCherry(View v) {
        int i = sweetCherryQty;
        String string = getString(R.string.sweetCherry);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        sweetCherryQty = i;
    }
    public void decrementKiwi(View v) {
        int i = kiwiQty;
        String string = getString(R.string.kiwi);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        kiwiQty = i;
    }

    //function that will display variables on desired position
    private void display(int qty, String string) {
        int iD = getResources().getIdentifier(string, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }
    //TODO >> add rest of the vegetables
    public static int getAppleQty () {
        return appleQty;
    }
    public static int getBananaQty () {
        return bananaQty;
    }
    public static int getLemonQty () {
        return lemonQty;
    }
    public static int getMandarinQty () {
        return mandarinQty;
    }
    public static int getOrangeQty () {
        return orangeQty;
    }
    public static int getPeachQty () {
        return peachQty;
    }
    public static int getNectarineQty () {
        return nectarineQty;
    }
    public static int getPearQty () {
        return pearQty;
    }
    public static int getGrapeQty () {
        return grapeQty;
    }
    public static int getWatermelonQty () {
        return watermelonQty;
    }
    public static int getCherryQty () {
        return cherryQty;
    }
    public static int getSweetCherryQty () {
        return sweetCherryQty;
    }
    public static int getKiwiQty () {
        return kiwiQty;
    }

}
