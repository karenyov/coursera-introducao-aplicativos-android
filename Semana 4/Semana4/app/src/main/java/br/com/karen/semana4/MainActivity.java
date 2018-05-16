package br.com.karen.semana4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnGridLayout = findViewById(R.id.btnGridLayout);
        btnGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnInterfaceRelativeLayout = findViewById(R.id.btnInterfaceRelativeLayout);
        btnInterfaceRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InterfaceRelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnInterfaceLinearLayout = findViewById(R.id.btnInterfaceLinearLayout);
        btnInterfaceLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InterfaceLinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnInterfaceGridLayout = findViewById(R.id.btnInterfaceGridLayout);
        btnInterfaceGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InterfaceGridLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
