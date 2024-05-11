public int numberNodes(){
    int k = 1;
    return numberNodes(overallRoot,k);
}
public int numberNodes(IntTreeNode root,int k){
    
    if(root==null)return 0;
    else { 
    root.data=k;
    int countLeft = numberNodes(root.left,k+1);
    int countRight= numberNodes(root.right,k+1+countLeft);
    return 1+countLeft+countRight;
    }
}
