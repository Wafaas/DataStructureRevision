package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable(5);

        myHashTable.set("stuff", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("paint", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

//        myHashTable.printTable();
        System.out.println(myHashTable.keys());
/*
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("paint") );
*/
    }
}
