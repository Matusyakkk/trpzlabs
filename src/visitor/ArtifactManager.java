package visitor;

import model.BuildDatabase;
import model.Project;

public class ArtifactManager implements Visitor {
    BuildDatabase buildDatabase;

    public ArtifactManager(BuildDatabase buildDatabase) {
        this.buildDatabase = buildDatabase;
    }

    @Override
    public void visit(Project project) {
        String artifact = "Collected artifacts from the project: " + project;
        buildDatabase.addArtifact(artifact);
    }
}
