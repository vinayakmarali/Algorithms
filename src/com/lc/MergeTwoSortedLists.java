package com.lc;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return  l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode mergedList = null;
        if(l1.val < l2.val){
            mergedList = l1;
            mergedList.next = mergeTwoLists(l1.next,l2);
        } else{
            mergedList = l2;
            mergedList.next = mergeTwoLists(l1, l2.next);
        }
        return mergedList;
    }
}