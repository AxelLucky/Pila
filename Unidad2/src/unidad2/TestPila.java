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
        Object n;
        Pila p=new Pila(6);
        p.getTope();
        p.pop();
        p.isEmpty();
        p.push(2);
        p.push("s");
        p.push(23);
        p.push(2.5);
        p.push(1);
        p.isFull();
        p.push("s");
        p.isFull();
        p.isEmpty();
        p.push("A");
        n = p.getTope();
        System.out.println(n);
        p.pop();
        p.pop();
        n=p.getTope();
        System.out.println(n);
    }
}
