package amihope.aplikasilogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name, pass;
    Button login, btnF, btnG, btnT, btnReg;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                name =(EditText) findViewById(R.id.adduser);
                pass =(EditText) findViewById(R.id.addpass);
                login=(Button) findViewById(R.id.btnlogin);
                btnReg=(Button) findViewById(R.id.btnreg);
                btnF=(Button)findViewById(R.id.btnFacebook);
                btnG=(Button)findViewById(R.id.btnGmail);
                btnT=(Button)findViewById(R.id.btnTwitter);
                login.setOnClickListener(this);
                btnReg.setOnClickListener(this);
                btnF.setOnClickListener(this);
                btnG.setOnClickListener(this);
                btnT.setOnClickListener(this);
            }
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.btnFacebook:
                        Uri uriFB = Uri.parse("http://www.facebook.com");
                        Intent intent = new Intent(Intent.ACTION_VIEW,uriFB);
                        startActivity(intent);
                        break;

                    case R.id.btnGmail:
                        Uri uriGM = Uri.parse("http://www.gmail.com");
                        Intent intent2 = new Intent(Intent.ACTION_VIEW,uriGM);
                        startActivity(intent2);


                        break;
                    case R.id.btnTwitter:
                        Uri uriTW = Uri.parse("http://www.twitter.com");
                        Intent intent3 = new Intent(Intent.ACTION_VIEW,uriTW);
                        startActivity(intent3);


                        break;
                    case R.id.btnlogin:
                        if (name.getText().toString().equals("admin") && pass.getText().toString().equals("1234"))
                        {
                            Intent hal = new Intent(this,HalamanPertama.class);
                            startActivity(hal);
                        }else
                        {
                            Toast.makeText(getApplicationContext(),"Mohon Maaf Anda Gagal Login",Toast.LENGTH_LONG).show();
                        }

                        break;
                    case R.id.btnreg:

                        Intent reg = new Intent(this,Register.class);
                        startActivity(reg);


                        break;
                    default:
                }


            }
}
