import java.util.LinkedList;
import java.util.Queue;

class maximumDepthOfNode {
    public int maxDepth(TreeNode root) {
        if(root==null){
             return 0;
             } else{
                int ld=maxDepth(root.left);
                int rd=maxDepth(root.right);
                if(ld>rd){
                    return (ld+1);
                }
                else
                return (rd+1);
                
             }
    }
}