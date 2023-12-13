package state;

import mediator.CIContainerMediator;
import model.Project;
import visitor.Visitor;

public class RunCompile implements BuildState {
    Project project;

    public RunCompile(Project project) {
        this.project = project;
    }

    @Override
    public void execute(CIContainerMediator mediator) {
        mediator.executeCompileCommand(project);
    }

    @Override
    public void visit(Visitor v) {
        v.visit(project);
    }
}
