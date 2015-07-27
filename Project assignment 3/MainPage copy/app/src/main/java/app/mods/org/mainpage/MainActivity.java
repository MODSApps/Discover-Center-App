package app.mods.org.mainpage;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //icon
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.actionicon);

        View otterButton = findViewById(R.id.wurt);
        otterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("org.example.otters");
                sendBroadcast(intent);

            }
        });

        View toflyButton = findViewById(R.id.tofly);
        toflyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("org.mods.tofly");
                sendBroadcast(intent);

            }
        });

        View gameButton = findViewById(R.id.discoverycenter);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.example.discoverycenter");
                sendBroadcast(intent);

    }
        });
        View stormButton = findViewById(R.id.stormcenter);
        stormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.mods.app.stormcenter");
                sendBroadcast(intent);

            }
        });
        View gogreenButton = findViewById(R.id.goGreen);
        gogreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.mods.gogreen");
                sendBroadcast(intent);

            }
        });
        View ecoscapesButton = findViewById(R.id.ecoScapessalt);
        ecoscapesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.example.ecoscapes");
                sendBroadcast(intent);

            }
        });
        View powerButton = findViewById(R.id.powerfulYou);
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.mods.powerfulyou");
                sendBroadcast(intent);

            }
        });
        View preButton = findViewById(R.id.prehistoricFlorida);
        preButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.example.prehistoricflorida");
                sendBroadcast(intent);

            }
        });
        View floridaButton = findViewById(R.id.floridaWaterstory);
        floridaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.mods.app.floridawaterstory");
                sendBroadcast(intent);

            }
        });
        View mineralButton = findViewById(R.id.mineralsFossils);
        mineralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.mods.app.minerals_boneyard");
                Intent intent = new Intent();
                intent.setAction("org.mods.app.minerals_boneyard");
                sendBroadcast(intent);

            }
        });
        View ecoButton = findViewById(R.id.ecoScapes);
        ecoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.example.sudoku");
                sendBroadcast(intent);

            }
        });
        View gizmoButton = findViewById(R.id.gizmo);
        gizmoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("org.example.gizmoCity");
                sendBroadcast(intent);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mappa:
                Intent intent = new Intent();
                intent.setAction("app.mods.org.mainpage");
                sendBroadcast(intent);
                //startActivity(new Intent(this, MapActivity.class));
                //return true;
            // More items go here (if any) ...
        }
        return false;
    }


}


