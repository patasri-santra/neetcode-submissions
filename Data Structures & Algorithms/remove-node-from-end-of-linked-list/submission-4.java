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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode dummy = new ListNode(0);
         dummy.next = head;
        //if(head.next == null && n==1) return dummy.next;
        int length=0;

        ListNode curr = head;
        while(curr != null){
            curr  = curr.next;
            length++;
        }

        ListNode prev = dummy;
        curr = head;

        int target = length - n ; //0
        int i=0;
        while(curr != null){
            if(i==target){
                ListNode temp = curr.next;  //null
                //curr.next = new ListNode(-1);
                prev.next = temp;
                break;
            }
            prev = curr;
            curr = curr.next;
            i++;
        }


        return dummy.next;

    }
}
