package com.flagship.design.pattern.creational.builder;

/**
 * @ClassName: CourseBuilder
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 0:30
 */
public abstract class CourseBuilder {
//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String courseArticle;
//
//    /**
//     * 问答
//     */
//    private String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
