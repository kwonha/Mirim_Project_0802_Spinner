package kr.hs.emirim.xodusguckhan.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] posterId = {R.drawable.post_01, R.drawable.post_02, R.drawable.post_03, R.drawable.post_04, R.drawable.post_05,
            R.drawable.post_06, R.drawable.post_07, R.drawable.post_08, R.drawable.post_09, R.drawable.post_10};
    String[] items =  {"어벤져스_엔드게임", "센과 치히로의 행방불명", "부산행", "알라딘", "겨울왕국", "겨울왕국2", "미니언즈", "기생충", "라라랜드", "인터스텔라"};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}