package rohitsingla.rdrock.animationbattery1;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewAnimation;
    AnimationDrawable batteryAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

    }

    void initViews() {
        imageViewAnimation = findViewById(R.id.imageViewAnimation);
        imageViewAnimation.setBackgroundResource(R.drawable.animation);
        batteryAnimation = (AnimationDrawable) imageViewAnimation.getBackground();

        batteryAnimation.start();
    }

}
