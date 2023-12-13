package state;

import mediator.CIContainerMediator;
import visitor.Visitor;

public interface BuildState {
    void execute(CIContainerMediator mediator);
    void visit(Visitor v);
}
