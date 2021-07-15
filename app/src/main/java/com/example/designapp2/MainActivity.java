package com.example.designapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGridLayout = (GridLayout) findViewById(R.id.mainGridLayout);

        setSingleEvent(mainGridLayout);
    }

    private void setSingleEvent(GridLayout mainGridLayout) {

        for (int i=0;i<mainGridLayout.getChildCount();i++)
        {

            CardView cardView = (CardView)mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(MainActivity.this,ClothingActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==1)
                    {
                        Intent intent = new Intent(MainActivity.this,DanceActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==2)
                    {
                        Intent intent = new Intent(MainActivity.this,FoodActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==3)
                    {
                        Intent intent = new Intent(MainActivity.this,FestivalActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==4)
                    {
                        Intent intent = new Intent(MainActivity.this,LanguageActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==5)
                    {
                        Intent intent = new Intent(MainActivity.this,MonumentsActivity.class);
                        startActivity(intent);
                    }
                    else  if(finalI==6)
                    {
                        Intent intent = new Intent(MainActivity.this,MusicActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}