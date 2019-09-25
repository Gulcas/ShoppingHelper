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

        //array lists to prepare a full order list
        ArrayList<Integer> order = new ArrayList<>(); //list of qty's
        ArrayList<String> orderName = new ArrayList<>(); //list of names
        ArrayList<String> totalOrder = new ArrayList<>(); //list of both qty's + names

        //TODO >> get the rest of vegetables qty's
        //called qty data from another class
        int iTomato = VegetablesActivity.getTomatoQty();
        int iOnion = VegetablesActivity.getOnionQty();
        int iCucumber = VegetablesActivity.getCucumberQty();
        int iPotato = VegetablesActivity.getPotatoQty();
        int iPaprika = VegetablesActivity.getPaprikaQty();
        int iChive = VegetablesActivity.getChiveQty();
        int iParsley = VegetablesActivity.getParsleyQty();
        int iIceberg = VegetablesActivity.getIcebergQty();

        //lots of if's will check is each item ordered
        if (iTomato > 0) {
            order.add(iTomato);
            orderName.add(getString(R.string.tomato));
        }
        if (iOnion > 0) {
            order.add(iOnion);
            orderName.add(getString(R.string.onion));
        }
        if (iCucumber > 0) {
            order.add(iCucumber);
            orderName.add(getString(R.string.cucumber));
        }
        if (iPotato > 0) {
            order.add(iPotato);
            orderName.add(getString(R.string.potato));
        }
        if (iPaprika > 0) {
            order.add(iPaprika);
            orderName.add(getString(R.string.paprika));
        }
        if (iChive > 0) {
            order.add(iChive);
            orderName.add(getString(R.string.chive));
        }
        if (iParsley > 0) {
            order.add(iParsley);
            orderName.add(getString(R.string.parsley));
        }
        if (iIceberg > 0) {
            order.add(iIceberg);
            orderName.add(getString(R.string.iceberg));
        }

        //this function will add two arrays into one
        for (int j = 0; j < order.size(); j++) {
            totalOrder.add(orderName.get(j) + ": " + order.get(j));
        }

        //TODO >> this function has to be changed, but for now it's taking first line from totalOrder array and send it to the view activity
        //function that display order on the screen
        TextView orderV = findViewById(R.id.order);
        orderV.setText(totalOrder.get(0));

    }
}
