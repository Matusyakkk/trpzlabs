package mediator;

import command.CompileCommand;
import command.TestCommand;
import model.BuildDatabase;
import model.Project;

public class CIContainerMediator {
    CompileCommand compileCommand;
    TestCommand testCommand;
    BuildDatabase buildDatabase;
    private boolean isBuildSuccessful = false;

    public CIContainerMediator(BuildDatabase buildDatabase) {
        this.compileCommand = new CompileCommand();
        this.testCommand = new TestCommand();
        this.buildDatabase = buildDatabase;
    }

    public void executeCompileCommand(Project project) {
        if (compileCommand.execute(project) == 1) {
            isBuildSuccessful = true;
            buildDatabase.recordSuccessfulBuild();
        } else {
            isBuildSuccessful = false;
            buildDatabase.recordFailedBuild();
        }
    }

    public void executeTestCommand(Project project) {
        if (testCommand.execute(project) == 1)
            buildDatabase.recordSuccessfulTest();
        else
            buildDatabase.recordFailedTest();
    }

    public boolean isBuildSuccessful() {
        return isBuildSuccessful;
    }
}
