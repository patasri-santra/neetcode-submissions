/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode curr = head.next;
        ListNode left = head.next;
        ListNode right = head.next;
        ListNode mid = head;

        int j=0;
        while(curr != null){
            curr = curr.next;
            j++;
        }

        int i=0;
        while(i < j/2){
            mid = mid.next;
            right = right.next;
            i++;
        }

        mid.next = null;

        ListNode prev = null;
        while(right != null){
            ListNode temp = right.next;
            right.next = prev;
            prev = right;
            right = temp;
        }

        right = prev;

        while(left != null || right != null){
            if(right != null){
                head.next = right;
                head= head.next;
                right = right.next;
            }
            if(left != null){
                head.next = left;
                head =head.next;
                left = left.next;
            }
        }
    }
}
