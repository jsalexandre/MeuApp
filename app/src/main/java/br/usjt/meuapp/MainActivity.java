package br.usjt.meuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


//será chamado quando o usuário clicar em Enviar
public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) fndViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        }

