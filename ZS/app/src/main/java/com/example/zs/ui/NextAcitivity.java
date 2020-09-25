package com.example.zs.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.zs.R;
import com.example.zs.service.model.Event;
import com.example.zs.service.repository.EventService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NextAcitivity extends AppCompatActivity {

    private EventService eventService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_acitivity);
    }



    private void doLogin(final String email,final String password){
        Call call = eventService.getEventList();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                updateUi((List<Event>) response.body());
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(NextAcitivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updateUi(List<Event> eventList)
    {

    }
}
