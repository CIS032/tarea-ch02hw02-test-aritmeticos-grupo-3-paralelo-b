/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpreguntasaritmeticas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 3
 */
public class TestAritmetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int resp;
        String r = "N#         PREGUNTA     RESP INGRESADA   RESP CORRECTA       PUNTAJE\n";
        int Puntaje = 0;
        ArrayList<PreguntaEntera> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int opc = (int) (Math.random() * 3 + 1);
            if (opc == 1) {
                lista.add(new PreguntaAdicion());
            }
            if (opc == 2) {
                lista.add(new PreguntaResta());
            }
            if (opc == 3) {
                lista.add(new PreguntaMultiplicacion());
            }
        }

        for (int i = 0; i < 10; i++) {
            int valor = 0;
            r = r + (i + 1) + "\t";
            r = r + lista.get(i).getPregunta() + "\t";

            if (lista.get(i).getPregunta().length() <= 15) {
                r = r + " \t";
            }

            resp = Integer.parseInt(JOptionPane.showInputDialog(null, lista.get(i).getPregunta()));
            r = r + resp + "\t\t";
            if (resp == lista.get(i).getRespuestaCorrecta()) {
                valor = 10;
                Puntaje = Puntaje + valor;

            }
            r = r + lista.get(i).getRespuestaCorrecta() + "\t\t";

            r = r + valor + "\n";

        }
        System.out.println(r);
        System.out.println("Puntaje: " + Puntaje);

    }

}
