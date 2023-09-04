package com.codingjx.fundamental.testing.order;

import java.sql.SQLException;

public class BOException extends Exception {
    private final long serialVersionUID = 1L;

    public BOException(SQLException e) {
        super(e);
    }
}
