package br.com.andreluisgomes;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Created by agomes on 18/07/16.
 */
@Service
public class HelloTransformedImpl implements HelloService{

  @Override
  @ServiceActivator(inputChannel = "channel2") // Este Endpoint tem como entrada o canal 'channel2' transformado
  public void hello(String name) {
    System.out.println("[ServiceActivator Endpoint Tranformer] HELLO, " + name );
  }
}
