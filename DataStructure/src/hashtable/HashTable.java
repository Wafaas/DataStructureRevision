package hashtable;

import java.util.ArrayList;

public class HashTable {
    int size;
    Node[] hashMap;

    public class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int size) {
        hashMap = new Node[size];
    }

    public void printTable() {
        for (int i=0; i<hashMap.length; i++) {
            System.out.println(i + ": ");
            Node temp = hashMap[i];
            while (temp != null) {
                System.out.println("{" + temp.key + ", "+ temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public int hash(String key) {
        int hash= 0;
        char[] keyChars = key.toCharArray();
        for(int i=0; i<keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % hashMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (hashMap[index] == null) {
            hashMap[index] = newNode;
        } else {
            Node temp = hashMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = hashMap[index];
        // in collision case, Get value of Node in the linked list for the same index
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList();
        for (int i=0; i<hashMap.length; i++) {
            Node temp = hashMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
