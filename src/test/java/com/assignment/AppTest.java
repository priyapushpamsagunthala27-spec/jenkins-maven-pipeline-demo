package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testAdd() {
        assertEquals(5, new App().add(2, 3));
    }
}