package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BakeryActivity extends AppCompatActivity {

    public static int slicedBreadQty;
    public static int wholeBreadQty;
    public static int rollsQty;
    public static int sweetRollsQty;
    public static int donutsQty;
    public static int pitaQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakery);
        TextView bakery = findViewById(R.id.infoSendBakery);
        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(BakeryActivity.this, Summary.class);
                startActivity(intent);
            }
        });
    }

    public void incrementSlicedBread(View v) {

        int i = slicedBreadQty;
        String string = getString(R.string.slicedBread);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        slicedBreadQty = i;
    }
    public void incrementWholeBread(View v) {

        int i = wholeBreadQty;
        String string = getString(R.string.wholeBread);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        wholeBreadQty = i;
    }
    public void incrementRolls(View v) {

        int i = rollsQty;
        String string = getString(R.string.rolls);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        rollsQty = i;
    }
    public void incrementSweetRolls(View v) {

        int i = sweetRollsQty;
        String string = getString(R.string.sweetRolls);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        sweetRollsQty = i;
    }
    public void incrementDonuts(View v) {

        int i = donutsQty;
        String string = getString(R.string.donuts);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        donutsQty = i;
    }
    public void incrementPita(View v) {

        int i = pitaQty;
        String string = getString(R.string.pita);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        pitaQty = i;
    }

    public void decrementSlicedBread(View v) {
        int i = slicedBreadQty;
        String string = getString(R.string.slicedBread);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        slicedBreadQty = i;
    }
    public void decrementWholeBread(View v) {
        int i = wholeBreadQty;
        String string = getString(R.string.wholeBread);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        wholeBreadQty = i;
    }
    public void decrementRolls(View v) {
        int i = rollsQty;
        String string = getString(R.string.rolls);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        rollsQty = i;
    }
    public void decrementSweetRolls(View v) {
        int i = sweetRollsQty;
        String string = getString(R.string.sweetRolls);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        sweetRollsQty = i;
    }
    public void decrementDonuts(View v) {
        int i = donutsQty;
        String string = getString(R.string.donuts);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        donutsQty = i;
    }
    public void decrementPita(View v) {
        int i = pitaQty;
        String string = getString(R.string.pita);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        pitaQty = i;
    }

    //function that will display variables on desired position
    private void display(int qty, String string) {
        int iD = getResources().getIdentifier(string, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }

    public static int getSlicedBreadQty () {
        return slicedBreadQty;
    }
    public static int getWholeBreadQty () {
        return wholeBreadQty;
    }
    public static int getRollsQty () {
        return rollsQty;
    }
    public static int getSweetRollsQty () {
        return sweetRollsQty;
    }
    public static int getDonutsQty () {
        return donutsQty;
    }
    public static int getPitaQty () {
        return pitaQty;
    }

}
