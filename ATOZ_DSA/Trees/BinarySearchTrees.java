package Trees;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node() {
        this.data = 0;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Trees {
    private Node root;

    public Trees() {
        root = null;
    }

    public void createNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        insertNode(root, newNode);
    }

    private void insertNode(Node node, Node newNode) {
        if (newNode.data < node.data) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertNode(node.left, newNode);
            }
        } else {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertNode(node.right, newNode);
            }
        }
    }

    public int levelsOfTree(Node node, int depth, int val) {
        if (node == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                Node currNode = queue.poll();
                if (currNode.left != null)
                    queue.offer(currNode.left);
                if (currNode.right != null)
                    queue.offer(currNode.right);
                if (count == depth - 1) {
                    InsertNodeAtDepth(currNode, val, depth);
                }
            }
            // Increment the level count
            count++;

        }
        return count;
    }

    public int bfs(Node node) {
        if (node == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            // Process all nodes at the current level

            for (int i = 0; i < size; i++) {
                Node currNode = queue.poll();
                if (currNode.left != null)
                    queue.offer(currNode.left);
                if (currNode.right != null)
                    queue.offer(currNode.right);
            }
            // Increment the level count
            count++;
        }
        return count;
    }

    public void InsertNodeAtDepth(Node node, int val, int depth) {
        Node currNode = node;
        Node left = currNode.left;
        Node right = currNode.right;
        Node leftNode = new Node(val);
        Node rightNode = new Node(val);
        currNode.left = leftNode;
        currNode.right = rightNode;
        leftNode.left = left;
        rightNode.right = right;
    }

    public Node getRoot() {
        return root;
    }

    public void breathFirstSearchTraversal(Node node) {
        if (node == null) {
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }
}

public class BinarySearchTrees {
    public static void main(String[] args) {
        Trees t1 = new Trees();
        for (int i = 0; i < 5; i++) {
            t1.createNode(i);
        }
        int val = 1;
        int depth = 3;
        t1.breathFirstSearchTraversal(t1.getRoot());
        System.out.println(t1.levelsOfTree(t1.getRoot(), depth, val));
        System.out.println();
        System.out.println(t1.bfs(t1.getRoot()));
        t1.breathFirstSearchTraversal(t1.getRoot());
    }
}