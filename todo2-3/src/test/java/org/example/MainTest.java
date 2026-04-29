package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAddTask() {
        ArrayList<String> tasks = new ArrayList<>();
        assertEquals(0, tasks.size());

        tasks.add("Купить хлеб");
        assertEquals(1, tasks.size());
        assertEquals("Купить хлеб", tasks.get(0));

        tasks.add("Продать хлеб");
        assertEquals(2, tasks.size());
        assertEquals("Продать хлеб", tasks.get(1));
    }

    @Test
    public void testViewTasksWhenEmpty() {
        ArrayList<String> tasks = new ArrayList<>();
        assertTrue(tasks.isEmpty());
        assertEquals(0, tasks.size());
    }

    @Test
    public void testDeleteTaskCorrectIndex() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Купить хлеб");
        tasks.add("Продать хлеб");
        tasks.add("Отдать хлеб");

        assertEquals(3, tasks.size());

        String removed = tasks.remove(1);
        assertEquals("Продать хлеб", removed);
        assertEquals(2, tasks.size());
        assertEquals("Купить хлеб", tasks.get(0));
        assertEquals("Отдать хлеб", tasks.get(1));
    }

    @Test
    public void testDeleteFirstTask() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Купить хлеб");
        tasks.add("Продать хлеб");
        tasks.add("Отдать хлеб");

        tasks.remove(0);

        assertEquals(2, tasks.size());
        assertFalse(tasks.contains("Купить хлеб"));
        assertEquals("Продать хлеб", tasks.get(0));
        assertEquals("Отдать хлеб", tasks.get(1));
    }

    @Test
    public void testDeleteLastTask() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Купить хлеб");
        tasks.add("Продать хлеб");
        tasks.add("Отдать хлеб");

        int lastIndex = tasks.size();
        if (lastIndex > 0 && lastIndex <= tasks.size()) {
            tasks.remove(lastIndex - 1);
        }

        assertEquals(2, tasks.size());
        assertFalse(tasks.contains("Отдать хлеб"));
        assertTrue(tasks.contains("Купить хлеб"));
        assertTrue(tasks.contains("Продать хлеб"));
    }
}