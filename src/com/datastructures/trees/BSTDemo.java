package com.datastructures.trees;

/**
 * Created by Husseinovich on 5/16/17.
 */
public class BSTDemo {
    public static void main(String [] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(binarySearchTree.root, binarySearchTree.createNode(10));
        binarySearchTree.add(binarySearchTree.root, binarySearchTree.createNode(12));
        binarySearchTree.add(binarySearchTree.root, binarySearchTree.createNode(11));
        binarySearchTree.add(binarySearchTree.root, binarySearchTree.createNode(13));
        binarySearchTree.add(binarySearchTree.root, binarySearchTree.createNode(6));

        binarySearchTree.search(11, binarySearchTree.root);


    }
}
