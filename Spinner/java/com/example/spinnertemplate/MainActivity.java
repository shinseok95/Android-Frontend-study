package com.example.spinnertemplate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        String[] items = getResources().getStringArray(R.array.sector);

        /**
         * 스피너에 적용할 adapter 설정
         */

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item){

            // 제목 설정
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View v = super.getView(position, convertView, parent);

                if(position == getCount()){
                    ((TextView)v.findViewById(R.id.spinner_item)).setText("");
                    ((TextView)v.findViewById(R.id.spinner_item)).setHint(getItem(getCount()));
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount()-1;
            }
        };

        /**
         * Adapter를 spinner에 적용
         */

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        adapter.addAll(items);
        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getCount());

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //parent.getItemAtPosition(position)

                /**
                 * Spinner가 선택되면 할 행동을 정의
                 */

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
