package net.xdclass.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.util.Objects;

/**
 * @authordell
 * @date2024/12/1021:29
 * @param${PARAM}
 */

@TableName("video")
public class Video {

    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer  price;
    private Date createTime;
    private Double point;

    public Video() {
    }

    public Video(Integer id, String title, String summary, String coverImg, Integer price, Date createTime, Double point) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.coverImg = coverImg;
        this.price = price;
        this.createTime = createTime;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(id, video.id) &&
                Objects.equals(title, video.title) &&
                Objects.equals(summary, video.summary) &&
                Objects.equals(coverImg, video.coverImg) &&
                Objects.equals(price, video.price) &&
                Objects.equals(createTime, video.createTime) &&
                Objects.equals(point, video.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, summary, coverImg, price, createTime, point);
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }
}
