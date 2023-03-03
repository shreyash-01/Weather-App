package com.shreyash.weatherapp;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class CurrentWeatherService {
    private Context context;
    public CurrentWeatherService(Context context){
        this.context = context;
    }

    private final String API_KEY = BuildConfig.API_KEY;
    private final String URL = "https://api.openweathermap.org/data/2.5/weather?";
    private String city;
    private String scale;

    void getData(String city){
        RequestQueue requestQueue = Volley.newRequestQueue(context);

        String final_URL = URL + "q=" + city + "&appid=" + API_KEY;

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                final_URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println(response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("ERROR");
            }
        });
        requestQueue.add(jsonObjectRequest);
    }
}
