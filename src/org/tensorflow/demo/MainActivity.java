package org.tensorflow.demo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Detectory-Activity. */
                Intent mainIntent = new Intent(MainActivity.this, org.tensorflow.demo.DetectorActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 2000);
    }
}
