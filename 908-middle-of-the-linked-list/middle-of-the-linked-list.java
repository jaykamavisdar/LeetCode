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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while ((fast != null)&&(fast.next != null)){
            slow = slow.next;       //slow pointer moves 1 step
            fast = fast.next.next;  //fast pointer moves 2 steps so that when it reaches end slow pointer is at mid
        }
        return slow;
    }
}