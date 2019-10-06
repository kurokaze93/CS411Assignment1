package com.example.cs411assignment1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class main extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams universal = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        universal.weight = 1;
        //universal.setMargins(10,10,10,10);
        //=====================================================================================
        //Vertical Linearlayout 1
        LinearLayout sub1 = new LinearLayout(this);
        sub1.setOrientation(LinearLayout.VERTICAL);
        sub1.setBackgroundColor(Color.BLACK);
        sub1.setWeightSum(9);


        LinearLayout.LayoutParams sublp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sublp1.weight = 1;
        sublp1.setMargins(10,10,10,10);

        TextView subtv1 = new TextView(this);
        subtv1.setLayoutParams(sublp1);
        subtv1.setTextSize(20);
        subtv1.setText(" Properties ");
        subtv1.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv1);

        LinearLayout.LayoutParams sublp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sublp2.weight = 1;
        sublp2.setMargins(10,10,10,10);

        TextView subtv2 = new TextView(this);
        subtv2.setLayoutParams(sublp2);
        subtv2.setTextSize(20);
        subtv2.setText(" Rule ");
        subtv2.setBackgroundColor(Color.BLUE);
        sub1.addView(subtv2);

        TextView subtv3 = new TextView(this);
        subtv3.setLayoutParams(sublp2);
        subtv3.setBackgroundColor(Color.GREEN);
        sub1.addView(subtv3);

        TextView subtv4 = new TextView(this);
        subtv4.setLayoutParams(sublp2);
        subtv4.setBackgroundColor(Color.GREEN);
        sub1.addView(subtv4);

        TextView subtv5 = new TextView(this);
        subtv5.setLayoutParams(sublp2);
        subtv5.setTextSize(20);
        subtv5.setText(" Rule ");
        subtv5.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv5);

        TextView subtv6 = new TextView(this);
        subtv6.setLayoutParams(sublp2);
        subtv6.setTextSize(20);
        subtv6.setText(" R10 ");
        subtv6.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv6);

        TextView subtv7 = new TextView(this);
        subtv7.setLayoutParams(sublp2);
        subtv7.setTextSize(20);
        subtv7.setText(" R20 ");
        subtv7.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv7);

        TextView subtv8 = new TextView(this);
        subtv8.setLayoutParams(sublp2);
        subtv8.setTextSize(20);
        subtv8.setText(" R30 ");
        subtv8.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv8);

        TextView subtv9 = new TextView(this);
        subtv9.setLayoutParams(sublp2);
        subtv9.setTextSize(20);
        subtv9.setText(" R40 ");
        subtv9.setBackgroundColor(Color.WHITE);
        sub1.addView(subtv9);

        sub1.setLayoutParams(universal);

        //==============================================================================
        // Vertical Linearlayout 2

        LinearLayout sub2 = new LinearLayout(this);
        sub2.setOrientation(LinearLayout.VERTICAL);
        sub2.setWeightSum(4);

        LinearLayout.LayoutParams sub2lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub2lp1.weight = 1;
        sub2lp1.setMargins(10,10,10,10);

        TextView sub2tv1 = new TextView(this);
        sub2tv1.setLayoutParams(sub2lp1);
        sub2tv1.setTextSize(20);
        sub2tv1.setText(" Name ");
        sub2tv1.setBackgroundColor(Color.WHITE);
        sub2.addView(sub2tv1);

        TextView sub2tv2 = new TextView(this);
        sub2tv2.setLayoutParams(sub2lp1);
        sub2tv2.setTextSize(20);
        sub2tv2.setText(" Category ");
        sub2tv2.setBackgroundColor(Color.WHITE);
        sub2.addView(sub2tv2);

        TextView sub2tv3 = new TextView(this);
        sub2tv3.setLayoutParams(sub2lp1);
        sub2tv3.setTextSize(20);
        sub2tv3.setText(" C1 ");
        sub2tv3.setBackgroundColor(Color.BLUE);
        sub2.addView(sub2tv3);

        TextView sub2tv4 = new TextView(this);
        sub2tv4.setLayoutParams(sub2lp1);
        sub2tv4.setTextSize(20);
        sub2tv4.setText(" min <= hour && hour <= max ");
        sub2tv4.setBackgroundColor(Color.BLUE);
        sub2.addView(sub2tv4);

        LinearLayout.LayoutParams sub2lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub2lp2.weight = 1;
        sub2.setLayoutParams(sub2lp2);

        //======================================================================
        // Vertical Linearlayout 3

        LinearLayout sub3 = new LinearLayout(this);
        sub3.setOrientation(LinearLayout.VERTICAL);
        sub3.setWeightSum(6);

        LinearLayout.LayoutParams sub3lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        sub3lp1.weight = 1;
        sub3lp1.setMargins(5,10,5,10);

        TextView sub3tv0 = new TextView(this);
        sub3tv0.setLayoutParams(sub3lp1);
        sub3tv0.setTextSize(20);
        sub3tv0.setText(" Int min ");
        sub3tv0.setBackgroundColor(Color.BLUE);
        sub3.addView(sub3tv0);

        TextView sub3tv1 = new TextView(this);
        sub3tv1.setLayoutParams(sub3lp1);
        sub3tv1.setTextSize(20);
        sub3tv1.setText(" From ");
        sub3tv1.setBackgroundColor(Color.YELLOW);
        sub3.addView(sub3tv1);

        TextView sub3tv2 = new TextView(this);
        sub3tv2.setLayoutParams(sub3lp1);
        sub3tv2.setTextSize(20);
        sub3tv2.setText(" 0 ");
        sub3tv2.setBackgroundColor(Color.YELLOW);
        sub3.addView(sub3tv2);

        TextView sub3tv3 = new TextView(this);
        sub3tv3.setLayoutParams(sub3lp1);
        sub3tv3.setTextSize(20);
        sub3tv3.setText(" 12 ");
        sub3tv3.setBackgroundColor(Color.YELLOW);
        sub3.addView(sub3tv3);

        TextView sub3tv4 = new TextView(this);
        sub3tv4.setLayoutParams(sub3lp1);
        sub3tv4.setTextSize(20);
        sub3tv4.setText(" 18 ");
        sub3tv4.setBackgroundColor(Color.YELLOW);
        sub3.addView(sub3tv4);

        TextView sub3tv5 = new TextView(this);
        sub3tv5.setLayoutParams(sub3lp1);
        sub3tv5.setTextSize(20);
        sub3tv5.setText(" 22 ");
        sub3tv5.setBackgroundColor(Color.YELLOW);
        sub3.addView(sub3tv5);

        sub3.setLayoutParams(universal);

        //======================================================================
        // Vertical Linearlayout 4

        LinearLayout sub4 = new LinearLayout(this);
        sub4.setOrientation(LinearLayout.VERTICAL);
        sub4.setWeightSum(6);

        LinearLayout.LayoutParams sub4lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        sub4lp1.weight = 1;
        sub4lp1.setMargins(5,10,5,10);

        TextView sub4tv0 = new TextView(this);
        sub4tv0.setLayoutParams(sub4lp1);
        sub4tv0.setTextSize(20);
        sub4tv0.setText(" Int max ");
        sub4tv0.setBackgroundColor(Color.BLUE);
        sub4.addView(sub4tv0);

        TextView sub4tv1 = new TextView(this);
        sub4tv1.setLayoutParams(sub4lp1);
        sub4tv1.setTextSize(20);
        sub4tv1.setText(" To ");
        sub4tv1.setBackgroundColor(Color.YELLOW);
        sub4.addView(sub4tv1);

        TextView sub4tv2 = new TextView(this);
        sub4tv2.setLayoutParams(sub4lp1);
        sub4tv2.setTextSize(20);
        sub4tv2.setText(" 11 ");
        sub4tv2.setBackgroundColor(Color.YELLOW);
        sub4.addView(sub4tv2);

        TextView sub4tv3 = new TextView(this);
        sub4tv3.setLayoutParams(sub4lp1);
        sub4tv3.setTextSize(20);
        sub4tv3.setText(" 17 ");
        sub4tv3.setBackgroundColor(Color.YELLOW);
        sub4.addView(sub4tv3);

        TextView sub4tv4 = new TextView(this);
        sub4tv4.setLayoutParams(sub4lp1);
        sub4tv4.setTextSize(20);
        sub4tv4.setText(" 21 ");
        sub4tv4.setBackgroundColor(Color.YELLOW);
        sub4.addView(sub4tv4);

        TextView sub4tv5 = new TextView(this);
        sub4tv5.setLayoutParams(sub4lp1);
        sub4tv5.setTextSize(20);
        sub4tv5.setText(" 23 ");
        sub4tv5.setBackgroundColor(Color.YELLOW);
        sub4.addView(sub4tv5);

        sub4.setLayoutParams(universal);

        //======================================================================================
        //Combine sub3 and sub 4    (comb1)

        LinearLayout comb1 = new LinearLayout(this);
        comb1.setOrientation(LinearLayout.HORIZONTAL);
        comb1.setWeightSum(2);

        LinearLayout.LayoutParams comb1lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        comb1lp1.weight = 1;

        comb1.addView(sub3,0);
        comb1.addView(sub4,1);

        comb1.setLayoutParams(comb1lp1);


        //=====================================================================================
        //Combine comb1 and sub2    (comb2)

        LinearLayout comb2 = new LinearLayout(this);
        comb2.setOrientation(LinearLayout.VERTICAL);
        comb2.setBackgroundColor(Color.BLACK);
        comb2.setWeightSum(2);

        LinearLayout.LayoutParams comb2lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        comb2lp1.weight = 1;

        comb2.addView(sub2, 0);
        comb2.addView(comb1, 1);

        comb2.setLayoutParams(comb2lp1);

        //===================================================================================
        //Vertical Linearlayout 5

        LinearLayout sub5 = new LinearLayout(this);
        sub5.setOrientation(LinearLayout.VERTICAL);
        sub5.setBackgroundColor(Color.BLACK);
        sub5.setWeightSum(10);

        LinearLayout.LayoutParams sub5lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub5lp1.weight = 1;
        sub5lp1.setMargins(10,10,10,10);


        TextView sub5tv1 = new TextView(this);
        sub5tv1.setLayoutParams(sub5lp1);
        sub5tv1.setTextSize(20);
        sub5tv1.setText(" Day Hour Classification ");
        sub5tv1.setBackgroundColor(Color.WHITE);
        sub5.addView(sub5tv1);

        TextView sub5tv2 = new TextView(this);
        sub5tv2.setLayoutParams(sub5lp1);
        sub5tv2.setTextSize(20);
        sub5tv2.setText(" Day and Time ");
        sub5tv2.setBackgroundColor(Color.WHITE);
        sub5.addView(sub5tv2);

        TextView sub5tv3 = new TextView(this);
        sub5tv3.setLayoutParams(sub5lp1);
        sub5tv3.setTextSize(20);
        sub5tv3.setText(" A1 ");
        sub5tv3.setBackgroundColor(Color.BLUE);
        sub5.addView(sub5tv3);

        TextView sub5tv4 = new TextView(this);
        sub5tv4.setLayoutParams(sub5lp1);
        sub5tv4.setTextSize(20);
        sub5tv4.setText("System.out.println(greeting + ',World!')");
        sub5tv4.setBackgroundColor(Color.BLUE);
        sub5.addView(sub5tv4);

        TextView sub5tv5 = new TextView(this);
        sub5tv5.setLayoutParams(sub5lp1);
        sub5tv5.setTextSize(20);
        sub5tv5.setText(" String greeting ");
        sub5tv5.setBackgroundColor(Color.BLUE);
        sub5.addView(sub5tv5);

        TextView sub5tv6 = new TextView(this);
        sub5tv6.setLayoutParams(sub5lp1);
        sub5tv6.setTextSize(20);
        sub5tv6.setText(" Greeting ");
        sub5tv6.setBackgroundColor(Color.RED);
        sub5.addView(sub5tv6);

        TextView sub5tv7 = new TextView(this);
        sub5tv7.setLayoutParams(sub5lp1);
        sub5tv7.setTextSize(20);
        sub5tv7.setText(" Good Morning ");
        sub5tv7.setBackgroundColor(Color.RED);
        sub5.addView(sub5tv7);

        TextView sub5tv8 = new TextView(this);
        sub5tv8.setLayoutParams(sub5lp1);
        sub5tv8.setTextSize(20);
        sub5tv8.setText(" Good Afternoon ");
        sub5tv8.setBackgroundColor(Color.RED);
        sub5.addView(sub5tv8);

        TextView sub5tv9 = new TextView(this);
        sub5tv9.setLayoutParams(sub5lp1);
        sub5tv9.setTextSize(20);
        sub5tv9.setText(" Good Evening ");
        sub5tv9.setBackgroundColor(Color.RED);
        sub5.addView(sub5tv9);

        TextView sub5tv10 = new TextView(this);
        sub5tv10.setLayoutParams(sub5lp1);
        sub5tv10.setTextSize(20);
        sub5tv10.setText(" Good Night ");
        sub5tv10.setBackgroundColor(Color.RED);
        sub5.addView(sub5tv10);

        LinearLayout.LayoutParams sub5lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub5lp2.weight = 1;
        sub5.setLayoutParams(sub5lp2);

        //===================================================================================
        //combine sub1 and comb2 and sub5

        LinearLayout comb3 = new LinearLayout(this);
        comb3.setOrientation(LinearLayout.HORIZONTAL);
        comb3.setBackgroundColor(Color.BLACK);
        comb3.setWeightSum(3);

        LinearLayout.LayoutParams comb3lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        comb3lp1.weight = 1;
        //comb3lp1.setMargins(0,0,0,0);


        comb3.addView(sub1,0);
        comb3.addView(comb2,1);
        comb3.addView(sub5,2);

        comb3.setLayoutParams(comb3lp1);

        //========================================================================================
        //
        LinearLayout sub6 = new LinearLayout(this);
        sub6.setOrientation(LinearLayout.VERTICAL);
        sub6.setBackgroundColor(Color.BLACK);
        sub6.setWeightSum(12);

        LinearLayout.LayoutParams sub6lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub6lp1.weight = 11;
        sub6lp1.setMargins(10,10,10,0);


        TextView sub6tv1 = new TextView(this);
        sub6tv1.setLayoutParams(sub6lp1);
        sub6tv1.setTextSize(20);
        sub6tv1.setTextColor(Color.WHITE);
        sub6tv1.setText(" Rules void hello1(int hour) ");
        sub6tv1.setBackgroundColor(Color.BLACK);

        sub6.addView(sub6tv1,0);
        sub6.addView(comb3,1);

        LinearLayout.LayoutParams sub6lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub6lp2.weight = 1;
        sub6.setLayoutParams(sub6lp2);


        //==========================================================================================
        // sub7

        LinearLayout sub7 = new LinearLayout(this);
        sub7.setOrientation(LinearLayout.VERTICAL);
        sub7.setWeightSum(11);

        LinearLayout.LayoutParams sub7lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub7lp1.weight = 1;
        sub7lp1.setMargins(10,5,0,5);

        for(int i = 1; i <= 11; i++)
        {
            TextView tv = new TextView(this);
            tv.setLayoutParams(sub7lp1);
            tv.setTextSize(20);
            tv.setText("" +i);
            tv.setBackgroundColor(Color.LTGRAY);
            sub7.addView(tv);
        }

        LinearLayout.LayoutParams sub7lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        sub7lp2.weight = 10;
        sub7.setLayoutParams(sub7lp2);

        //=========================================================================================
        // Combine sub6 and sub 7

        LinearLayout comb4 = new LinearLayout(this);
        comb4.setOrientation(LinearLayout.HORIZONTAL);
        comb4.setBackgroundColor(Color.BLACK);
        comb4. setWeightSum(11);

        LinearLayout.LayoutParams comb4lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        comb4.setLayoutParams(comb4lp1);

        comb4.addView(sub7,0);
        comb4.addView(sub6, 1);




        setContentView(comb4);






    }
}
