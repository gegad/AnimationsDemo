package com.gda.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animFadeIn;
    Animation animFadeOut;
    Animation animFadeInOut;
    Animation animZoomIn;
    Animation animZoomOut;
    Animation animLeftRight;
    Animation animRightLeft;
    Animation animTopBot;

    ImageView mImageView;
    TextView mTextView;

    Button btnFadeIn;
    Button btnFadeOut;
    Button btnFadeInOut;
    Button btnZoomIn;
    Button btnZoomOut;
    Button btnLeftRight;
    Button btnRightLeft;
    Button btnTopBot;

    SeekBar mSeekBarSpeed;
    TextView mTextSpeed;
    int seekBarProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadAnimations();
        loadUI();

    }
}
