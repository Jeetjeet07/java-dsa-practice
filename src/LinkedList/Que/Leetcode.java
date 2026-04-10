package LinkedList.Que;

import static java.lang.reflect.Array.getLength;

public class Leetcode {

    //Q3 L21 merge two sortedList

    //Q4 Leetcode-121
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    //Q6 L142 Detect cycle start

    //Q7 L202
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow=findSq(slow);
            fast = findSq(findSq(fast));
        } while(slow!=fast);

        if(slow==1) {
           return true;
        }
        return false;
    }

    private int findSq(int num) {
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }

    //Q8 middle of LL -L876
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f= head;

        while(f !=null && f.next !=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }


    //Q10,11 L206
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    //Q12 RLL
    public ListNode reverseBetween(ListNode head, int left, int right){
        if(left==right){
            return head;
        }
        //skip first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for(int i=0; current != null && i<left-1;i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        //reverse bw left right
        ListNode next = current.next;
        for(int i=0; current !=null && i<right-left+1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next=next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;
    }

    //Q13 Palindrome
    private boolean isPalindrome(ListNode head){
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead= headSecond;

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head=head.next;
            headSecond = headSecond.next;

            reverseList(rereverseHead);
        }

        return head == null || headSecond == null;

    }

    //Q14 reorder List
    public void reorderList(ListNode head){
        if(head==null || head.next == null) return;

        ListNode mid = middleNode(head);
        ListNode hf = head;
        ListNode hs = reverseList(mid);

        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf= temp;

            temp = hs.next;
            hs.next=hf;
            hs = temp;
        }

        if(hf != null){
            hf.next = null;
        }
    }

    //Q15 reverseK
    public ListNode reverseKGroup(ListNode head, int k){
        if(k<=1 || head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while(count>0){
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse bw left right
            ListNode next = current.next;
            for(int i=0; current !=null && i<k; i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next=next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                head=prev;
            }
            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }


    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    //Q17 rotate list
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k<=0){
            return head;
        }

        ListNode last=head;
        int length=1;

        while(last.next != null){
            last = last.next;
            length++;
        }
        last.next=head;
        int rotation = k%length;
        int skip = length-rotation;

        ListNode newLast = head;

        for(int i=0; i<skip-1; i++){
            newLast= newLast.next;
        }
        head=newLast.next;
        newLast.next=null;

        return head;
    }



    //Leetcode
    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }


    }
}
