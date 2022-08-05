package tiara.anggreyani.chicken;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String username = "admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edUsername = findViewById(R.id.ed_username);
        EditText edPassword = findViewById(R.id.ed_password);
        ImageView loginButton = findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edUsername.getText().toString().equalsIgnoreCase(username) && edPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }
                else{
                    Toast.makeText(MainActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}