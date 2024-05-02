/*Write a method countLeftNodes that returns the number of left children in the tree. 
A left child is a node that appears as the root of the left-hand subtree of another node. 
An empty tree has 0 left nodes. For example, the following tree has four left children (the nodes storing the values 5, 1, 4, and 7):*/

```java
public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

public int countLeftNodes(IntTreeNode root){
    //base case
    if(root==null)return 0;
    //recursive
    //detect + action
    else if(root.left!=null)return 1+ countLeftNodes(root.left)+countLeftNodes(root.right);
    //detect = action
    else return countLeftNodes(root.right);
}
```  

