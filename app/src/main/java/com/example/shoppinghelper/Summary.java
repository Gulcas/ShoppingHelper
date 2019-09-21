package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<String> orderName = new ArrayList<>();
        ArrayList<String> totalOrder = new ArrayList<>();


        int iTomato = VegetablesActivity.getTomatoQty();
        int iOnion = VegetablesActivity.getOnionQty();
        int iCocumber = VegetablesActivity.getCocumberQty();
        int iPotato = VegetablesActivity.getPotatoQty();

        if (iTomato > 0) {
            order.add(iTomato);
            orderName.add(getString(R.string.tomato));
        }


        //this function will add two arrays into one
        for (int j = 0; j < order.size(); j++) {
            totalOrder.add(orderName.get(j) + ": " + order.get(j));
        }
        //this function has to be changed, but for now it's taking first line from totalOrder array and send it to the view activity
        TextView orderV = findViewById(R.id.order);
        orderV.setText(totalOrder.get(0));

    }
}
