package com.santhosh.dsa.greedy;

import com.santhosh.dsa.tree.Node;

import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanCoding {
    public static void createHuffmanTree(int[] freq, char[] charSeq) {
        Queue<Node> priorQueue = new PriorityQueue<>();
        for(int i=charSeq.length-1; i>=0; i--) {
            Node node = new Node(charSeq[i], freq[i]);
            priorQueue.add(node);
        }
        while (priorQueue.size() > 1) {
            Node node1 = priorQueue.poll();
            Node node2 = priorQueue.poll();
            Node newNode = new Node(node2.value + node1.value);
            newNode.left = node1;
            newNode.right = node2;
            priorQueue.add(newNode);
        }
        Node root = priorQueue.poll();
        assignCodes(root, "");
    }

    private static void assignCodes(Node root, String code) {
        if(root!=null) {
            root.code = code;
            if(root.c != ' ')
                System.out.println(root.c + " : " + root.code);
            assignCodes(root.left, code + "0");
            assignCodes(root.right, code + "1");
        }
    }
    public static void main(String[] args) {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };
        createHuffmanTree(charfreq, charArray);
    }
}
