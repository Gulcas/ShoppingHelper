package com.example.shoppinghelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Summary extends AppCompatActivity {

    public static String stringOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        //array lists to prepare a full order list
        ArrayList<Integer> order = new ArrayList<>(); //list of qty's
        ArrayList<String> orderName = new ArrayList<>(); //list of names
        ArrayList<String> totalOrder = new ArrayList<>(); //list of both qty's + names

        //TODO >> get the rest of stuff to order qty's
        //called qty data from another class
        int iTomato = VegetablesActivity.getTomatoQty();
        int iOnion = VegetablesActivity.getOnionQty();
        int iCucumber = VegetablesActivity.getCucumberQty();
        int iPotato = VegetablesActivity.getPotatoQty();
        int iPaprika = VegetablesActivity.getPaprikaQty();
        int iChive = VegetablesActivity.getChiveQty();
        int iParsley = VegetablesActivity.getParsleyQty();
        int iIceberg = VegetablesActivity.getIcebergQty();
        int iGarlic = VegetablesActivity.getGarlicQty();

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
        if (iGarlic > 0) {
            order.add(iGarlic);
            orderName.add(getString(R.string.garlic));
        }

        //this function will add two arrays into one
        for (int i = 0; i < order.size(); i++) {
            totalOrder.add(orderName.get(i) + ": " + order.get(i));
        }

        /**function that display order on the screen*/
        int a = 1;
        for (int i = 0; i < totalOrder.size(); i++) {
            String orderViewNumber = "order" + a;
            int ID = getResources().getIdentifier(orderViewNumber, "id", getPackageName());
            TextView qtyView = findViewById(ID);
            qtyView.setText("" + totalOrder.get(i));
            a++;
        }

        //function that takes whole order from array list and cast it to string which can be send via email/sms intent
       final String stringOrder = String.join("; ", totalOrder);

        //function that will take care of sendOrder button
        Button sendOrder = findViewById(R.id.sendOrder);
        sendOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", getString(R.string.email), null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.emailSubject));
                emailIntent.putExtra(Intent.EXTRA_TEXT, stringOrder);
                startActivity(Intent.createChooser(emailIntent, getString(R.string.chooserMessage)));
            }
        });

    }
}
