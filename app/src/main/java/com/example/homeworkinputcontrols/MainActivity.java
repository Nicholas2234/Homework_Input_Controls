package com.example.homeworkinputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String message="Toppings:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMessage(View view) {
        selectToppings((CheckBox) findViewById(R.id.chocolate_syrup), getString(R.string.chocolate_syrup));
        selectToppings((CheckBox) findViewById(R.id.Sprinkles), getString(R.string.sprinkles));
        selectToppings((CheckBox) findViewById(R.id.Crushed_nuts), getString(R.string.crushed_nuts));
        selectToppings((CheckBox) findViewById(R.id.Cherries), getString(R.string.cherries));
        selectToppings((CheckBox) findViewById(R.id.Orio_cookie_crumbles), getString(R.string.orio_cookie_crumbles));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    private void selectToppings(CheckBox checkBox, String topping) {
        if (checkBox.isChecked()) {
            if (!message.contains(topping)) {
                message = message + " " + topping;
            }
        } else {
            if (message.contains(topping)) {
                message = message.replace(" " + topping, "");
            }
        }
    }
}