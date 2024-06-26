/*
* Write a method isFull that returns whether or not a binary tree is full (true,
* if it is, false if otherwise). A full binary tree is one in which every node 
* has 0 or 2 children. 
*/

public boolean isFull(){
    return isFull(overallRoot);
}
public boolean isFull(IntTreeNode root){
    
    if(root==null)return true;
    if((root.left==null||root.right ==null)&&!(root.left==null&&root.right==null))return  false;
    
    return (isFull(root.left)&&isFull(root.right));
    
}
