package chho.bingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    ArrayList <Integer> bLine = new ArrayList<>();
    ArrayList <Integer> iLine = new ArrayList<>();
    ArrayList <Integer> nLine = new ArrayList<>();
    ArrayList <Integer> gLine = new ArrayList<>();
    ArrayList <Integer> oLine = new ArrayList<>();
    private TextView bPos0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        generateNumbers();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void generateNumbers(){
        for (int i = 1; i < 16; i++){
            bLine.add(i);
            iLine.add(i+15);
            nLine.add(i+30);
            gLine.add(i+45);
            oLine.add(i+60);
        }
        Collections.shuffle(bLine);
        Collections.shuffle(iLine);
        Collections.shuffle(nLine);
        Collections.shuffle(gLine);
        Collections.shuffle(oLine);
        /*
        bPos0 = (TextView) findViewById(R.id.pos00);
        Log.i("U", "generateNumbers: " + bLine.get(0));
        bPos0.setText("" + bLine.get(0));
        TextView bPos1 = (TextView) findViewById(R.id.pos01);
        bPos1.setText(iLine.get(0));
        TextView bPos2 = (TextView) findViewById(R.id.pos02);
        bPos2.setText(nLine.get(0));
        TextView bPos3 = (TextView) findViewById(R.id.pos03);
        bPos3.setText(gLine.get(0));
        TextView bPos4 = (TextView) findViewById(R.id.pos04);
        bPos4.setText(oLine.get(0));
        TextView bPos10 = (TextView) findViewById(R.id.pos10);
        bPos10.setText(bLine.get(1));
        TextView bPos11 = (TextView) findViewById(R.id.pos11);
        bPos11.setText(iLine.get(1));
        TextView bPos12 = (TextView) findViewById(R.id.pos12);
        bPos12.setText(nLine.get(1));
        TextView bPos13 = (TextView) findViewById(R.id.pos13);
        bPos13.setText(gLine.get(1));
        TextView bPos14 = (TextView) findViewById(R.id.pos14);
        bPos14.setText(oLine.get(1));
        TextView bPos20 = (TextView) findViewById(R.id.pos20);
        bPos20.setText(bLine.get(2));
        TextView bPos21 = (TextView) findViewById(R.id.pos21);
        bPos21.setText(iLine.get(2));
        TextView bPos23 = (TextView) findViewById(R.id.pos23);
        bPos23.setText(gLine.get(2));
        TextView bPos24 = (TextView) findViewById(R.id.pos24);
        bPos24.setText(oLine.get(2));
        TextView bPos30 = (TextView) findViewById(R.id.pos30);
        bPos30.setText(bLine.get(3));
        TextView bPos31 = (TextView) findViewById(R.id.pos31);
        bPos31.setText(iLine.get(3));
        TextView bPos32 = (TextView) findViewById(R.id.pos32);
        bPos32.setText(nLine.get(3));
        TextView bPos33 = (TextView) findViewById(R.id.pos33);
        bPos33.setText(gLine.get(3));
        TextView bPos34 = (TextView) findViewById(R.id.pos34);
        bPos34.setText(oLine.get(3));
        TextView bPos40 = (TextView) findViewById(R.id.pos40);
        bPos0.setText(bLine.get(4));
        TextView bPos41 = (TextView) findViewById(R.id.pos41);
        bPos41.setText(iLine.get(4));
        TextView bPos42 = (TextView) findViewById(R.id.pos42);
        bPos42.setText(nLine.get(4));
        TextView bPos43 = (TextView) findViewById(R.id.pos43);
        bPos43.setText(gLine.get(4));
        TextView bPos44 = (TextView) findViewById(R.id.pos44);
        bPos44.setText(oLine.get(4)); */

    }

}
