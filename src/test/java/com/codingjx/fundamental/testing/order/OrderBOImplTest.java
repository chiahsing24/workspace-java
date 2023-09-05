package com.codingjx.fundamental.testing.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    public void placeOrder_ShouldThrowBOException() throws SQLException, BOException {
        Order order = new Order();

        when(dao.create(order)).thenThrow(SQLException.class);

        assertThrows(BOException.class, () -> {
            boolean result = bo.placeOrder(order);
        });
    }

    @Test
    public void cancelOrder_ShouldCancelOrder() throws SQLException, BOException {
        Order order = new Order();

        when(dao.read(123)).thenReturn(order);
        when(dao.update(order)).thenReturn(1);

        boolean result = bo.cancelOrder(123);

        assertTrue(result);
        verify(dao).read(123);
        verify(dao).update(order);
    }

    @Test
    public void cancelOrder_ShouldNotCancelOrder() throws SQLException, BOException {
        Order order = new Order();

        when(dao.read(123)).thenReturn(order);
        when(dao.update(order)).thenReturn(0);

        boolean result = bo.cancelOrder(123);

        assertFalse(result);
        verify(dao).read(123);
        verify(dao).update(order);
    }

    @Test
    public void cancelOrder_ShouldThrowBOExceptionOnRead() throws SQLException, BOException {
        when(dao.read(123)).thenThrow(SQLException.class);
        assertThrows(BOException.class, () -> {
            bo.cancelOrder(123);
        });
    }

    @Test
    public void cancelOrder_ShouldThrowBOExceptionOnUpdate() throws SQLException, BOException {
        Order order = new Order();
        when(dao.read(123)).thenReturn(order);
        when(dao.update(order)).thenThrow(SQLException.class);
        assertThrows(BOException.class, () -> {
           bo.cancelOrder(123);
        });
    }

}