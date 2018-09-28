package tree;

import java.util.Map;

public interface IDomain {
    // 域名树中插入一条新域名
    public void insertDomain(String domainName);
    // 从域名树中查询一条域名，并返回<包名， 匹配度>
    public Map<String, Integer> matchDomain(String domainName);
}
