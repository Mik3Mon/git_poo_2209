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
public class UsarInstrumentos {
    public static void main(String[] args) {
        Guitarra g = new Guitarra(Instrumento.GUITARRA);
        Piano p = new Piano(Instrumento.PIANO);
        Flauta f = new Flauta(Instrumento.FLAUTA);
        
        System.out.println(g.emitirSonido());
        System.out.println("--------");
        System.out.println(p.emitirSonido());
        System.out.println("--------");
        System.out.println(f.emitirSonido());
        
        System.out.println(g.getTipoInstrumento());
        System.out.println(p.getTipoInstrumento());
        System.out.println(f.getTipoIntrumento());
        
        switch (g.getTipoInstrumento()) {
            case Instrumento.GUITARRA:
                System.out.println("El instrumento es una guitarra");
                break;
            case Instrumento.PIANO:
                System.out.println("Es un piano");
                break;
            case Instrumento.FLAUTA:
                System.out.println("Es una flauta");
                break;
        }
    }
}
