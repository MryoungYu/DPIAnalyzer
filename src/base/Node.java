package base;

public class Node {
    public String content;
    public Node brother;
    public Node child;
    public Node(String c) {
        this.content = c;
        this.brother = null;
        this.child = null;
    }
    public Node getBrother() {
        return this.brother;
    }
    public void addBrother(Node n) {
        if (null == this.brother) {
            this.brother = n;
        } else {
            this.brother.addBrother(n);
        }
    }
    public Node getChild() {
        return this.child;
    }
    public boolean hasBrother() {
        if (null != this.brother) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasChild() {
        if (null != this.child) {
            return false;
        } else {
            return true;
        }
    }
}
