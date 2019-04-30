package utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; };

    public static TreeNode buildTree(int[] nums){
        if (nums.length < 1) return null;
        TreeNode head = new TreeNode(nums[0]);
        TreeNode[] node_list = new TreeNode[nums.length];
        node_list[0] = head;

        for (int i = 0; i < nums.length / 2; i++) {
            if(nums[i] != -1){
                if (i * 2 + 1 < nums.length && nums[i * 2 + 1] != -1){
                    node_list[i].left = new TreeNode(nums[i * 2 + 1]);
                    node_list[i * 2 + 1] = node_list[i].left;
                }
                if (i * 2 + 2 < nums.length && nums[i * 2 + 2] != -1){
                    node_list[i].right = new TreeNode(nums[i * 2 + 2]);
                    node_list[i * 2 + 2] = node_list[i].right;
                }
            }
        }
        return head;
    }
}
