package io.vertx.ext.apex.sse.handlers;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Handler;
import io.vertx.ext.apex.RoutingContext;
import io.vertx.ext.apex.sse.SSEConnection;
import io.vertx.ext.apex.sse.handlers.impl.SSEHandlerImpl;

@VertxGen
public interface SSEHandler extends Handler<RoutingContext> {

    static SSEHandler create() {
        return new SSEHandlerImpl();
    }

    @Fluent
    public SSEHandler connectHandler(Handler<SSEConnection> connection);

    @Fluent
    public SSEHandler closeHandler(Handler<SSEConnection> connection);
}
