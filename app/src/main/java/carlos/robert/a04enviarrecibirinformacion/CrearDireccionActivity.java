package carlos.robert.a04enviarrecibirinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CrearDireccionActivity extends AppCompatActivity {
    private EditText txtCalle;
    private EditText txtNumero;
    private EditText txtCiudad;
    private Button btnCrearDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_direccion);

        inicializarVista();

        btnCrearDireccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calle;
                int numero;
                String ciudad;

            }
        });
    }

    private void inicializarVista() {
        txtCalle = findViewById(R.id.txtCalleCrear);
        txtNumero = findViewById(R.id.txtNumeroCrear);
        btnCrearDireccion = findViewById(R.id.btnCrearDireccionCrear);
    }
}