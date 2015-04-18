package demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;

@Component
public class SqsMessagePrinter {

  @MessageMapping("your-queue-here")
  public void printMessage(String message){
    System.out.println("message = " + message);
  }
}
