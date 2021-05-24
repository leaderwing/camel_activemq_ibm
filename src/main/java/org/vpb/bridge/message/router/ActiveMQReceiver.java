package org.vpb.bridge.message.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


//@Component
public class ActiveMQReceiver  extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:VPB")
                .log("${body}")
                .to("stream:out");
    }
}
