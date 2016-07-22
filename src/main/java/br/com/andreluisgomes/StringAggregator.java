package br.com.andreluisgomes;

import org.springframework.integration.annotation.*;
import org.springframework.messaging.Message;

import java.util.List;

/**
 * Created by agomes on 18/07/16.
 */
@MessageEndpoint
public class StringAggregator {

  @Aggregator(inputChannel = "channel4", outputChannel = "channel5", sendPartialResultsOnExpiry = "false")
  public String agragate(String[] character) { //List<Message<String>> character
    System.out.println("[Aggregator] "+ character);
    StringBuilder resut = new StringBuilder();
    for (String ch: character)
      resut.append(ch);

    return resut.toString();
  }

  @ReleaseStrategy // Quando liberar
  public boolean canRelease(List<Message<?>> messages) {
      if (messages.size()==14)
        return true;
    return false;
  }

 /*@CorrelationStrategy //Como juntar
  public Object correlateBy(Message<String> message) {
    return message.getHeaders().getId();
  }*/
}
