/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;       //moves by 1 step
            fast = fast.next.next;  //moves by 2stepd
            if (slow == fast){      //both iterate the LL and meet at some point if there is a loop... else ends the while loop as LL ends and fast reaches null
                return true;
            }
        }
        return false;
    }
}