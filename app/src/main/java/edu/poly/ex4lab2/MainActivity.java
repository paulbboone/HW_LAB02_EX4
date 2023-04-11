package edu.poly.ex4lab2;
import org.w3c.dom.Text;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText name,  email, project;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.txtName);

        email = (EditText)findViewById(R.id.txtEmai);
        project = (EditText)findViewById(R.id.txtDate);

        btnSubmit = (Button)findViewById(R.id.btnSend);
        result = (TextView)findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty()  || email.getText().toString().isEmpty() || project.getText().toString().isEmpty()
                        ) {
                    result.setText("Missing Details");
                } else {
                    result.setText("Name -  " + name.getText().toString() + " \n"
                            + " \n" + "E-Mail -  " + email.getText().toString() + " \n" + "Project -  " + project.getText().toString()
                             );
                }
            }
        });
    }
}