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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>q=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                q.add(new ListNode(lists[i].val));
                lists[i]=lists[i].next;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(!q.isEmpty()){
            ans.next=q.poll();
            ans=ans.next;
        }
        return dummy.next;
    }
}