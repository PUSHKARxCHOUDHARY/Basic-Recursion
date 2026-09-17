import org.w3c.dom.Node;

public class GfgMaximumPathSum {
    /* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {

    int maxi = Integer.MIN_VALUE;

    int solve(Node root) {

        if (root == null) {
            return 0;
        }

        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));

        maxi = Math.max(maxi, left + right + root.data);

        return root.data + Math.max(left, right);
    }

    int findMaxSum(Node root) {

        solve(root);

        return maxi;
    }
}
    
}
