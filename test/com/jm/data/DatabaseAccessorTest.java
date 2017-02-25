package com.jm.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DatabaseAccessorTest {

    @Test
    public void testGetTeams() {
        DatabaseAccessor a = new DatabaseAccessor();
        List<Team> list = a.getTeams();
        assertNotNull(list);
        assertEquals(2, list.size());
    }

    @Test
    public void testInsert() {
        List<Team> list = new ArrayList<>();
        list.add(new Team("Core Red",4));
        DatabaseAccessor a = new DatabaseAccessor();
        a.insertTeams(list);
        assertEquals(3, a.getTeams().size());
    }

    @Test
    public void testDelete() {
        List<Team> list = new ArrayList<>();
        list.add(new Team("Core Red",4));
        DatabaseAccessor a = new DatabaseAccessor();
        a.deleteTeams(list);
        assertEquals(2, a.getTeams().size());
    }

}