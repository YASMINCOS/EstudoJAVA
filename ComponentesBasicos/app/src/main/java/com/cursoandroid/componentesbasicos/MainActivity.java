package com.cursoandroid.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private  EditText campoNome;
    private  TextInputEditText campoEmail;
    private  TextView textoresultado;

    private CheckBox checkVerde,checkBranco, checkVermelho;
    private RadioButton sexoMaculimo,sexoFeminino;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome= findViewById(R.id.editNome);
        campoEmail=findViewById(R.id.editEmail);
        textoresultado= findViewById(R.id.Resultado);


        //Checkbox
        checkVerde=findViewById(R.id.checkVerde);
        checkBranco=findViewById(R.id.checkBranco);
        checkVermelho=findViewById(R.id.checkVermelho);


        sexoFeminino=findViewById(R.id.radioButtonFeminino);
        sexoMaculimo=findViewById(R.id.radioButtonMasculino);

    }


    public  void radiobutton(){

        if(sexoMaculimo.isChecked()){
            textoresultado.setText("Masculino");
        }else if (sexoFeminino.isChecked()){
            textoresultado.setText("Feminino");
        }

    }





    public  void  enviar(View view){
        radiobutton();


        /*
        String nome = campoNome.getText().toString();
        String email= campoEmail.getText().toString();
        textoresultado.setText("nome:"+nome + " email:" + email);
        */
    }
    public  void  checkbox(){
        String texto="";
        if (checkVerde.isChecked() ) {

            texto="Verde selecionado -";
        }

        if (checkBranco.isChecked() ) {
            texto= texto + "Branco selecionado -";
        }

        if (checkVermelho.isChecked() ) {
            texto=texto+"Vermelho selecionado -";
        }
        textoresultado.setText(texto);

    }

    public  void  limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");




    }

}
