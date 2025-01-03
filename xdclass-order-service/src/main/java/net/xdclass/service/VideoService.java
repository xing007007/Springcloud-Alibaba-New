package net.xdclass.service;

import net.xdclass.domain.Video;
import net.xdclass.service.fallback.VideoServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 邢生龙
 * @date 2024/12/1314:25
 * @description 订单服务所有远程接口
 */
@FeignClient(name="xdclass-video-service",fallback = VideoServiceFallBack.class)
public interface VideoService {

    @GetMapping("/api/v1/video/findById")
    Video findById(@RequestParam("videoId") int videoId);

    @PostMapping("/api/v1/video/save")
    int saveVideo(@RequestBody Video video);

}
