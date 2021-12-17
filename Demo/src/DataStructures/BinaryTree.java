package DataStructures;


class tNode {
    int data;
    tNode left;
    tNode right;
    tNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    tNode root; //Root for the Binary Tree
    BinaryTree(int data)
    {
        this.root = new tNode(data);
    }

    int treeSum(tNode root)
    {
        if(root == null) return 0;
        return root.data + treeSum(root.left) + treeSum(root.right);
    }

    int countNodes(tNode root)
    {
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int countLeaf(tNode root)
    {
        if(root==null)return 0;

       if(root.left==null && root.right==null)
            return 1;
       else
           return countNodes(root.left)+countNodes(root.right);

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(2); //Create a BT with 2 as the root.
        bt.root.left = new tNode(3);
        bt.root.right = new tNode(5);
        bt.root.left.right = new tNode(9);
        bt.root.right.left = new tNode(7);
        //Sample tree is created

        System.out.println(bt.treeSum(bt.root));
        System.out.println(bt.countNodes(bt.root));

        System.out.println(bt.countLeaf(bt.root));
    }

}

