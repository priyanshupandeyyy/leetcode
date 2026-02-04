/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode colli(ListNode t1,ListNode t2,int n){
        while(n!=0){
            t1=t1.next;
            n--;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int cnt1=0,cnt2=0;
        while(temp!=null){
            cnt1++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            cnt2++;
            temp=temp.next;
        }
        if(cnt1>cnt2){
            return colli(headA,headB,cnt1-cnt2);
        }
        else return colli(headB,headA,cnt2-cnt1);
    }
}