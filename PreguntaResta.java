/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmeticos;

/**
 *
 * @author alex
 */
public class PreguntaResta implements PreguntaEntera {

    private int a;
    private int b;
    private int respuestaUsuario;

    public PreguntaResta() {
        this.a = (int) (Math.random() * 50 + 1);
        this.b = (int) (Math.random() * 50);
    }

    @Override
    public int getRespuestaUsuario() {
        return respuestaUsuario;
    }

    @Override
    public void setRespuestaUsuario(int respuestaUsuario) {
        this.respuestaUsuario = respuestaUsuario;
    }

    @Override
    public String getPregunta() {
        return "La resta entre " + a + " y " + b + " es?";
    }

    @Override
    public int getRespuestaCorrecta() {
        return a - b;
    }
}
