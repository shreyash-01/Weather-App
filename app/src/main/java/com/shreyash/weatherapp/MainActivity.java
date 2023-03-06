package com.shreyash.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

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
}