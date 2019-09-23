package com.gda.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

    Animation animBounce;
    Animation animFlash;

    Animation animRotateLeft;
    Animation animRotateRight;

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
    Button btnBounce;
    Button btnFlash;
    Button btnRotateLeft;
    Button btnRotateRight;

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

    private void loadAnimations() {
        animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        animFadeIn.setAnimationListener(this);
        animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        animFadeInOut  = AnimationUtils.loadAnimation(this, R.anim.fade_in_out);

        animZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);

        animLeftRight = AnimationUtils.loadAnimation(this, R.anim.left_right);
        animRightLeft = AnimationUtils.loadAnimation(this, R.anim.right_left);
        animTopBot = AnimationUtils.loadAnimation(this, R.anim.top_bot);

        animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        animFlash = AnimationUtils.loadAnimation(this, R.anim.flash);

        animRotateLeft = AnimationUtils.loadAnimation(this, R.anim.rotate_left);
        animRotateRight = AnimationUtils.loadAnimation(this, R.anim.rotate_right);
    }

    private void loadUI() {
        mImageView = (ImageView) findViewById(R.id.imageView);
        mTextView = (TextView) findViewById(R.id.textStatus);
        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnFadeInOut = (Button) findViewById(R.id.btnFadeInOut);
        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnLeftRight = (Button) findViewById(R.id.btnLeftRight);
        btnRightLeft = (Button) findViewById(R.id.btnRightLeft);
        btnTopBot = (Button) findViewById(R.id.btnTopBot);
        btnBounce = (Button) findViewById(R.id.btnBounce);
        btnFlash = (Button) findViewById(R.id.btnFlash);
        btnRotateLeft = (Button) findViewById(R.id.btnRotateLeft);
        btnRotateRight = (Button) findViewById(R.id.btnRotateRight);

        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnFadeInOut.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnLeftRight.setOnClickListener(this);
        btnRightLeft.setOnClickListener(this);
        btnTopBot.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnFlash.setOnClickListener(this);
        btnRotateLeft.setOnClickListener(this);
        btnRotateRight.setOnClickListener(this);
    }
}
