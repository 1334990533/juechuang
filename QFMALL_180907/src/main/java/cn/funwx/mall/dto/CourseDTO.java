package cn.funwx.mall.dto;

/**
 * @author chj
 * @description 课程
 * @date 2018/9/7 16:53
 */
public class CourseDTO {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 课程类目
     */
    private int categoryId;
    /**
     * 课程标签
     */
    private String tag;
    /**
     * 是否启用试卷
     */
    private int isNotPaper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getIsNotPaper() {
        return isNotPaper;
    }

    public void setIsNotPaper(int isNotPaper) {
        this.isNotPaper = isNotPaper;
    }
}
