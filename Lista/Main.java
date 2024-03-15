public class Main {
    
    public static void main(String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        System.out.println(l);

        l.addSorted(new Nodo(300, null));
        l.addSorted(new Nodo(250, null));
        l.addSorted(new Nodo(350, null));
        l.addSorted(new Nodo(320, null));
        l.addSorted(new Nodo(100, null));
        l.addSorted(new Nodo(170, null));
        l.addSorted(new Nodo(290, null));
         l.addSorted(new Nodo(450, null));

        Nodo nodoPos = new Nodo(400, null);
        l.addAfter(nodoPos, 350);
        System.out.println(l);

        l.removePos(100);
        System.out.println(l);

        l.removeValue(290);
        System.out.println(l);

        Lista.Interatore iter = l.getInterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    } 
}

