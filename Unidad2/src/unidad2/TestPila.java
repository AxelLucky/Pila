/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author Propietario
 */
public class TestPila {
    public static void main(String [] args){
        PilaDinamica p=new PilaDinamica();
        for(int i=0;i<=30;i++){
            p.push(i);
        }  
        p.pop();
        System.out.println(p.getTope());
    }
}
