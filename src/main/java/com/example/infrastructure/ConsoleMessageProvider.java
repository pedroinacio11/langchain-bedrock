package com.example.infrastructure;

import com.example.domain.MessageProvider;

public class ConsoleMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello, Clean Architecture!";
    }
}
