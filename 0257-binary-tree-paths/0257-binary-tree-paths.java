class Solution {
    List<String> paths = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return paths;
        }
        backtrack(root, new StringBuilder());
        return paths;
    }
    
    private void backtrack(TreeNode node, StringBuilder path) {
        int lengthBeforeAppend = path.length();
        
        // Append current node's value to the path
        path.append(node.val);
        
        // Check if it's a leaf node (no children)
        if (node.left == null && node.right == null) {
            // Add the current path to the result
            paths.add(path.toString());
        } else {
            // Not a leaf node, continue to backtrack
            path.append("->");
            if (node.left != null) {
                backtrack(node.left, path);
            }
            if (node.right != null) {
                backtrack(node.right, path);
            }
        }
        
        // Backtrack: reset the path to its original state
        path.setLength(lengthBeforeAppend);
    }
}
