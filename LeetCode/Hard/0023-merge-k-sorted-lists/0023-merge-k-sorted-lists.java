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
            if(lists[i]!=null){
                q.add(lists[i]);
            }
        }

        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(!q.isEmpty()){
            ListNode node=q.poll();
            ans.next=node;
            ans=ans.next;

            if(node.next!=null)q.add(node.next);
        }
        return dummy.next;
    }
}