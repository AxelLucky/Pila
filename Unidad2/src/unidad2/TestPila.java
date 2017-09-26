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
        Pila p=new Pila(6);
        p.getTope();
        p.pop();
        p.isEmpty();
        p.push(2);
        p.push(19);
        p.push(23);
        p.push(25);
        p.push(1);
        p.isFull();
        p.push(3);
        p.isFull();
        p.isEmpty();
        p.push(10);
        int n=p.getTope();
        System.out.println(n);
        p.pop();
        p.pop();
        n=p.getTope();
        System.out.println(n);
    }
}
