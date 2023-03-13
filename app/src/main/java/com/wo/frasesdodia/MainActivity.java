package com.wo.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

   }

   public void gerarNovaFrase(View view) {
      String[] frases = {
              "Bom dia",
              "Boa Tarde",
              "Boa noite",
              "Bom descanso"
      };
      int random = new Random().nextInt(4);

      TextView txt = findViewById(R.id.txt_phrase);
      txt.setText(frases[random]);
   }
}