package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnToastShow;
    Toast mToast;
    View toastView;
    ImageView toastivAndroid;
    int index=0;
    Integer imgID[]={R.drawable.nougat, R.drawable.oreo, R.drawable.pie};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToastShow=(Button)findViewById(R.id.btnToastShow);
        btnToastShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display display=((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int x=(int)(Math.random()*display.getWidth());
                int y=(int)(Math.random()*display.getHeight());
                mToast=new Toast(MainActivity.this);
                toastView=(View)View.inflate(MainActivity.this,R.layout.toast,null);
                toastivAndroid=(ImageView)toastView.findViewById(R.id.ToastivAndroid); //
                if(index==3){
                    index=0;

                }
                toastivAndroid.setImageResource(imgID[index]);
                index++;
                mToast.setView(toastView);
                mToast.setGravity(Gravity.TOP | Gravity.LEFT, x, y);
                mToast.show();
            }
        });
    }
}
