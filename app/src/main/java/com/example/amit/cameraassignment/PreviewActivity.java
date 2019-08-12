package com.example.amit.cameraassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PreviewActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        imageView =findViewById(R.id.image);
        imageView.setImageBitmap(MainActivity.bitmap);
    }





    public void goback(View view) {
        Intent intent = new Intent(PreviewActivity.this, MainActivity.class);
//                intent.putExtra("image",bitmap);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
