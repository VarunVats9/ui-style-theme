package com.example.vvats.uistyleandtheme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onImageClick(View view) {
        Toast.makeText(this, "This button has been clicked", Toast.LENGTH_SHORT).show();
    }
}
