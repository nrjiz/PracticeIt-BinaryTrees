public boolean isFull( ){
    return isFull(overallRoot);
}
public boolean isFull(IntTreeNode root){
    if(root==null)return true;
    if(root.left==null&&root.right!=null)return false;
    if(root.right==null&&root.left!=null)return false;
    else return isFull(root.left)&&isFull(root.right);
}
