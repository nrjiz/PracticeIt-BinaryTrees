public void printLeaves(){
    if(overallRoot==null){
        System.out.print("no leaves");
    }else{
        System.out.print("leaves: ");
        printLeaves(overallRoot);
    }
}
public void printLeaves(IntTreeNode root){
    if(root==null)return;
    if(root.left==null&&root.right==null)
        System.out.print(root.data+" ");
    else {
        printLeaves(root.right);
        printLeaves(root.left);
    }
}
