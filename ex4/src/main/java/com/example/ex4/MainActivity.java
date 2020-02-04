package com.example.ex4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivPet;
    static  final int ITEM_DOG=1, ITEM_CAT=2, ITEM_RABBIT=3; //가독성을 위해 정의함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivPet=(ImageView)findViewById(R.id.ivPet);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,ITEM_DOG,0,"강아지");
        menu.add(0,ITEM_CAT,0,"고양이");
        menu.add(0,ITEM_RABBIT,0,"토끼");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case ITEM_DOG:
                ivPet.setImageResource(R.drawable.dog);
                break;
            case ITEM_CAT:
                ivPet.setImageResource(R.drawable.cat);
                break;
            case ITEM_RABBIT:
                ivPet.setImageResource(R.drawable.rabbit);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
