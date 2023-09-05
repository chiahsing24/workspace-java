package com.codingjx.fundamental.testing.greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GreetingImplTest {
    @Mock
    private GreetingService service;

    @InjectMocks
    private  GreetingImpl greeting;

    @Test
    public void greetShouldReturnValidOutput() {
        when(service.greet("Junit")).thenReturn("Hello Junit");

        String result = greeting.greet("Junit");

        assertNotNull(result);
        assertEquals("Hello Junit", result);
    }

    @Test
    public void greetShouldThrowExceptionWhenNameIsNull() {
        // Way 1:
//        when(service.greet(null)).thenThrow(IllegalArgumentException.class);

        // Way 2:
        doThrow(IllegalArgumentException.class).when(service).greet(null);

        assertThrows(IllegalArgumentException.class, () -> {
            greeting.greet(null);
        });
    }

    @Test
    public void greetShouldThrowExceptionWhenNameIsBlank() {
        doThrow(IllegalArgumentException.class).when(service).greet("");

        assertThrows(IllegalArgumentException.class, () -> greeting.greet(""));
    }
}