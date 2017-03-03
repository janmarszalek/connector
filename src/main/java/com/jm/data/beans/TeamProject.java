package com.jm.data.beans;

import java.util.Date;

public class TeamProject {

    private String PRJ;
    private String teamName;
    private Date startDate;
    private Date endDate;
    private String targetRelease;

    public TeamProject(String PRJ, String teamName, Date startDate, Date endDate, String targetRelease) {
        this.PRJ = PRJ;
        this.teamName = teamName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.targetRelease = targetRelease;
    }

    public String getPRJ() {
        return PRJ;
    }

    public void setPRJ(String PRJ) {
        this.PRJ = PRJ;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTargetRelease() {
        return targetRelease;
    }

    public void setTargetRelease(String targetRelease) {
        this.targetRelease = targetRelease;
    }

}
