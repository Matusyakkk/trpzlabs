import mediator.CIContainerMediator;
import model.BuildDatabase;
import model.Project;
import state.BuildState;
import state.RunCompile;
import state.RunCompileAndTest;
import state.RunTest;
import visitor.ArtifactManager;
import visitor.ReporterManager;

import java.util.ArrayList;
import java.util.List;

public class CIServer {
    List<BuildState> pipeline = new ArrayList<>();
    BuildDatabase buildDatabase = new BuildDatabase();
    ArtifactManager artifactManager = new ArtifactManager(buildDatabase);
    ReporterManager reporterManager = new ReporterManager(buildDatabase);
    CIContainerMediator mediator = new CIContainerMediator(buildDatabase);

    public void runTask() {
        for (BuildState buildState : pipeline) {
            buildState.execute(mediator);
            buildState.visit(artifactManager);
            buildState.visit(reporterManager);
        }
        buildDatabase.printStatistics();
    }

    public void addTask(BuildState buildState) {
        pipeline.add(buildState);
    }

    public void addCompile(Project project) {
        addTask(new RunCompile(project));
    }

    public void addTest(Project project) {
        addTask(new RunTest(project));
    }

    public void addCompileAndTest(Project project) {
        addTask(new RunCompileAndTest(project));
    }
}
