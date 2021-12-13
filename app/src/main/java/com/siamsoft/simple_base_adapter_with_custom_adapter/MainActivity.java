package com.siamsoft.simple_base_adapter_with_custom_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




   ListView list;

   String[] district = {"Dhaka","Khulna","Chittagong","Dhaka","Khulna","Chittagong","Dhaka","Khulna","Chittagong"};
   String[] sub = {"d: 123km", "d: 123km","d: 123km","d: 123km","d: 123km","d: 123km","d: 123km","d: 123km","d: 123km"};
   Integer[] ImageId =
           {
             R.drawable.a,
             R.drawable.b,
             R.drawable.c,
                   R.drawable.a,
             R.drawable.b,
             R.drawable.c,
                   R.drawable.a,
             R.drawable.b,
             R.drawable.c,


           };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.lstv);

        My_Custom_Adapter ca = new My_Custom_Adapter(MainActivity.this,district,ImageId,sub);
        list.setAdapter(ca);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You Clicked at "+district[position],Toast.LENGTH_SHORT).show();

            }
        });




    }
}