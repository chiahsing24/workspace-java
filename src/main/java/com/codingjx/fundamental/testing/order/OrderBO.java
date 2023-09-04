package com.codingjx.fundamental.testing.order;

public interface OrderBO {
    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;
}
