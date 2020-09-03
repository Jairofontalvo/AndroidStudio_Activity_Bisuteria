package com.example.appbisuteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner material, dije, tipo, moneda;
    private String[] str_material, str_dije, str_tipo, str_moneda;
    private EditText cantidad;
    private TextView total_compra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //config spinner materials
        material = findViewById(R.id.spnMaterial);
        str_material = getResources().getStringArray(R.array.arrayMaterial);
        ArrayAdapter<String> adapterM = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, str_material);
        material.setAdapter(adapterM);
        //config spinner dije
        dije = findViewById(R.id.spnDije);
        str_dije = getResources().getStringArray(R.array.arrayDije);
        ArrayAdapter<String> adapterD = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, str_dije);
        dije.setAdapter(adapterD);
        //config spinner tipo
        tipo = findViewById(R.id.spnTipo);
        str_tipo = getResources().getStringArray(R.array.arrayTipo);
        ArrayAdapter<String> adapterT = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, str_tipo);
        tipo.setAdapter(adapterT);
        //config spinner moneda
        moneda = findViewById(R.id.spnMoneda);
        str_moneda = getResources().getStringArray(R.array.arrayMoneda);
        ArrayAdapter<String> adapterMo = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, str_moneda);
        moneda.setAdapter(adapterMo);
        //capturamos los campos cantidad y total compra
        cantidad = findViewById(R.id.txtCantidad);
        total_compra = findViewById(R.id.lblTotal);
    }

    public void comprar(View v){
        int position_material, position_dije, position_tipo, position_moneda;

        position_material = material.getSelectedItemPosition();
        position_dije = dije.getSelectedItemPosition();
        position_tipo = tipo.getSelectedItemPosition();
        position_moneda = moneda.getSelectedItemPosition();
        int valor_compra = 0, valor_compra_cop = 0;

       if(validar()){
           switch(position_material) {
               case 0:
                   Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                   break;
               case 1:
                   switch(position_dije) {
                       case 0:
                           Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                           break;
                       case 1:
                           switch(position_tipo) {
                               case 0:
                                   Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   break;
                               case 1:
                                   valor_compra = 100 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 2:
                                   valor_compra = 100 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 3:
                                   valor_compra = 80 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 4:
                                   valor_compra = 70 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                           }
                           break;
                       case 2:
                           switch(position_tipo) {
                               case 0:
                                   Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   break;
                               case 1:
                                   valor_compra = 120 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 2:
                                   valor_compra = 120 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 3:
                                   valor_compra = 100 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 4:
                                   valor_compra = 90 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                           }
                   }
                   break;
               case 2:
                   switch(position_dije) {
                       case 0:
                           Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                           break;
                       case 1:
                           switch(position_tipo) {
                               case 0:
                                   Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   break;
                               case 1:
                                   valor_compra = 90 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 2:
                                   valor_compra = 90 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 3:
                                   valor_compra = 70 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 4:
                                   valor_compra = 50 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                           }
                           break;
                       case 2:
                           switch(position_tipo) {
                               case 0:
                                   Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   break;
                               case 1:
                                   valor_compra = 110 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 2:
                                   valor_compra = 110 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 3:
                                   valor_compra = 90 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                               case 4:
                                   valor_compra = 80 * Integer.parseInt( cantidad.getText().toString());
                                   valor_compra_cop = valor_compra * 3200;
                                   if(position_moneda == 0){
                                       Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
                                   }
                                   if(position_moneda == 1){
                                       total_compra.setText( "" + valor_compra );
                                   }
                                   if(position_moneda == 2){
                                       total_compra.setText( "" + valor_compra_cop );
                                   }
                                   break;
                           }
                           break;
                   }
                   break;
           }
       }

    }
    public boolean validar(){
        if (cantidad.getText().toString().isEmpty()){
            Toast.makeText(this, getString(R.string.mesage_error), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}