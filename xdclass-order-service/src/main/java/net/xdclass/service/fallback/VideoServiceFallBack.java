package net.xdclass.service.fallback;

import net.xdclass.domain.Video;
import net.xdclass.service.VideoService;
import org.springframework.stereotype.Service;

/**
 * @author 邢生龙
 * @date 2024/12/2117:50
 * @description
 */
@Service
public class VideoServiceFallBack implements VideoService {

    @Override
    public Video findById(int videoId) {
        Video video = new Video();
        video.setTitle("兜底数据");
        return video;
    }

    @Override
    public int saveVideo(Video video) {
        return 0;
    }
}
