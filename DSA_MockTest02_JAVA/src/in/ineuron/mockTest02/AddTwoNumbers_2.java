package in.ineuron.mockTest02;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
	}
}

public class AddTwoNumbers_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			sum %= 10;

			current.next = new ListNode(sum);
			current = current.next;
		}

		if (carry != 0) {
			current.next = new ListNode(carry);
		}

		return dummyHead.next;
	}

	public static void main(String[] args) {
		// Example usage
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode sum = addTwoNumbers(l1, l2);

		// Print the sum
		while (sum != null) {
			System.out.print(sum.val);
			if (sum.next != null) {
				System.out.print(" -> ");
			}
			sum = sum.next;
		}
	}
}
