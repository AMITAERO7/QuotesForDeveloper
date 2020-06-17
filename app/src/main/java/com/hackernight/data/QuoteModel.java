package com.hackernight.data;

import android.app.Application;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.hackernight.controller.AppController;
import com.hackernight.model.Quote;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class QuoteModel extends Application {

    private ArrayList<Quote> quoteArrayList = new ArrayList<>();
    private String baseApiUrl = "https://programming-quotes-api.herokuapp.com/quotes";

    public void getQuote(){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, baseApiUrl, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d("Response: ",""+response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        //// Access the RequestQueue through AppController singleton class...
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);


    }

}
