package dsa;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {

   Node root;

   public BinaryTree() {
       root = null;
   }
   
   //Method to insert a new node with a given value.
    public void insert(int data) {
       root = insertValue(root, data);
    }

    //A recursive function to insert a new value on the BST.
    public Node insertValue(Node root, int data) {

       if(root==null){
           //If the tree is empty, return a new node.
           root=new Node(data);
           return root;
       }

       //Otherwise, recur down the tree.
       if(data<root.data){
           root.left=insertValue(root.left, data);
       }else if(data>root.data){
           root.right=insertValue(root.right, data);
       }

       //Return the unchanged root pointer.
       return root;
    }

    public void inOrderTraversal(Node root) {
       if(root!=null){
           inOrderTraversal(root.left);
           System.out.print(root.data+" ");
           inOrderTraversal(root.right);
       }
    }

    public void preOrderTraversal(Node root) {
       if(root!=null){
           System.out.print(root.data+" ");
           preOrderTraversal(root.left);
           preOrderTraversal(root.right);
       }
    }

    public void postOrderTraversal(Node root) {
       if(root!=null){
           postOrderTraversal(root.left);
           postOrderTraversal(root.right);
           System.out.print(root.data+" ");
       }
    }

    public boolean search(int data) {
       return searchData(root, data);
    }

    public boolean searchData(Node root, int data) {
       if(root==null){return false;}
       if(root.data==data){return true;}
       if(data<root.data){
           return searchData(root.left,data);
       }else{
           return searchData(root.right,data);
       }
    }

    public int findMin(){
       return findMinValue(root.left);
    }

    public int findMinValue(Node root){
       if(root==null){
           throw new IllegalStateException("Tree is empty");
       }

       if(root.left==null){
           return root.data;
       }

       return findMinValue(root.left);
    }

    public int findMax(){
       return findMaxValue(root.right);
    }

    public int findMaxValue(Node root){
       if(root==null){
           throw new IllegalStateException("Tree is empty");
       }
       if(root.right==null){
           return root.data;
       }
       return findMaxValue(root.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(55);
        tree.insert(60);
        tree.insert(70);


        System.out.println("inOrderTraversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println("\n" + "preOrderTraversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println("\n" + "postOrderTraversal:");
        tree.postOrderTraversal(tree.root);

        int valueToSearch = 515;
        System.out.println("\n" + "search value: " + valueToSearch);
        if(tree.search(valueToSearch)){
            System.out.println("The value: " + valueToSearch + " has been found in the Tree.");
        }else {System.out.println("The value: " + valueToSearch + " hasn't been found in the Tree.");}

        System.out.println(tree.findMin());
        System.out.println(tree.findMax());
    }
}
