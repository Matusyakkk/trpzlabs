package command;

import model.Project;

import java.util.Random;

public class CompileCommand implements Command {
    @Override
    public int execute(Project project) {
        return switch (project.getLanguage()) {
            case ("Java") -> javaCompile(project);
            case ("C#") -> csCompile(project);
            default -> 0;
        };
    }

    // compiling method for Java
    private int javaCompile(Project project) {
        System.out.println("Compiling for " + project.getLanguage());
        return 1;
        //return new Random().nextInt(2);
    }

    // compiling method for C#
    private int csCompile(Project project) {
        System.out.println("Compiling for " + project.getLanguage());
        return new Random().nextInt(2);
    }
}
