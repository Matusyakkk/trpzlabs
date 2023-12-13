package decorator;

import mediator.CIContainerMediator;
import model.Project;
import state.BuildState;
import visitor.Visitor;

abstract class BuildDecorator implements BuildState {
    BuildState buildState;
    Project project;

    public BuildDecorator(BuildState buildState) {
        this.buildState = buildState;
    }

    @Override
    public void execute(CIContainerMediator mediator) {
        buildState.execute(mediator);
    }

    @Override
    public void visit(Visitor v) {
        v.visit(project);
    }
}
