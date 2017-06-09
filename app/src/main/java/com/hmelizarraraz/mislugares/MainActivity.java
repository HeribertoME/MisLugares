package com.hmelizarraraz.mislugares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irCine(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(MapsActivity.LAT, 19.619271577976765);
        intent.putExtra(MapsActivity.LONG, -98.9971484377686);
        intent.putExtra(MapsActivity.NAME, "Cine");
        startActivity(intent);
    }

    public void irParque(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(MapsActivity.LAT, 19.692673066802467);
        intent.putExtra(MapsActivity.LONG, -98.98938499494022);
        intent.putExtra(MapsActivity.NAME, "Parque");
        startActivity(intent);
    }

    public void irPizza(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(MapsActivity.LAT, 19.68266737142036);
        intent.putExtra(MapsActivity.LONG, -98.99389647050327);
        intent.putExtra(MapsActivity.NAME, "Pizzas");
        startActivity(intent);
    }

    public void irTienda(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(MapsActivity.LAT, 19.6666195777137);
        intent.putExtra(MapsActivity.LONG, -99.01717268033451);
        intent.putExtra(MapsActivity.NAME, "Multiplaza");
        startActivity(intent);
    }


}
