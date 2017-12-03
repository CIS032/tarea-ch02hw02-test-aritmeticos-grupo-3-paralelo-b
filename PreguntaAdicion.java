/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmeticos;

/**
 *
 * @author Grupo 3
 */
public class PreguntaAdicion implements PreguntaEntera {

    private int a;
    private int b;
    private int respuestaUsuario;

    public PreguntaAdicion() {
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
        return "Cuanto es " + a + " + " + b + "?";
    }

    @Override
    public int getRespuestaCorrecta() {
        return a + b;
    }
}
