package br.com.andreluisgomes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Created by agomes on 17/07/16.
 */
@Service
public class GreeterServiceImpl implements GreeterService {

  @Autowired
  private MessageChannel channel1;

  @Override
  public void greet(String name){
      channel1.send(MessageBuilder.withPayload( name ).build() );
  }
}
