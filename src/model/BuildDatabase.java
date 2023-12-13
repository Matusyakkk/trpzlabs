package model;

import java.util.ArrayList;
import java.util.List;

public class BuildDatabase {
    private int successfulBuilds = 0;
    private int failedBuilds = 0;
    private int successfulTests = 0;
    private int failedTests = 0;
    private List<String> artifacts = new ArrayList<>();
    private List<String> reports = new ArrayList<>();

    public void recordSuccessfulBuild() {
        successfulBuilds++;
        System.out.println("Build recorded: Successful");
    }

    public void recordFailedBuild() {
        failedBuilds++;
        System.out.println("Build recorded: Failed");
    }

    public void recordSuccessfulTest() {
        successfulTests++;
        System.out.println("Test recorded: Successful");
    }

    public void recordFailedTest() {
        failedTests++;
        System.out.println("Test recorded: Failed");
    }

    public void addArtifact(String artifact) {
        artifacts.add(artifact);
        System.out.println("Artifact added to the database: " + artifact);
    }

    public void addReport(String report) {
        reports.add(report);
        System.out.println("Report added to the database: " + report + "\n");
    }

    public void printStatistics() {
        System.out.println("Build and Test Statistics:");
        System.out.println("Successful Builds: " + successfulBuilds);
        System.out.println("Failed Builds: " + failedBuilds);
        System.out.println("Successful Tests: " + successfulTests);
        System.out.println("Failed Tests: " + failedTests);
    }

    public List<String> getArtifacts() {
        return artifacts;
    }

    public List<String> getReports() {
        return reports;
    }

    public void setArtifacts(List<String> artifacts) {
        this.artifacts = artifacts;
    }

    public void setReports(List<String> reports) {
        this.reports = reports;
    }
}
