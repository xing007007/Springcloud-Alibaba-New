package net.xdclass.controller;

import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import net.xdclass.domain.Video;
import net.xdclass.domain.VideoOrder;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @authordell
 * @date2024/12/112:48
 * @param${PARAM}
 */
@RequestMapping("api/v1/order_video")
@RestController
@RefreshScope
public class OrderVideoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private VideoService videoOrder;

    @RequestMapping("findById")
    public Object findById(@RequestParam("videoId") int videoId){
        //Video video = restTemplate.getForObject("http://localhost:7000/api/v1/vide/findById?videoId=" + videoId, Video.class);
//        List<ServiceInstance> instanceList = discoveryClient.getInstances("xdclass-video-service");//调视频服务
        //这个是把所调服务的列表全部列出来,然后你可以使用随机数随机路由
//        ServiceInstance serviceInstance = instanceList.get(0);
        //把IP与端口写活
        //Video video = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/api/v1/video/findById?videoId=" + videoId, Video.class);
        //Video video = restTemplate.getForObject("http://xdclass-video-service/api/v1/video/findById?videoId=" + videoId, Video.class);
        Video video = videoOrder.findById(videoId);
//        VideoOrder videoOrder = VideoOrder.builder().videoId(video.getId())
//                .createTime(new Date()).
//                        videoTitle(video.getTitle()).serverInfo(video.getServerInfo()).build();
        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setVideoId(video.getId());
        videoOrder.setCreateTime(new Date());
        videoOrder.setVideoTitle(video.getTitle());
        return videoOrder;
    }


    @RequestMapping("save")
    public Object saveVideo(@RequestBody Video video){
        Integer rows = videoOrder.saveVideo(video);
        Map<String,Object> map = new HashMap<>();
        map.put("rows",rows);
        return map;
    }

    @Value("${xingshenglong.value}")
    private String value;

    int a = 0;
    @RequestMapping("list")
    public Object list( HttpServletRequest httpServletRequest){
        a++;
        if(a%3==0){
//            throw new RuntimeException("000000000000000000000000000000");
        }
        Map<String,String> map = new HashMap<>();
        map.put("title1","ALibabaCloud微服务专题");
        map.put("title2","⼩滴课堂⾯试专题第⼀季");
        map.put("value",value);
        map.put("port",httpServletRequest.getServerPort()+"");
        return map;
    }

    @RequestMapping("list1")
    public Object list1(HttpServletRequest httpServletRequest){
        Map<String,String> map = new HashMap<>();
        map.put("title1","ALibabaCloud微服务专题");
        map.put("title2","⼩滴课堂⾯试专题第⼀季");
        map.put("port",httpServletRequest.getServerPort()+"");
        return map;
    }

    @RequestMapping("choise")
    public Object choise(@RequestParam(required = false)String type){
        Map<String,String> map = new HashMap<>();
        if("list".equalsIgnoreCase(type)){
            map.put("msg","这是list方法");
        }else if("list1".equalsIgnoreCase(type)){
            map.put("msg","这是list1方法");
        }else{
            map.put("msg","没有找到任何方法");
        }
        System.out.println("v1");
        return map;
    }
}
