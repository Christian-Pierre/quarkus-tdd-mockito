package com.example.greeting;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.service.GreetingService;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {
    @InjectMock
    GreetingService greetingService;

    @Test
    public void GreetingService_Greet_ReturnString(){
         String mockedString = "World";
    
        // Definindo o comportamento mockado
        when(
            greetingService.greet(Mockito.anyString())
        ).thenReturn(
            "Mocked Hello, World"
        );
    
        // Chamando o método de serviço e verificando o retorno
        String result = greetingService.greet(mockedString);

        //verificando o retorno
        Assertions.assertEquals("Mocked Hello, World", result);

    }
}
