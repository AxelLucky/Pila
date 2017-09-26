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
public class Pila {
    int tope=-1;
    int v[];

    public Pila(int max) {
        v=new int [max];
    }   
    public boolean isFull(){
        if(tope==v.length-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(tope==-1)
            return true;
        else
            return false;
    }
    public void push(int n){
        if(isFull()==true)
            System.out.println("La pila esta llena");
        else
            if(tope==-1){
                tope++;
                v[tope]=n;
            }
            else{
                tope++;
                v[tope]=n;
            }       
    }
    public int pop(){
        int a;
        if(isEmpty()==true){
            System.out.println("La pila esta vacia");
            return -1;
        }
        else{
            a=v[tope];
            tope--;
        }
        return a;
    }
    public int getTope(){
        int a;
        if(isEmpty()==true){
            System.out.println("La pila esta vacia");
            return -1;
        }
        else{
            a=v[tope];
            return a;
        }
    }
}

