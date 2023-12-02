package com.example.myfuckingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.myfuckingshop.databinding.ElementsBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ArrayList<String> items = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ElementsBinding binding = ElementsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.CB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    items.add("Fucking weed");
                } else{
                    items.remove("Fucking weed");
                }
            }
        });
        binding.CB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    items.add("Fucking cocaine");
                } else{
                    items.remove("Fucking cocaine");
                }
            }
        });
        binding.CB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    items.add("Fucking heroin");
                } else{
                    items.remove("Fucking heroin");
                }
            }
        });
        binding.CB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    items.add("Fucking hashish");
                } else{
                    items.remove("Fucking hashish");
                }

            }
        });

        binding.CONFIRM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The order has been placed! You ordered: "+items.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        binding.CLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

    }
}