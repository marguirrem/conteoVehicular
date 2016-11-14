package xyz.aguirre.marlon.app.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.aguirre.marlon.app.R;

public class SplashScreen extends AppCompatActivity {

    // Temporizador para la pantalla de bienvenida
    private static int SPLASH_TIEMPO = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {

			/*
			* Mostramos la pantalla de bienvenida con un temporizador.
			* De esta forma se puede mostrar el logo de la app o
			* compañia durante unos segundos.
			*/

            @Override
            public void run() {
                // Este método se ejecuta cuando se consume el tiempo del temporizador.
                // Se pasa a la activity principal
                Intent i = new Intent(SplashScreen.this, ListDaysActivity.class);
                startActivity(i);

                // Cerramos esta activity
                finish();
            }
        }, SPLASH_TIEMPO);
    }
}
