package com.codingjx.fundamental.testing.scrapbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ATest {
    @Mock
    B b;

    private A a;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        a = new A(b);
    }

    @Test
    public void useVoidMethodShouldCallVoidMethod() throws Exception {
        doNothing().when(b).voidMethod();
        a.useVoidMethod();
        verify(b).voidMethod();
        assertEquals(1, a.useVoidMethod());
    }

    @Test
    public void useVoidMethodShouldThrowRuntimeException() throws Exception {
        doThrow(Exception.class).when(b).voidMethod();
        assertThrows(Exception.class, () -> {
            a.useVoidMethod();
        });
    }

    @Test
    public void testConsecutiveCalls() throws Exception {
        doNothing().doThrow(Exception.class).when(b).voidMethod();
        a.useVoidMethod();
        verify(b).voidMethod();

        assertThrows(RuntimeException.class, () -> {
            a.useVoidMethod();
        });
    }
}