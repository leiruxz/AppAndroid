package com.example.appfarmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.SQLException;



public class MainActivity extends AppCompatActivity {
private Button btnConsultar;
private ConexaoMySQL2 conexaoMySQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnConsultar = (Button) findViewById(R.id.btnConsultar);
        this.btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, ListaProdutoActivity.class);
                //startActivity(intent);
                try {
                    conexaoMySQL.conectar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
