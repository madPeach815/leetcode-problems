class Solution {
    public ListNode removeElements(ListNode head, int val) {


        while (head != null && head.val == val){
                head = head.next;
            }

        ListNode curr = head;
        ListNode prev = null;
            
        while (curr != null) {
            if (curr.val != val) {
                    prev = curr;
                    curr = curr.next;
            } else {
                    prev.next = curr.next;
                    curr = curr.next;
            }
        }
            return head;
        }
    }
