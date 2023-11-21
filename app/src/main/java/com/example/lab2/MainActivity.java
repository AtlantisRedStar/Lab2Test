package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Spinner spinner;
    private Button countButton;
    private Button replaceButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        countButton = findViewById(R.id.button);
        replaceButton = findViewById(R.id.replaceButton);
        textView = findViewById(R.id.textView);

        countButton.setText(R.string.button_text);
        replaceButton.setText("Replace");

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.count_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                String selectedOption = spinner.getSelectedItem().toString();

                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.toast_empty_sentence, Toast.LENGTH_SHORT).show();
                } else {
                    int count = WordCharacterCounter.getCount(inputText, selectedOption);
                    textView.setText(getString(R.string.result_prefix) + count);
                }
            }
        });

        replaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                char newChar = 'c'; // Change as needed
                char oldChar = 'b'; // Change as needed

                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.toast_empty_sentence, Toast.LENGTH_SHORT).show();
                } else {
                    String result = WordCharacterCounter.changeChar(inputText, newChar, oldChar);
                    textView.setText(result);
                }
            }
        });
    }
}
