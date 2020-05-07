/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAuto;

/**
 *
 * @author dmathews
 */
public class Motor {
    private String litros;
    private String caballosFuerza;
    private boolean turbo;

    public Motor() {
    }

    public Motor(String litros, String caballosFuerza, boolean turbo) {
        this.litros = litros;
        this.caballosFuerza = caballosFuerza;
        this.turbo = turbo;
    }
    
    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    public String getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(String caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
