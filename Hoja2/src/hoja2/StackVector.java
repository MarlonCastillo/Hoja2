/*
Carlos Javier Lima Cordón, 14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 14102
Maria Jose Lopez, 14056
*/

import java.util.Vector;

public class StackVector<E> implements Stack<E>{ //Clase hija que se implementa de la clase padre Stack
    protected Vector<E>data;
    
    public StackVector(){
        data = new Vector<E>();
    }
    
    public void push(E item){ //Método que sirve para meter un item al stack
        data.add(item);
    }
    
    public E pop(){ //Método que sirve para sacar un item del stack
        return data.remove(size()-1);
    }
    
    public E peek(){ //Método que sirve para consultar el último item del stack
        return data.get(size() - 1);
    }
    
    public boolean empty(){ //Método que sirve para saber si el stack está vacio
        return size() == 0;
    }
    
    public int size(){ //Método que sirve para saber la cantidad de items que contiene el stack
        return data.size();
    }
}
