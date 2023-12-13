package decorator;

import mediator.CIContainerMediator;
import state.BuildState;
import state.RunTest;

public class CompileAndTestDecorator extends BuildDecorator {
    public CompileAndTestDecorator(BuildState buildState) {
        super(buildState);
    }

    @Override
    public void execute(CIContainerMediator mediator) {
        super.execute(mediator);
        if (mediator.isBuildSuccessful()) {
            buildState = new RunTest(project);
            buildState.execute(mediator);
        }
    }
}
