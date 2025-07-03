package com.example.usecase;

import com.example.domain.MessageProvider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetUseCaseTest {

    @Test
    void executeReturnsMessageFromProvider() {
        MessageProvider provider = () -> "Test Message";
        GreetUseCase useCase = new GreetUseCase(provider);
        assertEquals("Test Message", useCase.execute());
    }
}
