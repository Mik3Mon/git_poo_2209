/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.instrumentos;

/**
 *
 * @author dmathews
 */
public class Piano implements Instrumento {
    private int tipoInstrumento;

    public Piano() {
    }

    public Piano(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public int getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(int tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }
    
    @Override
    public boolean afinar() {
        boolean afinado = false;
        System.out.println("Tocando todas las teclas xd");
        System.out.println("Repetir hasta que creamos necesario");
        afinado = true;
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String notas = "";
        notas = "suena Cuatro estaciones...";
        return notas;
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando cada una de las teclas");
        System.out.println("Limpiando cuerpo de el piano");
        System.out.println("Limpiar aciento del musico");
    }
    
}
