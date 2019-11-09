package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    public static int toothpasteQty;
    public static int dishSoapQty;
    public static int toiletPaperQty;
    public static int paperTowelsQty;
    public static int diapersQty;
    public static int shavingMachinesQty;
    public static int shavingFoamQty;
    public static int shampooQty;
    public static int bubbleBathQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView other = findViewById(R.id.infoSendOther);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, Summary.class);
                startActivity(intent);
            }
        });
    }

    public void incrementToothpaste(View v) {
        int i = toothpasteQty;
        String string = getString(R.string.toothpaste);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        toothpasteQty = i;
    }
    public void incrementDishSoap(View v) {
        int i = dishSoapQty;
        String string = getString(R.string.dishSoap);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        dishSoapQty = i;
    }
    public void incrementToiletPaper(View v) {
        int i = toiletPaperQty;
        String string = getString(R.string.toiletPaper);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        toiletPaperQty = i;
    }
    public void incrementPaperTowels(View v) {
        int i = paperTowelsQty;
        String string = getString(R.string.paperTowels);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        paperTowelsQty = i;
    }
    public void incrementDiapers(View v) {
        int i = diapersQty;
        String string = getString(R.string.diapers);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        diapersQty = i;
    }
    public void incrementShavingMachines(View v) {
        int i = shavingMachinesQty;
        String string = getString(R.string.shavingMachines);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        shavingMachinesQty = i;
    }
    public void incrementShavingFoam(View v) {
        int i = shavingFoamQty;
        String string = getString(R.string.shavingFoam);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        shavingFoamQty = i;
    }
    public void incrementShampoo(View v) {
        int i = shampooQty;
        String string = getString(R.string.shampoo);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        shampooQty = i;
    }
    public void incrementBubbleBath(View v) {
        int i = bubbleBathQty;
        String string = getString(R.string.bubbleBath);

        if (i >= 9) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i++;
            display(i, string);
        }

        bubbleBathQty = i;
    }

    public void decrementToothpaste(View v) {
        int i = toothpasteQty;
        String string = getString(R.string.toothpaste);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        toothpasteQty = i;
    }
    public void decrementDishSoap(View v) {
        int i = dishSoapQty;
        String string = getString(R.string.dishSoap);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        dishSoapQty = i;
    }
    public void decrementToiletPaper(View v) {
        int i = toiletPaperQty;
        String string = getString(R.string.toiletPaper);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        toiletPaperQty = i;
    }
    public void decrementDiapers(View v) {
        int i = paperTowelsQty;
        String string = getString(R.string.paperTowels);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        paperTowelsQty = i;
    }
    public void decrementShavingMachines(View v) {
        int i = shavingMachinesQty;
        String string = getString(R.string.shavingMachines);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        shavingMachinesQty = i;
    }
    public void decrementShavingFoam(View v) {
        int i = shavingFoamQty;
        String string = getString(R.string.shavingFoam);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        shavingFoamQty = i;
    }
    public void decrementShampoo(View v) {
        int i = shampooQty;
        String string = getString(R.string.shampoo);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        shampooQty = i;
    }
    public void decrementBubbleBath(View v) {
        int i = bubbleBathQty;
        String string = getString(R.string.bubbleBath);

        if (i <= 0) {
            Toast.makeText(this, R.string.wrongQty, Toast.LENGTH_SHORT).show();
        } else {
            i--;
            display(i, string);
        }

        bubbleBathQty = i;
    }

    public static int getToothpasteQty() {
        return toothpasteQty;
    }
    public static int getDishSoapQty () {
        return dishSoapQty;
    }
    public static int getToiletPaperQty () {
        return toiletPaperQty;
    }
    public static int getPaperTowelsQty () {
        return paperTowelsQty;
    }
    public static int getDiapersQty () {
        return diapersQty;
    }
    public static int getShavingMachinesQty () {
        return shavingMachinesQty;
    }
    public static int getShavingFoamQty () {
        return shavingFoamQty;
    }
    public static int getShampooQty () {
        return shampooQty;
    }
    public static int getBubbleBathQty () {
        return bubbleBathQty;
    }

    //function that will display variables on desired position
    private void display(int qty, String string) {
        int iD = getResources().getIdentifier(string, "id", getPackageName());
        TextView qtyView = findViewById(iD);
        qtyView.setText("" + qty);
    }
}

