package pack;

public class MyCircularList {
	Node first;

	// constructor implicit

	void insereazaElement(int element) {
		if (first == null) {
			first = new Node(element);
		} else {
			Node node = new Node(element);
			if (first.next == null) {
				node.next = first;
				first.next = node;
			} else {
				node.next = first.next;
				first.next = node;
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (first == null) {
			return "gol";
		} else {
			sb.append(first.element).append(" ");
			if (first.next == null) {
				return sb.toString();
			} else {
				Node nodCitire = first.next;
				while (nodCitire != first) {
					sb.append(nodCitire.element).append(" ");
					nodCitire = nodCitire.next;
				}
			}
		}
		return sb.toString();

	}
}
