package br.com.karen.semana3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_SHORT);
        toast.show();
    }
}
