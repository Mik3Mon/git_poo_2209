/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClasePersona;

/**
 *
 * @author dmathews
 */
public class Persona {
    private String nombre;
    private String curp;
    private String fechaDeNacimiento;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, String curp, String fechaDeNacimiento, String sexo) {
        this.nombre = nombre;
        this.curp = curp;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void caminar() {
        System.out.println(this.nombre+" Esta Caminando..");
    }
    
    public void comer() {
        System.out.println(this.nombre+" Esta comiendo..");
    }
    
    public float multiplicar() {
        int a = 10;
        double b = 8.4;
        double c = a*b;
        return 0;
    }
    
    public float dividir() {
        int a = 19;
        double b = 2*2;
        double c = a/b;
        return 0;
    }
    
    @Override
    public String toString() {
        String res = "Nombre:"+this.nombre +"\n";
        res = res + "Curp:"+this.curp +"\n";
        res = res + "Fecha De Nacimiento:"+this.fechaDeNacimiento+"\n";
        res = res + "Peso:"+this.sexo+"\n";
        
        return res;
    }
    
}
