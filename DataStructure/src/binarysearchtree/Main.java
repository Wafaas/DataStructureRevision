package binarysearchtree;

public class Main {
    public static void main(String[] args){
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);
        System.out.println("root: " + myBST.root.value);
        System.out.println("Left Child: "+ myBST.root.left.value);
        System.out.println("Right Child: "+ myBST.root.right.value);
        System.out.println("Left left Child: "+ myBST.root.left.left.value);
        System.out.println("Left right Child: "+ myBST.root.left.right.value);
        System.out.println("Right left Child: "+ myBST.root.right.left.value);
        System.out.println("Right right Child: "+ myBST.root.right.right.value);


    }
}
