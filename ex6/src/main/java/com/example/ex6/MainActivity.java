package com.example.ex6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit, rdoHorse;
    Button btnPetshow;
    View dlgView;
    ImageView dlgivPet;
    TextView dlgtvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGroup1=(RadioGroup)findViewById(R.id.rGroup1);
        rdoDog=(RadioButton)findViewById(R.id.rdoDog);
        rdoCat=(RadioButton)findViewById(R.id.rdoCat);
        rdoRabbit=(RadioButton)findViewById(R.id.rdoRabbit);
        rdoHorse=(RadioButton)findViewById(R.id.rdoHorse);
        btnPetshow=(Button)findViewById(R.id.btnPetShow);
        btnPetshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlgView=(View)View.inflate(MainActivity.this,R.layout.dialog,null);
                dlgivPet=(ImageView)dlgView.findViewById(R.id.dlgivPet);
                dlgtvInfo=(TextView)dlgView.findViewById(R.id.dlgtvInfo);
                switch (rGroup1.getCheckedRadioButtonId()){

                    case R.id.rdoDog:
                        dlgivPet.setImageResource(R.drawable.dog);
                        dlgtvInfo.setText("개과에 속하는 포유동물. 야생동물 가운데 가장 먼저 가축화되었다.");
                        dlg.setTitle(rdoDog.getText().toString());
                        // dlg.setTitle("강아지"); 이렇게 해ㅗ도딤
                        break;
                    case R.id.rdoCat:
                        dlgivPet.setImageResource(R.drawable.cat);
                        dlgtvInfo.setText("식육목 고양이과의 포유류에 속하며 \n 애완동물의 고양이 또는 고야이돠의 총칭.");
                        dlg.setTitle(rdoCat.getText().toString());
                        break;
                    case R.id.rdoRabbit:
                        dlgivPet.setImageResource(R.drawable.rabbit);
                        dlgtvInfo.setText("토끼목고양이의 총칭.");
                        dlg.setTitle(rdoRabbit.getText().toString());
                        break;
                    case R.id.rdoHorse:
                        dlgivPet.setImageResource(R.drawable.horse);
                        dlgtvInfo.setText("쓰기귀찮.");
                        dlg.setTitle(rdoHorse.getText().toString());
                        break;

                }
                dlg.setIcon(R.drawable.emo_im_cool);
                dlg.setView(dlgView);
                dlg.setPositiveButton("닫기",null);
                dlg.show();//이거뺴먹지말것
            }
        });
    }
}
