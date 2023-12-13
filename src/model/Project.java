package model;

import java.util.List;

public class Project {
    private List<String> files;
    private String language;

    public Project(List<String> files, String language) {
        this.files = files;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
