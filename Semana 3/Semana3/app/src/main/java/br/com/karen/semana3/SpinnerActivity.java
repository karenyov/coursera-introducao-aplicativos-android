package br.com.karen.semana3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String txt = ((TextView) view).getText().toString();
                Toast.makeText(SpinnerActivity.this, "Você selecionou a " + txt + " de índice" + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }

    public void onClick(View view) {
        String string = String.valueOf(spinner.getSelectedItem());
        int position = spinner.getSelectedItemPosition();

        Toast.makeText(this, "Você selecionou a " + string + " de índice " + position, Toast.LENGTH_SHORT).show();
    }
}
