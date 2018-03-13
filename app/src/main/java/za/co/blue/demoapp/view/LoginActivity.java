package za.co.blue.demoapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import za.co.blue.demoapp.R;
import za.co.blue.demoapp.view.SignupActivity;

public class LoginActivity extends AppCompatActivity implements LoginView{
    @BindView(R.id.createAccount) TextView txtSignup;
    @BindView(R.id.loginBtn)      Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    @OnClick(R.id.createAccount)
    public void signUpTextClickListener() {
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSignup.setTextColor(getResources().getColor(R.color.colorPrimary));
                Intent signUpIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(signUpIntent);
            }
        });
    }

    @Override
    @OnClick(R.id.loginBtn)
    public void loginOnClickListener() {
        Intent mainView = new Intent(this, AuctionActivity.class);
        startActivity(mainView);

        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(getApplicationContext(), "Clicked on settings", Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

}
