package br.com.andreluisgomes;

import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.CorrelationStrategy;
import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

/**
 * Created by agomes on 18/07/16.
 */
@MessageEndpoint
public class StringFilter {

  @Filter(inputChannel = "channel3", outputChannel = "channel4")
  public Boolean filter(Message<String> message) {
    System.out.println("[Filter] "+ message.getPayload());
    return !message.getPayload().equals("!");
  }
}
