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
        // l1 = [9,9,1]
        l1.val = 9;
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(1);

        // populate the second ListNode
        // l2 = [9,9]
        l2.val = 9;
        l2.next = new ListNode(9);

        // Composition instead of inheritance or interface
        Solution mySolution = new Solution();
        
        // get the result
        ListNode result = mySolution.addTwoNumbers(l1, l2);

        // iterate through the ListNode result and print each node val
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
        ListNode resultPointer = new ListNode();
        ListNode resultFirst = resultPointer;

        // loop through both ListNodes until one of them is null
        while(l1 != null && l2 != null){

            // calculate sum by adding the two numbers plus carry over
            sum = l1.val + l2.val + carryOver;
    
            // if sum >= 10
            if(sum>=10){
            
                // then carry over = 1
                carryOver = 1;
                
                // add val = (sum - 10)
                sum = sum - 10;
                resultPointer.val = sum;
            }
            else{
                // val = sum
                resultPointer.val = sum;

                // carry over = 0
                carryOver = 0;
            }

            // increment the current for both ListNodes
            l1 = l1.next;
            l2 = l2.next;

            if(l1!=null || l2!=null){
                resultPointer.next = new ListNode();
                resultPointer = resultPointer.next;
            }

        } // while

        // if either ListNode has more vals in it, loop through that ListNode
        while(l1!=null || l2!=null){

            if(l1!=null){

                // add the current val to the result
                sum = l1.val + carryOver;

                if(sum>=10){
                    resultPointer.val=sum-10;
                    carryOver = 1;
                }
                else{
                    resultPointer.val=sum;
                    carryOver = 0;
                }

                // increment the l1 ListNode and result
                l1 = l1.next;

                // don't create another node in result if we've reached the last number
                if(l1!=null){
                    resultPointer.next = new ListNode();
                    resultPointer = resultPointer.next;
                }
            }
            else{
                // add the current val to the result
                sum=l2.val + carryOver;

                if(sum>=10){
                    resultPointer.val=sum-10;
                    carryOver = 1;
                }
                else{
                    resultPointer.val=sum;
                    carryOver = 0;
                }

                // increment the l1 ListNode and result
                l2 = l2.next;

                if(l2!=null){
                    resultPointer.next = new ListNode();
                    resultPointer = resultPointer.next;
                }
            }
        } // while

        if(carryOver==1){
            resultPointer.next = new ListNode(1);
        }

        return resultFirst;
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



