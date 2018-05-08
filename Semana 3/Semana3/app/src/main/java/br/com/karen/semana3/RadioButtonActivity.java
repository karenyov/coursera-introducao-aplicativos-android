package br.com.karen.semana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void onRadioButtonClick(View view) {
        String text = ((RadioButton) view).getText().toString();
        Toast.makeText(this, "Você selecionou a " + text, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {
            case R.id.radio_1:
                Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_2:
                Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
