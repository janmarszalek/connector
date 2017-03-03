package com.jm.data.beans;

public class Team {

    private String name;
    private int members;

    public Team(String name, int members) {
        this.members = members;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
