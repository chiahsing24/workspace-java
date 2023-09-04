package com.codingjx.fundamental.testing.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderBOImplTest {
    @Mock
    OrderDAO dao;

    OrderBOImpl bo;

    @BeforeEach
    void setUp() {
        bo = new OrderBOImpl();
        bo.setDao(dao);
    }

    @Test
    public void placeOrder_ShouldCreateAnOrder() throws SQLException, BOException {
        Order order = new Order();

        when(dao.create(order)).thenReturn(Integer.valueOf(1));

        boolean result = bo.placeOrder(order);

        assertTrue(result);
        verify(dao).create(order);
    }

    @Test
    public void placeOrder_ShouldNotCreateAnOrder() throws SQLException, BOException {
        Order order = new Order();

        when(dao.create(order)).thenReturn(Integer.valueOf(0));

        boolean result = bo.placeOrder(order);

        assertFalse(result);
        verify(dao).create(order);
    }
}