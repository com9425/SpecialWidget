package com.example.dialogex;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnInfo;
    String pet[] = {"강아지","고양이","토끼"};
    int ImgID[]={R.drawable.dog,R.drawable.cat,R.drawable.mon};
    boolean check[]={false,false,false};
    String choicePet;
    int position;
    ImageView cat,mon,rabbit,ivpet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInfo=(Button)findViewById(R.id.btnInfo);
        ivpet=(ImageView)findViewById(R.id.ivPet) ;
        btnInfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            /*    dlg.setTitle("전달사항");
                dlg.setMessage("내일까지만 수업합니다.(이번주는...)\n(확인버튼을 누르면 앱이 종료됩니다.)");
                dlg.setIcon(R.drawable.zoroicon);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {//왼쪽으로 위치
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"취소버튼을 누릇서 화면으로 돌아갑니다.",Toast.LENGTH_SHORT).show();
                    }
                });*/
                dlg.setTitle("좋아하는 동물은?");
                dlg.setIcon(R.drawable.zoroicon);
                /*dlg.setItems(pet, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btnInfo.setText(pet[which]);
                    }
                });
                dlg.setPositiveButton("닫기",null);*/
                dlg.setSingleChoiceItems(pet, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        btnInfo.setText("동물선택중...." );
                        position=which;

                    }
                });

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                     btnInfo.setText("선택된 동물 : "+ pet[position]);
                     ivpet.setImageResource(ImgID[position]);
                        }

                });
/*
              dlg.setMultiChoiceItems(pet, check, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });*/
               dlg.show();
            }
        });
    }
}
