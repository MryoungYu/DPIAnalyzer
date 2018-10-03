package analyzer;

import domain.DomainTree;

import java.io.File;

public class DomainAnalyzer {
    private File sampleFile;
    private File dataFile;
    private DomainTree dTree;
    private DomainAnalyzer instance = new DomainAnalyzer();
    private DomainAnalyzer() {

    }
    public DomainAnalyzer getInstance() {
        return instance;
    }
    public DomainAnalyzer loadSample(String path) {
        this.sampleFile = new File(path);
        return this;
    }
    public DomainAnalyzer buildTree() {
        return this;
    }
    public DomainAnalyzer loadData(String path) {
        this.dataFile = new File(path);
        return this;
    }
    public void matchData() {

    }
}
