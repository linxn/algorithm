package main.Add_Two_Numbers_2;

import utils.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.next == null && l1.val == 0) return l2;
        if(l2.next == null && l2.val == 0) return l1;

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        int carry_bit = 0;

        if(l1 != null || l2 != null){
            if (l1 != null) {
                stack1.push(l1);
                l1 = l1.next;
            }
            if (l2 != null) {
                stack2.push(l2);
                l2 = l2.next;
            }
        }
        //TODO

    }
}
