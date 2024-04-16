package Trees;

import java.util.*;

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}

class Trees {
    private Node root;

    public Trees() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void createNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        InsertNode(root, newNode);
    }

    private void InsertNode(Node node, Node newNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
                return;
            } else {
                queue.offer(currentNode.getLeft());
            }
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
                return;
            } else {
                queue.offer(currentNode.getRight());
            }
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getData() + " ");
        }
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
            System.out.print(currentNode.getData() + " ");
            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }
        }
    }

    public int findMaxValue(Node node) {
        int maxValue = Integer.MIN_VALUE;
        if (node != null) {
            maxValue = node.getData();
            int maxLeft = findMaxValue(node.getLeft());
            int maxRight = findMaxValue(node.getRight());
            if (maxLeft > maxValue) {
                maxValue = maxLeft;
            }
            if (maxRight > maxValue) {
                maxValue = maxRight;
            }
        }
        return maxValue;
    }

    public boolean findAnElement(Node node, int target) {

        if (node == null)
            return false;
        if (node.getData() == target)
            return true;
        return findAnElement(node.getLeft(), target) || findAnElement(node.getRight(), target);
    }

    public void recursiveInsert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            helperInsert(root, data);
        }
    }

    private void helperInsert(Node node, int data) {
        if (node.getData() >= data) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
            } else {
                helperInsert(node.getLeft(), data);
            }
        }
        if (node.getData() < data) {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
            } else {
                helperInsert(node.getRight(), data);
            }
        }
    }

    public int countNumberOfNodes(Node node) {
        int count = 0;
        if (node == null) {
            return count;
        }
        int leftCount = node.getLeft() == null ? 0 : countNumberOfNodes(node.getLeft());
        int rightCount = node.getRight() == null ? 0 : countNumberOfNodes(node.getRight());
        return 1 + leftCount + rightCount;
    }

    public int heightOfTree(Node node) {
        if (node == null)
            return 0;
        int leftCount = heightOfTree(node.getLeft());
        int rightCount = heightOfTree(node.getRight());
        return leftCount > rightCount ? leftCount + 1 : rightCount + 1;
    }
}

public class BinaryTrees {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 6, 9, 2, 7 };
        Trees t1 = new Trees();
        for (int i : arr) {
            t1.recursiveInsert(i);
        }
        // t1.breathFirstSearchTraversal(t1.getRoot());
        t1.preOrderTraversal(t1.getRoot());
        // System.out.println();
        // t1.inOrderTraversal(t1.getRoot());
        // System.out.println();
        // t1.postOrderTraversal(t1.getRoot());
        System.out.println();
        System.out.println(t1.findMaxValue(t1.getRoot()));
        System.out.println(t1.findAnElement(t1.getRoot(), 4));
        System.out.println(t1.countNumberOfNodes(t1.getRoot()));
        System.out.println(t1.heightOfTree(t1.getRoot()));
    }
}