package nkk.flam.myfirstapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level1 = save.getInt("Level1", 1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Здесь будет команда для кнопки назад

                //начало конструкции
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);finish();

                }catch (Exception e) {

                }
                //конец конструкции
            }
        });

        //Кнопка для перехода на 1 уровень - начало
        TextView TextView1 = (TextView)findViewById(R.id.textView1);
        TextView1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                    if (level1>=1) {
                        Intent intent = new Intent(GameLevels.this, Level1.class);
                        startActivity(intent);
                        finish();
                    }else {
                        //пусто
                    }
                }catch (Exception e){
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 1 уровень - конец

        //Кнопка для перехода на 2 уровень - начало
        TextView TextView2 = (TextView)findViewById(R.id.textView2);
        TextView2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                    if (level1>=2) {
                        Intent intent = new Intent(GameLevels.this, Level2.class);
                        startActivity(intent);
                        finish();
                    }else {
                        //пусто
                    }
                }catch (Exception e){
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 2 уровень - конец

        //Кнопка для перехода на 3 уровень - начало
        TextView TextView3 = (TextView)findViewById(R.id.textView3);
        TextView3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                    if (level1>=3) {
                        Intent intent = new Intent(GameLevels.this, Level3.class);
                        startActivity(intent);
                        finish();
                    }else {
                        //пусто
                    }
                }catch (Exception e){
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 3 уровень - конец

        //Кнопка для перехода на 4 уровень - начало
        TextView TextView4 = (TextView)findViewById(R.id.textView4);
        TextView4.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try {
                    if (level1>=4) {
                        Intent intent = new Intent(GameLevels.this, Level4.class);
                        startActivity(intent);
                        finish();
                    }else {
                        //пусто
                    }
                }catch (Exception e){
                    //пусто
                }
            }
        });
        //Кнопка для перехода на 4 уровень - конец



        //............................................................................Еще уровни?


        //Кнопка для перехода на 30 уровень - начало
        //Кнопка для перехода на 30 уровень - конец

        final int[] x = {
                R.id.textView1,
                R.id.textView2,
                R.id.textView3,
                R.id.textView4,
                R.id.textView5,
                R.id.textView6,
                R.id.textView7,
                R.id.textView8,
                R.id.textView9,
                R.id.textView10,
                R.id.textView11,
                R.id.textView12,
                R.id.textView13,
                R.id.textView14,
                R.id.textView15,
                R.id.textView16,
                R.id.textView17,
                R.id.textView18,
                R.id.textView19,
                R.id.textView20,
                R.id.textView21,
                R.id.textView22,
                R.id.textView23,
                R.id.textView24,
                R.id.textView25,
                R.id.textView26,
                R.id.textView27,
                R.id.textView28,
                R.id.textView29,
                R.id.textView30,
        };

        for (int i=1; i<level1; i++){
            TextView tv = findViewById(x[i]);
            tv.setText(""+(i+1));
        }







    }

    //Системная кнопка "назад" - начало
    @Override
    public void onBackPressed () {
        //начало конструкции
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);finish();

        }catch (Exception e) {

        }
        //конец конструкции
    }


    //Системная кнопка "назад" - конец
}