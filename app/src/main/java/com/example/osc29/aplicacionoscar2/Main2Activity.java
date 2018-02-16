package com.example.osc29.aplicacionoscar2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class Main2Activity extends AppCompatActivity {
    VideoView videovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videovie=(VideoView) findViewById(R.id.videoView);
        String videopath;
        videopath = "android.resource://com.example.osc29.aplicacionoscar2/"+R.raw.dragon;
        Uri uri = Uri.parse(videopath);
        //Uri uri= Uri.parse("https://www.youtube.com/watch?v=yQUq-Z0k-zo");
        videovie.setMediaController(new MediaController(this));
        videovie.setVideoURI(uri);
        videovie.requestFocus();

        videovie.start();

        

        //videovie.start();mWebView.getSettings().setJavaScriptEnabled(true);
        //videovie.getSettings().setPluginState(PluginState.ON);
        //videovie.loadUrl("http://www.youtube.com/embed/" + videoID + "?autoplay=1&vq=small");
        //videovie.setWebChromeClient(new WebChromeClient());


        }
}

