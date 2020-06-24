package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class util {


    public static void preOrderTraversal(TreeNode root){
        if (root==null)
            return;

        System.out.print(" "+root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public static void inOrderTraversal(TreeNode root){
        if (root==null)
            return;

        inOrderTraversal(root.left);
        System.out.print(" "+root.data);
        inOrderTraversal(root.right);

    }
    public static void postOrderTraversal(TreeNode root){
        if (root==null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" "+root.data);

    }

    public void levelOrderTraversal(TreeNode root){
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        System.out.println();
        while(queue.size() > 0){
            root = queue.poll();
            System.out.print(root.data + " ");
            if(root.left != null){
                queue.add(root.left);
            }
            if(root.right != null){
                queue.add(root.right);
            }
        }
    }

}
