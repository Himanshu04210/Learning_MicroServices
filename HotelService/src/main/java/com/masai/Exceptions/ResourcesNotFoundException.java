package com.masai.Exceptions;

public class ResourcesNotFoundException extends Exception{
    public ResourcesNotFoundException(String message) {
        super(message);
    }

    public ResourcesNotFoundException() {
        super("Resource not found!!");
    }
}
