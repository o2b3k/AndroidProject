package kg.webneo.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button add,read,clear;
    EditText name,email;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        add = (Button) findViewById(R.id.button);
        add.setOnClickListener(this);
        read = (Button) findViewById(R.id.button2);
        read.setOnClickListener(this);
        clear = (Button) findViewById(R.id.button3);
        clear.setOnClickListener(this);
        name = (EditText) findViewById(R.id.editText);
        email = (EditText) findViewById(R.id.editText2);

        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        String ismi = email.getText().toString();
        String kod = name.getText().toString();

        switch (v.getId()){
            case R.id.button:
                Contact contact = new Contact(ismi,kod);
                contact.save();
                break;
            case R.id.button2:
                List<Contact> allContact = Contact.listAll(Contact.class);
                textView.setText(allContact.toString());
                textView.clearComposingText();
                break;
            case R.id.button3:
                Contact.deleteAll(Contact.class);
                break;
        }
    }
}
