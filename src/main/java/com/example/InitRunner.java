package com.example;

//import com.copado.tango.Foo;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.scheduling.annotation.Async;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class InitRunner {

  private static final Logger log = LoggerFactory.getLogger(InitRunner.class);


//  private final Foo foo;

//  public InitRunner(Foo foo) {
//    this.foo = foo;
//  }

  @EventListener
  @Async
  public void loadConferenceData(final StartupEvent event) {
    log.info("Loading data at startup");
//    log.info(foo.foo());

  }
}
