package com.example.pranay.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    String[] val = {"jan","feb","mar","apr","may","jun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*  spinner = (Spinner)findViewById(R.id.spinner);
       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.month, android.R.layout.activity_list_item);
         spinner.setAdapter(adapter);
         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                 Toast.makeText(MainActivity.this,spinner.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });
*/
                /*spinner=(Spinner)findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.activity_list_item,val);
                spinner.setAdapter(adapter);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this,spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
*/

    }
}
