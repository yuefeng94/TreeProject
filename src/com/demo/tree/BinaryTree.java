package com.demo.tree;

/**
 * @Author: demo
 * @Date: 2018/12/26
 * @Description: com.demo.tree
 * @Version: 1.0
 */
public class BinaryTree {
    private class Node {
        private Comparable data;//数据具备排序性
        private Node left;//左节点
        private Node right;//右节点
        public Node(Comparable data) {
            this.data = data;
        }
        /**新增节点（节点中存储数据）*/
        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        /**将数据转为对象数据*/
        public void toArrayNode() {
            if (this.left !=null) { //判断是否还存在左节点
                this.left.toArrayNode();
            }

            BinaryTree.this.arrObj[BinaryTree.this.foot++] = this.data;

            if (this.right != null) {//判断是否还存在右节点
                this.right.toArrayNode();
            }
        }
    }

    //-------------------以下为BinaryTree类------------------------//
    private Node root;//任何数据结构都必须存在根节点
    private Object[] arrObj;
    private Integer foot;//索引
    private Integer count = 0;
   /**新增数据*/
    public void add(Object data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node((Comparable)data);
        if (root == null) {
            root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    /**将数据转为对象数组*/
    public Object[] toArray() {
        this.foot = 0;//清零
        if (this.root == null) {
            return null;
        }
        arrObj = new Object[this.count];
        this.root.toArrayNode();
        return arrObj;
    }

}
