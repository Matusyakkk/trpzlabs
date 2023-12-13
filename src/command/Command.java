package command;

import model.Project;

interface Command {
    int execute(Project project);
}