/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //therer are 3 ways to do it, watch striver's video
    //for leftside, we pass, node.val as UB, for right side, we pass UB itself as ub
    //we dont need to take LB, see video to know the reason why
    public TreeNode bstFromPreorder(int[] preorder) {
        //int i = 0;  //to traverse on preorder array and to get the node value to construct BST
        //int ub = Integer.MAX_VALUE;
        //return bstFromPreorder(preorder, ub, i);
        
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    
    //passing i as a reference because, i's value should be consistent in recursion value
    public TreeNode bstFromPreorder(int[] preorder, int upperBound, int[] i){
        if(i[0] == preorder.length || preorder[i[0]] > upperBound)
            return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left = bstFromPreorder(preorder, root.val, i);
        root.right = bstFromPreorder(preorder, upperBound, i);
        return root;
    }
}