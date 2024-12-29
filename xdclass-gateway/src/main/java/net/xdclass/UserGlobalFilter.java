package net.xdclass;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 邢生龙
 * @date 2024/12/2316:01
 * @description
 */
//@Component
public class UserGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //实现业务逻辑
        String token = exchange.getRequest().getHeaders().getFirst("token");
        //判断请求中是否包含token
        if(StringUtils.isBlank(token)){
            //如果token为空则说明没有带token过来，鉴权失败
            exchange.getResponse().setStatusCode(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
            return exchange.getResponse().setComplete();
        }
        //如果不为空则继续向下执行
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        //值越小，越优先执行
        return 0;
    }
}
