package com.example.usuario.app_gridview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {

   GridAdapter adapter;

    String[] titulo = new String[]{
            "audifonos precio: $10",
            "disco duro precio: $200",
            "Teclado precio: $50",
            "memoria usb precio: $5",
    };

    int[] imagenes = {
            R.drawable.audifono,
            R.drawable.disco,
            R.drawable.tecmouse,
            R.drawable.usb
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView lista= (GridView) findViewById(R.id.gridView);
        adapter= new GridAdapter(this,titulo,imagenes);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {


                    case 0:

                        Intent ar = new Intent(MainActivity.this,Audifonos.class );
                        startActivity(ar);
                        break;

                    case 1:
                        Intent ca = new Intent(MainActivity.this,Disco.class );
                        startActivity(ca);
                        break;
                    case 2:

                        Intent co = new Intent(MainActivity.this,tecmouse.class );
                        startActivity(co);
                        break;
                    case 3:
                        Intent mo = new Intent(MainActivity.this,Usb.class );
                        startActivity(mo);
                        break;


                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
