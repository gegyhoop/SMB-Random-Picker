package cz.petane.smbpicker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        Button button = new Button(this);
        button.setText("Vybrat nové díly");

        button.setOnClickListener(v ->
                Toast.makeText(
                        this,
                        "Aplikace funguje",
                        Toast.LENGTH_SHORT
                ).show()
        );

        layout.addView(button);

        setContentView(layout);
    }
}
