package carlos.robert.a04enviarrecibirinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import carlos.robert.a04enviarrecibirinformacion.modelos.Usuario;

public class MainActivity extends AppCompatActivity {
    private EditText txtPassword;
    private EditText txtEmail;
    private Button btnDesencriptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();
        btnDesencriptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtPassword.getText().toString();
                String email = txtEmail.getText().toString();
                Usuario usuario = new Usuario(email,password);

                Intent intent = new Intent(MainActivity.this, DesencriptarActivity.class);
                //ENVIAR INFORMACIÓN A LA SIGUIENTE ACTIVIDAD
                Bundle bundle = new Bundle();

                //bundle.putString("PASS", password);
                bundle.putSerializable("USER", usuario);

                intent.putExtras(bundle);

                //LANZAR SIGUIENTE ACTIVIDAD
                startActivity(intent);
            }
        });

    }

    private void inicializarVista() {
        txtPassword = findViewById(R.id.txtPasswordMain);
        txtEmail = findViewById(R.id.txtEmailMain);
        btnDesencriptar = findViewById(R.id.btnDesencriptarMain);
    }
}