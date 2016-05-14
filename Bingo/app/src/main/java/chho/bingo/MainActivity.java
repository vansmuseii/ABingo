package chho.bingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    ArrayList <Integer> bLine = new ArrayList<>();
    ArrayList <Integer> iLine = new ArrayList<>();
    ArrayList <Integer> nLine = new ArrayList<>();
    ArrayList <Integer> gLine = new ArrayList<>();
    ArrayList <Integer> oLine = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
    }

}
