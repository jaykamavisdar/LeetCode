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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // while (list1 != null){
        //     arr.add(list1.val);
        //     list1 = list1.next;
        // }
        // while (list2 != null){
        //     arr.add(list2.val);
        //     list2 = list2.next;
        // }
        // Collections.sort(arr);
        // ListNode dummy = new ListNode(0);
        // ListNode mergedL = dummy;
        // for (int i = 0; i < arr.size(); i++){
        //     mergedL.next = new ListNode(arr.get(i));
        //     mergedL = mergedL.next;
        // }
        // return dummy.next;

        ListNode mergedL = new ListNode(0);
        ListNode current = mergedL;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null){
            current.next = list1;
        }
        else{
            current.next = list2;
        }
        return mergedL.next;
    }
}