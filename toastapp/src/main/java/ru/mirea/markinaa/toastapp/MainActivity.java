package ru.mirea.markinaa.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);

        View.OnClickListener confirmation = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer count = editText.length();
                Toast toast = Toast.makeText(getApplicationContext(),
                        "СТУДЕНТ № " + count + " ГРУППА " + count + " Количество символов - " + count,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        };

        button.setOnClickListener(confirmation);
    }
}
