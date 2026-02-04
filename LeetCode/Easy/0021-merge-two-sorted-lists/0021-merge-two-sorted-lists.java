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
        if(list1==null && list2==null)return list1;
        if(list1==null)return list2;
        if(list2==null)return list1;

        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode ans=null;
        ListNode ret=null;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                if(ans==null){

                    ans=temp1;
                    ret=ans;
                }
                else{
                    ans.next=temp1;
                ans=ans.next;
                } 
                temp1=temp1.next;
            }
            else{
                if(ans==null){
                    ans=temp2;
                    ret=ans;
                    temp2=temp2.next;
                }
                else {
                    ans.next=temp2;
                    ans=ans.next;
                temp2=temp2.next;
                }
            }
        }
        if(temp1!=null)ans.next=temp1;
        else ans.next=temp2;
        return ret;
    }
}