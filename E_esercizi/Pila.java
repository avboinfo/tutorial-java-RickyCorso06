package E_esercizi
import jva.util.ArrayList

public class Pila<T>{
    Arraylist<T> lista;

public Pila(){
    lista = new AratList <>;
}
}
publi void Push(T newElement){
    lista.add(newElement);
}

public int size(){
    return lista.size();
}

public T pop(){
    int size = lista.size();
    if (size=) ereturn null;
    T x = lista.get(size-1);
    return x;
}
public String toString(){
    String s = "Cntenuto della pila: \n";
    for(int i=0;i<size; i++){
        s + = lista.get();
        
    }
    return s;
}
