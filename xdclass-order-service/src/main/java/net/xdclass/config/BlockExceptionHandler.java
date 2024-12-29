package net.xdclass.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 邢生龙
 * @date 2024/12/2116:46
 * @description
 */
@Component
public class BlockExceptionHandler implements com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        Map<String,Object> map = new HashMap<>();
        if(e instanceof FlowException){
            map.put("code",-1);
            map.put("msg","限流-异常啦");
        }
        else if (e instanceof DegradeException){
            map.put("code",-2);
            map.put("msg","降级-异常啦");
        }else if (e instanceof ParamFlowException){
            map.put("code",-3);
            map.put("msg","热点-异常啦");
        }else if (e instanceof SystemBlockException){
            map.put("code",-4);
            map.put("msg","系统规则-异常啦");
        }else if (e instanceof AuthorityException){
            map.put("code",-5);
            map.put("msg","认证-异常啦");
        }
        httpServletResponse.setStatus(200);
        httpServletResponse.setHeader("content-Type","application/json;charset=UTF-8");
        httpServletResponse.getWriter().print(JSON.toJSONString(map));
    }
}
