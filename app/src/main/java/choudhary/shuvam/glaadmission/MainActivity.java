package choudhary.shuvam.glaadmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name,fname,mname,hsp,ip,course,dob;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.et1);
        fname=findViewById(R.id.et2);
        mname=findViewById(R.id.et3);
        hsp=findViewById(R.id.et4);
        ip=findViewById(R.id.et5);
        course=findViewById(R.id.et6);
        dob =findViewById(R.id.et7);
        submit=findViewById(R.id.btn1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sName,fName,mName,Hsp,Ip,Course,Dob;
                sName=name.getText().toString();
                fName=fname.getText().toString();
                mName=mname.getText().toString();
                Hsp=hsp.getText().toString();
                Ip=ip.getText().toString();
                Course=course.getText().toString();
                Dob=dob.getText().toString();

                if (sName.equals("")||fName.equals("")||mName.equals("")||Hsp.equals("")||Ip.equals("")||Course.equals("")||Dob.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Your details submitted!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

