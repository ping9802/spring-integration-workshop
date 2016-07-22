package br.com.andreluisgomes;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Splitter;
import org.springframework.integration.annotation.Transformer;

/**
 * Created by agomes on 18/07/16.
 */

@MessageEndpoint
public class StringSplitter {

  @Splitter(inputChannel = "channel2", outputChannel = "channel3")
  public String[] splitter(String message) {
    System.out.println("[Splitter] "+ message);
    return new String(message).split("(?!^)");
  }

}
