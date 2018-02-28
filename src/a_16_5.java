public class a_16_5
{
    /* Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
    sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
    [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40], the call of list.countDuplicates() should
    return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23, and 1 duplicate of 40.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,1);
        addNodeToList(1,2);
        addNodeToList(2,2);
        addNodeToList(3,3);
        addNodeToList(4,3);
        addNodeToList(5,3);
        addNodeToList(6,5);
        addNodeToList(7,5);
        addNodeToList(8,5);
        addNodeToList(9,5);

        System.out.println(countDuplicates());
    }

    //counts every doublicates
    public int countDuplicates()
    {
        //initiate variables
        int countDuplicates = 0;

        //the for-loop checks if the current value is equal next value because the list is sorted
        for (ListNode current = front; current != null; current = current.next)
        {
            //first if-statement to avoid "NullPointerException"
            //second if-statment counts doublicates.
            if (current.next != null)
            {
                if (current.data == current.next.data)
                {
                    countDuplicates++;
                }
            }
        }
        return countDuplicates;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
