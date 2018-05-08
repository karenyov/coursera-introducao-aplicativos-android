package br.com.karen.semana3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        textView = (TextView) findViewById(R.id.textView);
        count = 0;
    }

    public void onClick(View view) {
        count++;
        textView.setText("Você pressionou o botão: " + count);
    }

}
