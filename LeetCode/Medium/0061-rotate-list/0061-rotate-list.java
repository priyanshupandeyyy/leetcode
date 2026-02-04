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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        if(k==0)return head;
        int size=0;
         ListNode temp=head;
         while(temp!=null){
            size++;
            temp=temp.next;
         }
         k=k%size;
         int x=size-k-1;
         temp=head;
         while(x!=0){
            x--;
            temp=temp.next;
         }
         ListNode curr=temp.next;
         ListNode ans=curr;
         temp.next=null;
         while(curr.next!=null){
            curr=curr.next;
         }
         curr.next=head;
         return ans;
    }
}