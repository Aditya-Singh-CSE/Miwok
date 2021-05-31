package android.example.miwokfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find textView of numbers
        TextView numbers = findViewById(R.id.numbers);
        // Set a clickListner on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        // Find textView of family
        TextView family = findViewById(R.id.family);
        // Set a clickListner on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        // Find textView of phrases
        TextView phrases = findViewById(R.id.phrases);
        // Set a clickListner on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


        // Find textView of colors
        TextView colors = findViewById(R.id.colors);
        // Set a clickListner on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
    }




//    public void openNumbersList(View view)
//    {
//        Intent i = new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
//    public void openFamilyList(View view)
//    {
//        Intent i = new Intent(this,FamilyActivity.class);
//        startActivity(i);
//    }
//    public void openColorsList(View view)
//    {
//        Intent i = new Intent(this,ColorsActivity.class);
//        startActivity(i);
//    }
//    public void openPhrasesList(View view)
//    {
//        Intent i = new Intent(this,PhrasesActivity.class);
//        startActivity(i);
//    }
}