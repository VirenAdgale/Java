import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReverseLinkedlist {
    public ListNode Reverselist(ListNode head)
    {
        ListNode prevpos=null;
        ListNode  currentpos=head;
        ListNode next=null;

        while(currentpos!=null)
        {
            next=currentpos.next;
            currentpos.next=prevpos;
            prevpos=currentpos;
            currentpos=next;
        }
        return prevpos;

    }
    
}
