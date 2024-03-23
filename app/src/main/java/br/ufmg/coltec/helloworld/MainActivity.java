
package br.ufmg.coltec.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "App inicializado!!");

        final TextView lblHello = findViewById(R.id.lpl_hello);
        final TextView lblHello2 = findViewById(R.id.lpl_hello2);
        final TextView lblHello3 = findViewById(R.id.lpl_hello3);
        final TextView lblHello4 = findViewById(R.id.lpl_hello4);

        //final EditText txtName = findViewById(R.id.txt_name);
        final EditText jogos = findViewById(R.id.jogos);
        final EditText numeros = findViewById(R.id.numeros);
        Button btnUpdate = findViewById(R.id.btn_update);
        btnUpdate.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {

                lblHello.setText("Hello" + numeros.getText());
                int i = 0;
                int quantNumeros = 0;
                int quantJogos = 0;
                double valores = 0;
                double total = 0;

                Set<Integer> numerosSorteados = new HashSet<>();
                Set<Integer> numerosSorteados2 = new HashSet<>();
                Set<Integer> numerosSorteados3 = new HashSet<>();
                Set<Integer> numerosSorteados4 = new HashSet<>();

                Random random = new Random();

                try {
                    quantJogos = Integer.parseInt(jogos.getText().toString());
                    quantNumeros = Integer.parseInt(numeros.getText().toString());
                } catch (NumberFormatException e) {
                    lblHello.setText("Número inválido");
                }

                if (quantJogos < 1 || quantJogos > 4) {
                    lblHello.setText("O numero de jogos não pode ser 0 e nem maior que 4");
                    lblHello2.setText("");
                    lblHello3.setText("");
                    lblHello4.setText("");
                } else {

                if (quantNumeros < 6 || quantNumeros > 20) {
                    lblHello.setText("Numeros sorteados não podem ser menores que 5 e nem maiores que 20");
                    lblHello2.setText("");
                    lblHello3.setText("");
                    lblHello4.setText("");

                } else {

                    switch (quantJogos) {
                    case 1:
                        while(numerosSorteados.size() < quantNumeros) {
                            int randomNumber = random.nextInt(60) + 1; // 1 a 60
                            numerosSorteados.add(randomNumber);
                        }
                            lblHello.setText("Jogo " + (i+1) + "- Numeros sorteados: " + numerosSorteados);
                        break;
                        case 2:
                            while(numerosSorteados.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados.add(randomNumber);
                            }
                            lblHello.setText("Jogo " + (i+1) + "- Numeros sorteados: " + numerosSorteados);
                            while(numerosSorteados2.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados2.add(randomNumber);
                            }
                            lblHello2.setText("Jogo " + (i+2) + "- Numeros sorteados: " + numerosSorteados2);
                            break;
                        case 3:
                            while(numerosSorteados.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados.add(randomNumber);
                            }
                            lblHello.setText("Jogo " + (i+1) + "- Numeros sorteados: " + numerosSorteados);
                            while(numerosSorteados2.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados2.add(randomNumber);
                            }
                            lblHello2.setText("Jogo " + (i+2) + "- Numeros sorteados: " + numerosSorteados2);

                            while(numerosSorteados3.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados3.add(randomNumber); }

                            lblHello3.setText("Jogo " + (i+3) + "- Numeros sorteados: " + numerosSorteados3);

                                break;
                        case 4:
                            while(numerosSorteados.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados.add(randomNumber);
                            }
                            lblHello.setText("Jogo " + (i+1) + "- Numeros sorteados: " + numerosSorteados);
                            while(numerosSorteados2.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados2.add(randomNumber);
                            }
                            lblHello2.setText("Jogo " + (i+2) + "- Numeros sorteados: " + numerosSorteados2);

                            while(numerosSorteados3.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados3.add(randomNumber); }

                            lblHello3.setText("Jogo " + (i+3) + "- Numeros sorteados: " + numerosSorteados3);
                            while(numerosSorteados4.size() < quantNumeros) {
                                int randomNumber = random.nextInt(60) + 1; // 1 a 60
                                numerosSorteados4.add(randomNumber); }
                            lblHello4.setText("Jogo " + (i+4) + "- Numeros sorteados: " + numerosSorteados4);
                            break;
                        default:
                            lblHello.setText("Error");
                            break; }

                            switch (quantNumeros) {
                                case 6:
                                 valores = 5.0;
                                 total = quantJogos * valores;
                                break;
                            case 7:
                                valores = 35.0;
                                total = quantJogos * valores;
                                break;
                            case 8:
                                valores = 140.0;
                                total = quantJogos * valores;
                                break;
                            case 9:
                                valores = 420.0;
                                total = quantJogos * valores;
                                break;
                            case 10:
                                valores = 1050.0;
                                total = quantJogos * valores;
                                break;
                            case 11:
                                valores = 2310.0;
                                total = quantJogos * valores;
                                break;
                            case 12:
                                valores = 4620.0;
                                total = quantJogos * valores;
                                break;
                            case 13:
                                valores = 8580.0;
                                total = quantJogos * valores;
                                break;
                            case 14:
                                valores = 15015.0;
                                total = quantJogos * valores;
                                break;
                            case 15:
                                valores = 25025.0;
                                total = quantJogos * valores;
                                break;
                            case 16:
                                valores = 40040.0;
                                total = quantJogos * valores;
                                break;
                            case 17:
                                valores = 61880.0;
                                total = quantJogos * valores;
                                break;
                            case 18:
                                valores = 92820.0;
                                total = quantJogos * valores;
                                break;
                            case 19:
                                valores = 135660.0;
                                total = quantJogos * valores;
                                break;
                            case 20:
                                valores = 193800.0;
                                total = quantJogos * valores;
                                break;
                            default:
                                lblHello.setText("Error"); }


                    Toast.makeText(getApplicationContext(), " Jogos: " + quantJogos + "\n Total: R$ " + total, Toast.LENGTH_LONG).show();


                }
                }



                //lblHello.setText("Hello" + R.id.numeros);
            }
        });

    }
}