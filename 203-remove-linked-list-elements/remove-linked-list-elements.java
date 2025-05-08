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
    public ListNode removeElements(ListNode head, int val) {
        // ListNode traverse = head;
        // ListNode output = new ListNode(0);
        // while (traverse != null){
        //     traverse = traverse.next;
        //     if (traverse.val == val){
        //         continue;
        //     }
        //     else{
        //         output = traverse.next;
        //     }
        // }
        // return output.next;

        ListNode output = new ListNode(0);  // dummy node
        output.next = head;
        
        ListNode curr = output;  // start from dummy
        
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;  // skip the node
            } else {
                curr = curr.next;  // move forward
            }
        }
        
        return output.next;  // real head
    }
}