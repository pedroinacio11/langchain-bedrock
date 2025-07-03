package com.example.usecase;

import com.example.domain.MessageProvider;

public class GreetUseCase {
    private final MessageProvider messageProvider;

    public GreetUseCase(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public String execute() {
        return messageProvider.getMessage();
    }
}
