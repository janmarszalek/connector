package com.jm.data;

import com.jm.data.beans.Team;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamsAccessorTest {

    @Test
    public void testGetTeams() {
        TeamsAccessor a = new TeamsAccessor();
        List<Team> list = a.getTeams();
        assertNotNull(list);
        assertEquals(2, list.size());
    }

    @Test
    public void testInsert() {
        List<Team> list = new ArrayList<>();
        list.add(new Team("Core Red",4));
        TeamsAccessor a = new TeamsAccessor();
        a.insertTeams(list);
        assertEquals(3, a.getTeams().size());
    }

    @Test
    public void testDelete() {
        List<Team> list = new ArrayList<>();
        list.add(new Team("Core Red",4));
        TeamsAccessor a = new TeamsAccessor();
        a.deleteTeams(list);
        assertEquals(2, a.getTeams().size());
    }

}