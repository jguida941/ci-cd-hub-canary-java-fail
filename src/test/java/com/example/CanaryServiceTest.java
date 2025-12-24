package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CanaryServiceTest {
    @Test
    void addsTwoNumbers() {
        CanaryService service = new CanaryService();
        assertEquals(3, service.add(1, 2));
    }
}
