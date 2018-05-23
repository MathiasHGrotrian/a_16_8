package Chapter16;

import java.util.NoSuchElementException;

public class Exercise8
{

    /*
    Write a method called switchPairs that switches the order of values in the list in a pairwise fashion.
    Your method should switch the order of the first two values, then switch the order of the next two,
    switch the order of the next two, and so on. If the list contains an odd number of values, the final
    element is not moved. For example, if the list initially stores [10, 25, 31, 47, 52, 68, 77], your method
    should switch the first pair (10 and 25), the sec- ond pair (31 and 47), and the third pair (52 and 68)
     to yield [25, 10, 47, 31, 68, 52, 77].
     */




    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,1);
        addNodeToList(1,1);
        addNodeToList(2,3);
        addNodeToList(3,4);

        addNodeToList(4,5);
        addNodeToList(5,6);

        printList();
        switchPairs();
        printList();


    }

    public static void switchPairs()
    {
        int valueA = 0;
        int valueB = 0;

        for (ListNode current = front; current != null; current = current.next)
        {
            if (current.next != null)
            {
                valueA = current.data;
                valueB = current.next.data;

                current.data = valueB;
                current.next.data = valueA;

                current = current.next;
            }
        }
    }

    public static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }

    public static void printList()
    {
        System.out.println("[ ");
        for (ListNode current = front; current != null; current = current.next)
        {
            System.out.print(current.data + ", ");
        }
        System.out.println("]");
    }
}
