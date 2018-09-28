package tree;

public class Node {
    public String content;
    public Node brother;
    public Node child;
    public Node(String c) {
        this.content = c;
        this.brother = null;
        this.child = null;
    }
}
