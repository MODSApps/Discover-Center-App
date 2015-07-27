package app.mods.org.mainpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by osmarjuniorcr on 7/21/15.
 */
public class MapActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        Intent intent = new Intent();
            intent.setAction("app.mods.org.mainpage");
            sendBroadcast(intent);

        }
    }

