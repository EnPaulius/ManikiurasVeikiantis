package com.example.moksleivis.manikiuras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.moksleivis.manikiuras.R.id.papildomos_grupe;
import static com.example.moksleivis.manikiuras.R.id.tipu_grupe;

public class New_post extends AppCompatActivity {

    private Spinner naujas_irasas_vieta;
    private Button naujas_irasas_mygtukas;
    private EditText naujas_irasas_vardas, naujas_irasas_numeris;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        //  addItemsOnClothes();
        naujas_irasas_mygtukas();
        // addListenerOnSpinnerItemSelection();
    }

    public void naujas_irasas_mygtukas() {

        naujas_irasas_vardas = (EditText) findViewById (R.id.naujas_irasas_vardas);

        final RadioGroup tipu_grupes = (RadioGroup) findViewById(R.id.tipu_grupe);
        final RadioButton[] tipu_grupe = new RadioButton[1];
        int selectedId = tipu_grupes.getCheckedRadioButtonId();
        tipu_grupe[0] = (RadioButton) findViewById(selectedId);

        naujas_irasas_vieta = (Spinner) findViewById(R.id.naujas_irasas_vieta);

        final RadioGroup papildomos_grupes = (RadioGroup) findViewById(R.id.papildomos_grupe);
        final RadioButton[] papildomos_grupe = new RadioButton[1];
        int selectedId1 = papildomos_grupes.getCheckedRadioButtonId();
        papildomos_grupe[0] = (RadioButton) findViewById(selectedId);

        naujas_irasas_numeris = (EditText) findViewById(R.id.naujas_irasas_numeris);
        naujas_irasas_mygtukas = (Button) findViewById(R.id.naujas_irasas_mygtukas);









        naujas_irasas_mygtukas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                naujas_irasas_vardas.setError(null);
                naujas_irasas_numeris.setError(null);

                final String irasas = naujas_irasas_vardas.getText().toString();
                final String numeris = naujas_irasas_numeris.getText().toString();


                View focusView = null;
                boolean cancel = false;
                boolean sudas = true;
                if (TextUtils.isEmpty(irasas)) {
                    naujas_irasas_vardas.setError(getString(R.string.operation_one_error));
                    focusView = naujas_irasas_vardas;
                    sudas = false;
                }
                if (TextUtils.isEmpty(numeris)) {
                    naujas_irasas_numeris.setError(getString(R.string.operation_one_error));
                    focusView = naujas_irasas_numeris;
                    sudas = false;
                }
                if (sudas){
                    /*Toast.makeText(New_post.this,
                            "Jūsų užsakymas: " +
                                    "\nVartotojas vardas : " + String.valueOf(naujas_irasas_vardas.getText()) +
                                    "\nTipas : " + String.valueOf(tipu_grupes.getCheckedRadioButtonId()) +
                                    "\nVieta : " + String.valueOf(naujas_irasas_vieta.getSelectedItem()) +
                                    "\nPapildomos paslaugos : " + String.valueOf(papildomos_grupes.getCheckedRadioButtonId()) +
                                    "\nNumeris : " + String.valueOf(naujas_irasas_numeris.getText()),
                            Toast.LENGTH_SHORT).show();*/
                    cancel = true;
                }
                if (cancel) {
                    Klientas debil = new Klientas(irasas, numeris,String.valueOf(naujas_irasas_vieta.getSelectedItem()), String.valueOf(papildomos_grupes.getCheckedRadioButtonId()),
                            String.valueOf(tipu_grupes.getCheckedRadioButtonId()) );

                    Toast.makeText(New_post.this,
                            "Jūsų užsakymas: " +
                                    "\nVartotojas vardas : " + debil.getVardas() +
                                    "\nTipas : " + debil.getTipas() +
                                    "\nVieta : " + debil.getVieta() +
                                    "\nPapildomos paslaugos : " + debil.getPapildomos()  +
                                    "\nNumeris : " + debil.getNumeris(),
                            Toast.LENGTH_SHORT).show();

                    Intent myIntent = new Intent(New_post.this, MeniuActivity.class);
                    //myIntent.putExtra("key", value); //Optional parameters
                    New_post.this.startActivity(myIntent);
                }
            }
                });


    }
}
