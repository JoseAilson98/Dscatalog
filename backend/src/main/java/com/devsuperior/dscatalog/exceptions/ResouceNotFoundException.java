package com.devsuperior.dscatalog.exceptions;

import java.io.Serial;

public class ResouceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public ResouceNotFoundException(String message) {
        super(message);
    }

}
