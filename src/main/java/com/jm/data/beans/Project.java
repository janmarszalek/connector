package com.jm.data.beans;

public class Project {

    private String PRJ;
    private String devManager;
    private String projectName;
    private String projectManager;
    private long budget;

    public Project(String PRJ, String devManager, String projectName, String projectManager, long budget) {
        this.PRJ = PRJ;
        this.devManager = devManager;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.budget = budget;
    }

    public String getPRJ() {
        return PRJ;
    }

    public void setPRJ(String PRJ) {
        this.PRJ = PRJ;
    }

    public String getDevManager() {
        return devManager;
    }

    public void setDevManager(String devManager) {
        this.devManager = devManager;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }
}
