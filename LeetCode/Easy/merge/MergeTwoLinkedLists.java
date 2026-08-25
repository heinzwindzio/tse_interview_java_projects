public class MergeTwoLinkedLists {

    public static void main(String[] args){

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,4,5};

        MergeTwoLinkedLists mll = new MergeTwoLinkedLists();

        // create the heads of each ListNode
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        // load the numbers into each ListNode
        ListNode head1 = new ListNode();
        ListNode current1 = head1;

        for (int i = 1; i < arr1.length; i++) {
            current1.next = new ListNode(arr1[i]);
            current1 = current1.next;
        }

        ListNode head2 = new ListNode(arr2[0]);
        ListNode current2 = head2;

        for (int j = 1; j < arr2.length; j++) {
            current2.next = new ListNode(arr2[j]);
            current2 = current2.next;
        }

        ListNode merged = mll.mergeTwoLists(head1, head2);

        System.out.println("Here is the merged list:");
        while (merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }


    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // point the current nodes to the head nodes
        ListNode current1 = list1;
        ListNode current2 = list2;

        // if the head value is null, then return the other head
        if(current1 == null){
            return list2;
        }
        else if(current2 == null){
            return list1;
        }

        // create a head node, and set the pointer to it
        ListNode mergedHead = new ListNode();
        ListNode mergedCurrent = mergedHead;

        // loop until the we get to the end of either linked list
        while (true){

            System.out.println("current1: " + current1.val);
            System.out.println("current2: " + current2.val);


            if (current1.val <= current2.val){
                mergedCurrent.next = new ListNode(current1.val);
                mergedCurrent = mergedCurrent.next;
                current1 = current1.next;
            }
            else{
                mergedCurrent.next = new ListNode(current2.val);
                mergedCurrent = mergedCurrent.next;
                current2 = current2.next;
            }

            // check to see if either linked list is null
            if(current1 == null){
                // point the merged to the linked list with values in it, and return the head -> we're done
                mergedCurrent.next = current2;
                return mergedHead;
            }
            else if (current2 == null){
                // point the merged to the linked list with values in it, and return the head -> we're done
                mergedCurrent.next = current1;
                return mergedHead;
            }

            System.out.println("mergedCurrent: " + mergedCurrent.val);   
            System.out.println("---");
        }
        
    }
}
