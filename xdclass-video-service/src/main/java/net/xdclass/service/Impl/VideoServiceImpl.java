package net.xdclass.service.Impl;

import net.xdclass.domain.Video;
import net.xdclass.mapper.VideoMapper;
import net.xdclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @authordell
 * @date2024/12/110:49
 * @param${PARAM}
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findById(int videoId) {
        Video video = videoMapper.selectById(videoId);
        return video;
    }
}
