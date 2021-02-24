package com.example.hwlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {


    String[] myArr = {"Довод", "Достать ножи", "Убийство в Восточном экспрессе", "Тёмные отражения", "Бегущий в лабиринте", "Бегущий в лабиринте: Испытание огнём",
            "Плохие парни навсегда", "Джон Уик 3", "Джон Уик 2", "Дэдпул", "Веном"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> monthAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArr);

        setListAdapter(monthAdapter);

    }
}