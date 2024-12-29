package net.xdclass.domain;


import java.util.Date;
import java.util.Objects;

/**
 * @authordell
 * @date2024/12/1021:29
 * @param${PARAM}
 */

public class VideoOrder {

    private Integer id;
    private String outTradeNo;
    private Integer state;
    private Date createTime;
    private  Integer totalFee;
    private Integer videoId;
    private String videoTitle;
    private String videoImg;
    private Integer userId;

    public VideoOrder(Integer id, String outTradeNo, Integer state, Date createTime, Integer totalFee, Integer videoId, String videoTitle, String videoImg, Integer userId) {
        this.id = id;
        this.outTradeNo = outTradeNo;
        this.state = state;
        this.createTime = createTime;
        this.totalFee = totalFee;
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.videoImg = videoImg;
        this.userId = userId;
    }

    public VideoOrder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                ", totalFee=" + totalFee +
                ", videoId=" + videoId +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoImg='" + videoImg + '\'' +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(outTradeNo, that.outTradeNo) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(totalFee, that.totalFee) &&
                Objects.equals(videoId, that.videoId) &&
                Objects.equals(videoTitle, that.videoTitle) &&
                Objects.equals(videoImg, that.videoImg) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, outTradeNo, state, createTime, totalFee, videoId, videoTitle, videoImg, userId);
    }
}
