package command;

import model.Project;

import java.util.Random;

public class TestCommand implements Command {
    @Override
    public int execute(Project project) {
        System.out.println("testing");
        return new Random().nextInt(2);
    }
}
