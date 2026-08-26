/**
 * Java is strictly "pass-by-value" everywhere. 
 * For primitives, the value is the data. 
 * For objects, the value is the reference address.
 */

public class MergeClean{

    public static void main(String[] args){

        int[] arr1 = {2, 5, 6};
        int[] arr2 = {1,4,5};

        MergeClean mc = new MergeClean();

        // create the head and seed it with the first value, if it exists
        ListNode head1 = new ListNode();
        if (arr1.length>0){
            head1.val = arr1[0];
        }
        else{
            head1 = null;
        }

        // create a pointer
        ListNode p1 = head1;

        // populate the linked list
        for (int i = 1; i < arr1.length; i++){
            p1.next = new ListNode(arr1[i]);
            p1 = p1.next;
        }

        // create the head and seed it with the first value, if it exists
        ListNode head2 = new ListNode();
        if (arr2.length > 0){
            head2.val = arr2[0];
        }
        else{
            head2 = null;
        }

        // create pointers
        ListNode p2 = head2;

        // populate the linked list
        for (int j = 1; j < arr2.length; j++){
            p2.next = new ListNode(arr2[j]);
            p2 = p2.next;
        }

        ListNode merged = mc.mergeTwoLists(head1, head2);

        System.out.println("Here is the merged list:");
        while (merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }

        System.out.println("Here is head1 after sort:");
        while (head1 != null){
            System.out.println(head1.val);
            head1 = head1.next;
        }

        System.out.println("Here is head2 after sort:");
        while (head2 != null){
            System.out.println(head2.val);
            head2 = head2.next;
        }

    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedHead = new ListNode();
        ListNode current = mergedHead;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                current.next = list2;
                list2 = list2.next;
            }
            else{
                current.next = list1;
                list1 = list1.next;
            }

            // move the pointer to the merged list
            current = current.next;
        }

        // handle situation where one list position is null
        current.next = (list1 == null) ? list2 : list1;

        while(list1 != null){
            System.out.println("list1: " + list1.val);
            list1 = list1.next;
        }

        return mergedHead.next;
    }
}