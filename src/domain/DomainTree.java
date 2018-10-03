package domain;

import base.Node;
import base.Tree;

import java.util.*;

public class DomainTree extends Tree implements IDomain {
    public DomainNode root;
    public DomainTree() {
        this.root = new DomainNode(null);
    }
    @Override
    public void insertDomain(String appName, String domainName) {
        DomainNode node = this.root;
        String[] arrDomain = domainName.split(".");
        int length = arrDomain.length;
        int i = length - 1;
        while (i >= 0) {
            while (!node.content.equals(arrDomain[i]) && node != null) {
                node = node.brother;
            }
            if (node == null) {
                if (i == 0) {
                    node = new DomainNode(arrDomain[i], appName);
                } else {
                    node = new DomainNode(arrDomain[i]);
                }
            }
            node = node.child;
            i--;
        }
    }

    @Override
    public Map<String, Integer> matchDomain(String domainName) {
        return null;
    }

    public List<Set<String>> BreadthFirstSearch() {
        List<Set<String>> resList = new ArrayList<>();
        if (this.root == null) {
            return resList;
        }
        Queue<DomainNode> queue = new LinkedList<>();
        queue.offer(this.root);
        while (!queue.isEmpty()) {
            DomainNode node = queue.poll();
            Set<String> set = new HashSet<>();
            while (node != null) {
                if (node.child != null) {
                    queue.offer(node.child);
                }
                set.add(node.content);
                node = node.brother;
            }
            resList.add(set);
        }
        return resList;
    }

    public Map<String, String> DepthFirstSearch() {
        Map<String, String> map = new HashMap<>();
        if (this.root == null) {
            return map;
        }
        Stack<DomainNode> stack = new Stack<>();
        stack.push(this.root);
        while (!stack.isEmpty()) {
            DomainNode node = stack.pop();
            String domainName = "";
            while (node != null) {
                if (node.brother != null) {
                    stack.push(node.brother);
                }
                if (!domainName.equals("")) {
                    domainName += ".";
                }
                domainName += node.content;
                if (node.appName != null) {
                    map.put(node.appName, domainName);
                }
                node = node.child;
            }
        }
        return map;
    }
}
