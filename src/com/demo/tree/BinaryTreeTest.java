package com.demo.tree;

/**
 * @Author: demo
 * @Date: 2018/12/26
 * @Description: com.demo.tree
 * @Version: 1.0
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree btTree = new BinaryTree();
        btTree.add("A");
        btTree.add("X");
        btTree.add("C");
        Object[] objects = btTree.toArray();
        for (Object obj: objects) {
            System.out.println(obj);
        }
    }
}
