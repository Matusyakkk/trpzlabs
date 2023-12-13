package state;

import decorator.CompileAndTestDecorator;
import mediator.CIContainerMediator;
import model.Project;
import visitor.Visitor;

public class RunCompileAndTest implements BuildState {
    Project project;

    public RunCompileAndTest(Project project) {
        this.project = project;
    }

    @Override
    public void execute(CIContainerMediator mediator) {
        new CompileAndTestDecorator(new RunCompile(project))
                .execute(mediator);
    }

    @Override
    public void visit(Visitor v) {
        v.visit(project);
    }
}
