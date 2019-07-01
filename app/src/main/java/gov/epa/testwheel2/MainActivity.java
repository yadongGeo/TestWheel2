package gov.epa.testwheel2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button indoor_8tn= (Button) findViewById(R.id.indoor_temp_8tn);
        indoor_8tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }

        });
    }

    public void openDialog() {
        NumberPicker1Dialog newDialog = new NumberPicker1Dialog();
        newDialog.show(getSupportFragmentManager(),"number Picker");
    }
    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {
        Toast.makeText(this,
                "selected number " + numberPicker.getValue(), Toast.LENGTH_SHORT).show();
    }

    public void showNumberPicker1(View view){
        NumberPicker1Dialog newFragment = new NumberPicker1Dialog();
        newFragment.setValueChangeListener(this);
        newFragment.show(getSupportFragmentManager(), "time picker");
    }
}

