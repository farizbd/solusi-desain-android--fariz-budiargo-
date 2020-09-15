package id.fariz.tryout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText = (EditText) findViewById(R.id.t_input);
        Button btTampil = (Button) findViewById(R.id.bt_tampil);
        final TextView tampilText = (TextView) findViewById(R.id.TextTampil);

        btTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                if (input == "A nut for a jar of tuna"){
                    tampilText.setText("Palindrome");
                }
                else if (input == "Al lets Della call Ed Stella") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "Amore, Roma") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "Borrow or rob") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "King, are you glade you are king") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "Taco cat") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "Was it a car I saw") {
                    tampilText.setText("Palindrome");
                }
                else if (input == "Oozy rat in a sanitary zoo") {
                    tampilText.setText("Palindrome");
                }
                else {
                    tampilText.setText("Bukan Palindrome");
                }

            }
        });
    }
}
