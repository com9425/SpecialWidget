package com.example.pr7_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    EditText edtName,edtEmail;
    Button btn;
    View dlgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlgView=(View)View.inflate(MainActivity.this,R.layout.activity_main,null);
                dlgEdtEmail=(EditText)dlgView.findViewById(R.id.dlgEdtEmail);
                dlgEdtName=(EditText)dlgView.findViewById(R.id.dlgEdtName);
                dlg.setView(dlgView);
            }
        });
    }
}
