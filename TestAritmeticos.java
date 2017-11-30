/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmeticos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class TestAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntos = 0;
        ArrayList<PreguntaEntera> preguntas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int pregunta = (int) (Math.random() * 3 + 1);
            if (pregunta == 1) {
                preguntas.add(new PreguntaAdicion());
            } else if (pregunta == 2) {
                preguntas.add(new PreguntaResta());
            } else if (pregunta == 3) {
                preguntas.add(new PreguntaMultiplicacion());
            }
        }
        for (int i = 0; i < 10; i++) {
            preguntas.get(i).setRespuestaUsuario(Integer.parseInt(JOptionPane.showInputDialog(preguntas.get(i).getPregunta())));
        }
        String out = "";
        for (int i = 0; i < 10; i++) {
            out = preguntas.get(i).getPregunta()
                    + "\nSu rspuesta: " + preguntas.get(i).getRespuestaUsuario();
            JOptionPane.showMessageDialog(null, out);
            if (preguntas.get(i).getRespuestaCorrecta() == preguntas.get(i).getRespuestaUsuario()) {
                out = "\n<<<Correcto!!!>>> :) \n+10 puntos";
                puntos += 10;
            } else {
                out = "\n<<<Incorrecto!!!>>> :( \nRespuesta Correcta: " + preguntas.get(i).getRespuestaCorrecta();
            }
            JOptionPane.showMessageDialog(null, out);
        }

        JOptionPane.showMessageDialog(null, "Su puntuacion final es: " + puntos);
    }

}
