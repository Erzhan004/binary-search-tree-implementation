import java.util.Iterator;

public class Main {
    public static void main(String[] args){
    BST<Integer,String> bts = new BST();
    bts.put(5,"Erzhan");
    bts.put(2,"Sagi");
    bts.put(7,"Arnal");
    bts.put(6,"Tamer");
    bts.put(9,"Armat");
    bts.put(10,"Orasyl");
    bts.put(8,"Dias");


        for (var elemet: bts) {
            System.out.println("Key: " + elemet.getKey() + " " +  "Value: " + elemet.getValue() );
        }



        System.out.println();
        for (var element: bts){
            System.out.println(element);
        }



        bts.delete(9);
        System.out.println();
        for (var elemet: bts) {
            System.out.println("Key: " + elemet.getKey() + " " +  "Value: " + elemet.getValue() );
        }


        System.out.println('\n'+bts. getKey(5));
        System.out.println(bts. getKey(7));

    }
}