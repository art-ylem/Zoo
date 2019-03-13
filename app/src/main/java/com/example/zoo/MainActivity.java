package com.example.zoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EveryAnimal[] animalArray = {new Antelope(), new Cheetah(), new Moose(), new Bear(),new Wolf(),new Lion(), new Zebra()};
    }
}
