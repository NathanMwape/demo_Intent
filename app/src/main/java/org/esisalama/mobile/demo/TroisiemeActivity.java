package org.esisalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TroisiemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troisieme);

        Button boutonSuivant = findViewById(R.id.btnsuivant);
        boutonSuivant.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //declaration d'un objet de type intention qui a p lusieurs constructur
                        Intent suivant = new Intent(TroisiemeActivity.this, MainActivity.class);
                        finish();
                    }
                }
        );
    }
}