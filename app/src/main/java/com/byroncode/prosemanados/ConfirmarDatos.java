package com.byroncode.prosemanados;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        final TextView tvName = (TextView) findViewById(R.id.tvName);
        TextView tvFecNac = (TextView) findViewById(R.id.tvFechaNac);
        TextView tvTel = (TextView) findViewById(R.id.tvTel);
        TextView tvMail = (TextView) findViewById(R.id.tvEmail);
        TextView tvDesc = (TextView) findViewById(R.id.tvDesc);

        Intent intent = getIntent();

        tvName.setText(intent.getStringExtra("name"));
        tvFecNac.setText(intent.getStringExtra("FecNac"));
        tvTel.setText(intent.getStringExtra("Tel"));
        tvMail.setText(intent.getStringExtra("Mail"));
        tvDesc.setText(intent.getStringExtra("Desc"));

        Button btnEditar = (Button) findViewById(R.id.btnEditar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("name", tvName.getText().toString());
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}