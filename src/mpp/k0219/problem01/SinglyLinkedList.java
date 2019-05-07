package mpp.k0219.problem01;


public class SinglyLinkedList {
    private Node startNode; // zeroth element

    public SinglyLinkedList() {
    }

    /** Recursively removes the last String in the list */
    public String removeLast(){
        Node nextToLast = getSecondToLast(startNode);
        if (nextToLast != null) {
            Node last = nextToLast.next;
            nextToLast.next = null;
            return last.value;
        }
        String result = startNode.value;
        startNode = null;
        return result;
    }

    /** OPTIONAL: You may implement this method
     *  as an auxiliary method to removeLast.
     *  If you use it, you should provide a recursive
     *  implementation
     *
     *  Returns (but does not remove) the second to last
     *  Node in the list. If the list has fewer than two
     *  elements, this method returns null.
     */
    private Node getSecondToLast(Node node) {
        if (node == null) return null;

        if (node.next != null && node.next.next == null) return node;

        return getSecondToLast(node.next);
    }




    /** Returns the input item wrapped in a Node,
     *  and adds to the front of the link list */
    public Node addFirst(String item) {
        if (startNode == null) {
            startNode = new Node(null, item);
        } else {
            startNode = new Node(startNode, item);
        }

        return startNode;
    }

    private Node getNode(int pos) {
        if (pos >= size())
            throw new IndexOutOfBoundsException();
        int pointer = 0;
        Node node = startNode;
        while (++pointer <= pos) {
            node = node.next;
        }

        // node is the node we are seeking
        return node;
    }

    public String get(int pos) {
        Node node = getNode(pos);
        return (node != null) ? node.value : null;
    }

    /**
     * returns the index of the String s, if found; -1 otherwise
     */
    public int find(String s) {
        if (s == null)
            return -1;
        Node currentNode = startNode;
        int i = -1;
        while (currentNode != null) {
            ++i;
            if (s.equals(currentNode.value))
                return i;
            currentNode = currentNode.next;

        }
        return -1;
    }

    public int size() {
        int count = 0;
        Node next = startNode;
        while (next != null) {
            ++count;
            next = next.next;
        }
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node next = startNode;
        while (next != null) {
            sb.append(next.value + ", ");
            next = next.next;
        }
        String ret = sb.toString();
        if(ret.length() > 1)
            ret = ret.substring(0, ret.length() - 2);
        return (ret + "]");
    }

    class Node {
        String value;
        Node next;

        Node() {
        }

        Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    /* Expected output:
        Testing removeLast
        [C, B, A, D]
        D
        [C, B, A]
        A
        [C, B]
        B
        [C]
        C
        []
    */
    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();
        System.out.println("Testing removeLast");
        l.addFirst("D");
        l.addFirst("A");
        l.addFirst("B");
        l.addFirst("C");
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
    }

}
