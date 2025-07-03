package com.example;

import com.example.infrastructure.ConsoleMessageProvider;
import com.example.usecase.GreetUseCase;

public class App {
    public static void main(String[] args) {
        GreetUseCase greet = new GreetUseCase(new ConsoleMessageProvider());
        System.out.println(greet.execute());
    }
}
