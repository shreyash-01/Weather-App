package com.shreyash.weatherapp;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CurrentWeatherModel {
    Context context;
    private RequestQueue requestQueue;

    CurrentWeatherModel(Context context){
        this.context = context;
        requestQueue = Volley.newRequestQueue(context);
    }


    private String API_KEY = BuildConfig.API_KEY;
    private String URL = "https://api.openweathermap.org/data/2.5/weather?";

    public double latitude;
    private double longitude;
    private int temperature = 8;
    private int minTemperature;
    private int maxTemperature;
    private int pressure;
    private int humidity;
    private int visibility;
    private int windSpeed;
    private int feelsLikeTemperature;
    private String description;
    private String cityName;
    private String countryCode;
    private int date;
    private int sunset;
    private int sunrise;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public String getDescription() {
        return description;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getSunset() {
        return sunset;
    }

    public int getDate() {
        return date;
    }

    public int getSunrise() {
        return sunrise;
    }

    public int getHumidity(){
        return humidity;
    }
    public int getWindSpeed(){
        return windSpeed;
    }


    public void getWeatherData(){
        String mainURL = URL + "q=bangalore&" + "appid=" + API_KEY;

        JsonObjectRequest obj = new JsonObjectRequest(Request.Method.GET, mainURL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    System.out.println(response);
                    JSONObject coord = response.getJSONObject("coord");
                    latitude = coord.getDouble("lat");
                    longitude = coord.getDouble("lon");

                    JSONArray weather = response.getJSONArray("weather");
                    JSONObject weatherObj = weather.getJSONObject(0);
                    description = weatherObj.getString("main");

                    JSONObject main = response.getJSONObject("main");
                    temperature = main.getInt("temp");
                    feelsLikeTemperature = main.getInt("feels_like");
                    pressure = main.getInt("pressure");
                    humidity = main.getInt("humidity");

                    visibility = response.getInt("visibility");
                    date = response.getInt("dt");
                    cityName = response.getString("name");

                    JSONObject wind = response.getJSONObject("wind");
                    windSpeed = wind.getInt("speed");

                    JSONObject sys = response.getJSONObject("sys");
                    countryCode = sys.getString("country");
                    sunrise = sys.getInt("sunrise");
                    sunset = sys.getInt("sunset");




                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

    }

}
