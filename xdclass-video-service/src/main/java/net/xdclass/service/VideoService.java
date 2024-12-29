package net.xdclass.service;

import net.xdclass.domain.Video;

import javax.servlet.http.HttpServletRequest;

/**
 * @authordell
 * @date2024/12/110:48
 * @param${PARAM}
 */
public interface VideoService {

    Video findById(int videoId);
}
