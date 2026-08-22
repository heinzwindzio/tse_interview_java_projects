/**
 * Definition for singly-linked list.
 * */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Merge2LinkedLists {
    public static void main(String[] args){

        Merge2LinkedLists merge = new Merge2linkedLists();

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        System.out.println(merge.mergeTwoLists(list1, list2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        System.out.println("I'm in mergeTwoLists");
        
        return list1;   
    }
}
