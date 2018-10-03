package domain;

import base.Node;

public class DomainNode extends Node {
    public String appName;
    public DomainNode brother;
    public DomainNode child;

    public DomainNode(String c) {
        super(c);
        this.appName = null;
    }
    public DomainNode(String c, String app) {
        super(c);
        this.appName  = app;
    }
}
