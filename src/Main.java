import model.Project;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Project project1 = new Project(List.of("1.java", "2.java", "3.java"), "Java");
        Project project3 = new Project(List.of("1.cs", "2.cs", "3.cs"), "C#");
        Project project2 = new Project(List.of("1.rb", "2.rb", "3.rb"), "Ruby");

        CIServer ciServer = new CIServer();

        ciServer.addCompile(project1);
        ciServer.addCompileAndTest(project3);
        ciServer.addCompileAndTest(project2);

        ciServer.runTask();
    }
}






















