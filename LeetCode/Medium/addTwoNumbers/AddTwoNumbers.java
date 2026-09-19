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

public class AddTwoNumbers {

    public static void main(String[] args){

        // create ListNodes
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        // populate the first ListNode
        // l1 = [2,4,3]
        l1.val = 2;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // populate the second ListNode
        // l2 = [5,6,4]
        l2.val = 5;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Composition instead of inheritance or interface
        Solution mySolution = new Solution();
        
        // get the result
        ListNode result = mySolution.addTwoNumbers(l1, l2);

        // iterate through the ListNode result and print each node value
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        } // while
    }
}

class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum = 0;
        int carryOver = 0;

        // create the resulting ListNode
        ListNode result = new ListNode();

        // loop through both ListNodes until one of them is null

            // calculate sum by adding the two numbers plus carry over
    
            // if sum >= 10
            
                // then carry over = 1
                
                // add value = (sum - 10)

            // otherwise
        
                // value = sum

                // carry over = 0

            // increment the current for both ListNodes

        // loop through the ListNode that has more values in it

            // add the current value to the result

            // increment the current ListNode

        return result;
    }
}

class ListNode {
     int val;
     ListNode next;

     ListNode() {}

     ListNode(int val) { 
        this.val = val; 
    }
     
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}



