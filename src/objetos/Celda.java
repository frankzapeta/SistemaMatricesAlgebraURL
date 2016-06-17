/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author EST1583708
 */
public class Celda {

    public int numero;
    public int posi;
    public int posj;
    public Celda sigD;
    public Celda sigA;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPosi() {
        return posi;
    }

    public void setPosi(int posi) {
        this.posi = posi;
    }

    public int getPosj() {
        return posj;
    }

    public void setPosj(int posj) {
        this.posj = posj;
    }

    public Celda getSigD() {
        return sigD;
    }

    public void setSigD(Celda sigD) {
        this.sigD = sigD;
    }

    public Celda getSigA() {
        return sigA;
    }

    public void setSigA(Celda sigA) {
        this.sigA = sigA;
    }
    
}
