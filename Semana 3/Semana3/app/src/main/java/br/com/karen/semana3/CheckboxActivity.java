package br.com.karen.semana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    CheckBox checkBox_1;
    CheckBox checkBox_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        checkBox_1 = findViewById(R.id.checkbox_1);
        checkBox_2 = findViewById(R.id.checkbox_2);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_1:
                if (checked) {
                    Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Você cancelou a primeira opção", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox_2:
                if (checked) {
                    Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Você cancelou a primeira opção", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void onClick(View view) {
        boolean checked1 = checkBox_1.isChecked();
        boolean checked2 = checkBox_2.isChecked();

        if (checked1 && checked2) {
            Toast.makeText(this, "Você selecionou as duas opções", Toast.LENGTH_SHORT).show();
        } else if (checked1) {
            Toast.makeText(this, "Você selecionou apenas a primeira opção", Toast.LENGTH_SHORT).show();
        } else if (checked2) {
            Toast.makeText(this, "Você selecionou apenas a segunda opção", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Você não selecionou nenhuma opção", Toast.LENGTH_SHORT).show();
        }

    }
}
