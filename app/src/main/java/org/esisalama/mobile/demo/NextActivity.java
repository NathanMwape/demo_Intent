package org.esisalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Button boutonSuivant = findViewById(R.id.btnsuivant);
        boutonSuivant.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*
                        declaration d'un objet de type intention qui a p lusieurs constructur
                        Intent suivant = new Intent(NextActivity.this, DeuxiemeActivity.class);
                        startActivity(suivant);

                        Action ACTION_VIEW : Permet de faire des intention explicite
                        la donner doit etre Un URI
                         */

                        String google = "https://google.com";
                        Uri url = Uri.parse(google);


                        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
                        linkIntent.setType("mp3");
                        linkIntent.setData(url);

                        startActivity(linkIntent);
                    }
                }
        );


    }
}