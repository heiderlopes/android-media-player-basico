package br.com.heiderlopes.mediaplayerbasico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btPlay, btStop;
    Intent playbackServiceIntent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        btPlay = (Button) findViewById(R.id.btPlay);
        btStop = (Button) findViewById(R.id.btStop);

        btPlay.setOnClickListener(this);
        btStop.setOnClickListener(this);

        playbackServiceIntent = new Intent(this, PlayerServices.class);
    }

    public void onClick(View v) {
        if (v == btPlay) {
            startService(playbackServiceIntent);
            //finish();
        } else if (v == btStop) {
            stopService(playbackServiceIntent);
            //finish();
        }
    }
}
