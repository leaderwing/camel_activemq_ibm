package org.vpb.bridge.message.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.SimpleBuilder;
import org.springframework.stereotype.Component;

//@Component
public class TcpMsgRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        //String port = System.getProperty("port", "12345");
        String body = null;
        from("mina:tcp://localhost:8080?sync=false")
                .transform(new SimpleBuilder(body)).
                to("log:" + getClass().getName());
    }
}
