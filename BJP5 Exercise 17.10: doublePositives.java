public void doublePositives(){
    doublePositives(overallRoot);
}
public void doublePositives(IntTreeNode root){
    if(root==null)return;
    doublePositives(root.left);
    if(root.data>0) root.data*=2;
    doublePositives(root.right);
}
