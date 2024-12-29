package net.xdclass.controller;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @authordell
 * @date2024/12/110:50
 * @param${PARAM}
 */
@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;


    @RequestMapping("findById")
    public Object getVideo(int videoId, HttpServletRequest request){
        Video video = videoService.findById(videoId);
        return video;
    }

    @RequestMapping("save")
    public int saveVideo(@RequestBody Video video){
        System.out.println("video:"+video.getTitle());
        return 1;
    }



}
