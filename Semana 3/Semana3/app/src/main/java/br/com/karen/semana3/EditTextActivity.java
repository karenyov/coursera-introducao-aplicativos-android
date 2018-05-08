package br.com.karen.semana3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this, "Você escreveu: " + txt, Toast.LENGTH_SHORT);
        toast.show();

    }

}
