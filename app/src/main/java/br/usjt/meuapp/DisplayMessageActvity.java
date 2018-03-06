package br.usjt.meuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message =
        intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup)
        fndViewById(R.id.activity_display_message);
        layout.addView(textView);
        }
}
