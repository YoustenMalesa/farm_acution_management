package za.co.blue.demoapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.blue.demoapp.R;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        this.finish();
        return true;
    }
}
