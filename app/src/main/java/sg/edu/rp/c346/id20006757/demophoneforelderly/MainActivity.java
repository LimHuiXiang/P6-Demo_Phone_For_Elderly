package sg.edu.rp.c346.id20006757.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button BS;
Button BD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BS= findViewById(R.id.button);
        BD= findViewById(R.id.button2);


        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:92240336"));
                startActivity(intentCall);
            }
        });

        BD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:89675543"));
                startActivity(intentCall);
            }
        });



    }
}