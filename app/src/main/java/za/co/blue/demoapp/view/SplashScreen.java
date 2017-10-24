package za.co.blue.demoapp.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.blue.demoapp.view.LoginActivity;
import za.co.blue.demoapp.R;

public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent loginActivity = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(loginActivity);

                finish();
            }
        }, SPLASH_DURATION);
    }
}
