package com.digitalmirko.embeddingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.deargod);

        // video controls
        MediaController mediaController = new MediaController(this);
        // links to video view
        mediaController.setAnchorView(videoView);
        // allow to control video view
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
