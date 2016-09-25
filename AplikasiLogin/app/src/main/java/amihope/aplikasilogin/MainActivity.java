package amihope.aplikasilogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                EditText name, pass;
                Button login;
                name =(EditText) findViewById(R.id.adduser);
                pass =(EditText) findViewById(R.id.addpass);
                login=(Button) findViewById(R.id.btnlogin);
                login.setOnClickListener(this);
            }
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Tombol diklik",
                        Toast.LENGTH_SHORT).show();
            }
}
