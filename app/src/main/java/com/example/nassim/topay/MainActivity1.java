package com.example.nassim.topay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity1 extends Activity {

      super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Création du fichier de sauvegarde
        this.saveData = new SharedPreference(getApplicationContext());

        this.button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {

            // Start NewActivity.class
            Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(myIntent);
        }
    });

        this.button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {

            // Start NewActivity.class
            Intent myIntent = new Intent(MainActivity.this, HistoriqueActivity.class);
            startActivity(myIntent);
        }
    });


}
}
