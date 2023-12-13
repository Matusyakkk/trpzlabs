package visitor;

import model.BuildDatabase;
import model.Project;

public class ReporterManager implements Visitor {
    BuildDatabase buildDatabase;

    public ReporterManager(BuildDatabase buildDatabase) {
        this.buildDatabase = buildDatabase;
    }

    @Override
    public void visit(Project project) {
        String report = "Created report for the project: " + project;
        buildDatabase.addReport(report);
    }
}
