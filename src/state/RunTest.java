package state;

import mediator.CIContainerMediator;
import model.Project;
import visitor.Visitor;

public class RunTest implements BuildState {
    Project project;

    public RunTest(Project project) {
        this.project = project;
    }

    @Override
    public void execute(CIContainerMediator mediator) {
        mediator.executeTestCommand(project);
    }

    @Override
    public void visit(Visitor v) {
        v.visit(project);
    }
}
