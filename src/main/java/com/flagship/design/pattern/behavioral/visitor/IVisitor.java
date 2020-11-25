package com.flagship.design.pattern.behavioral.visitor;

/**
 * @Author Flagship
 * @Date 2020/11/22 18:53
 * @Description
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);
    void visit(CodingCourse codingCourse);
}
