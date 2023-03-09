package com.shreyash.weatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    private TextView temperature;
    private TextView minMaxTemperature;
    private TextView description;
    private TextView feelsLikeTemperature;
    private TextView chanceOfRainfallDynamic;
    private TextView humidityDynamic;
    private TextView pressureDynamic;
    private TextView windSpeedDynamic;
    private TextView cityName;
    private TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.materialToolbar);
        setSupportActionBar(toolbar);

        temperature = findViewById(R.id.temperature);
        minMaxTemperature = findViewById(R.id.minMaxTemperature);
        description = findViewById(R.id.description);
        feelsLikeTemperature = findViewById(R.id.feelsLikeTemperature);
        chanceOfRainfallDynamic = findViewById(R.id.chanceOfRainfallDynamic);
        humidityDynamic = findViewById(R.id.humidityDynamic);
        pressureDynamic = findViewById(R.id.pressureDynamic);
        windSpeedDynamic = findViewById(R.id.windSpeedDynamic);
        cityName = findViewById(R.id.cityName);
        date = findViewById(R.id.date);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.weather_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.searchCity:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    
}