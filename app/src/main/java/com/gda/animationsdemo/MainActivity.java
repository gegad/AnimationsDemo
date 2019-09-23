package com.gda.animationsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener, Animation.AnimationListener {

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

        mSeekBarSpeed = (SeekBar) findViewById(R.id.seekBarSpeed);
        mTextSpeed = (TextView) findViewById(R.id.textSeekerSpeed);

        mSeekBarSpeed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekBarProgress = i;
                mTextSpeed.setText("" + i + " of " + mSeekBarSpeed.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnFadeIn:
                animFadeIn.setDuration(seekBarProgress);
                animFadeIn.setAnimationListener(this);
                mImageView.startAnimation(animFadeIn);
                break;
            case R.id.btnFadeOut:
                animFadeOut.setDuration(seekBarProgress);
                animFadeOut.setAnimationListener(this);
                mImageView.startAnimation(animFadeOut);
                break;
            case R.id.btnFadeInOut:
                animFadeInOut.setDuration(seekBarProgress);
                animFadeInOut.setAnimationListener(this);
                mImageView.startAnimation(animFadeInOut);
                break;
            case R.id.btnZoomIn:
                animZoomIn.setDuration(seekBarProgress);
                animZoomIn.setAnimationListener(this);
                mImageView.startAnimation(animZoomIn);
                break;
            case R.id.btnZoomOut:
                animZoomOut.setDuration(seekBarProgress);
                animZoomOut.setAnimationListener(this);
                mImageView.startAnimation(animZoomOut);
                break;
            case R.id.btnLeftRight:
                animLeftRight.setDuration(seekBarProgress);
                animLeftRight.setAnimationListener(this);
                mImageView.startAnimation(animLeftRight);
                break;
            case R.id.btnRightLeft:
                animRightLeft.setDuration(seekBarProgress);
                animRightLeft.setAnimationListener(this);
                mImageView.startAnimation(animRightLeft);
                break;
            case R.id.btnTopBot:
                animTopBot.setDuration(seekBarProgress);
                animTopBot.setAnimationListener(this);
                mImageView.startAnimation(animTopBot);
                break;
            case R.id.btnBounce:
/*
Divide seekBarProgress by 10 because with
the seekbar having a max value of 5000 it
will make the animations range between
almost instant and half a second
5000 / 10 = 500 milliseconds
*/
                animBounce.setDuration(seekBarProgress / 10);
                animBounce.setAnimationListener(this);
                mImageView.startAnimation(animBounce);
                break;
            case R.id.btnFlash:
                animFlash.setDuration(seekBarProgress / 10);
                animFlash.setAnimationListener(this);
                mImageView.startAnimation(animFlash);
                break;
            case R.id.btnRotateLeft:
                animRotateLeft.setDuration(seekBarProgress);
                animRotateLeft.setAnimationListener(this);
                mImageView.startAnimation(animRotateLeft);
                break;
            case R.id.btnRotateRight:
                animRotateRight.setDuration(seekBarProgress);
                animRotateRight.setAnimationListener(this);
                mImageView.startAnimation(animRotateRight);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {
        mTextView.setText("RUNNING");
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        mTextView.setText("STOPPED");
    }
}
