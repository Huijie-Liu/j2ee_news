package com.the_news.config;

import com.the_news.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//自定义拦截器，权限控制
@Entity
public class LoginHandlerInterceptor implements HandlerInterceptor {
    private Long id;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        //获取session域中的角色
        User admin = (User) request.getSession().getAttribute("admin");
        if (admin == null) {    //如果没有登录
            request.setAttribute("msg","没有权限，请先登录");
            //请求转发
            request.getRequestDispatcher("/admin/login").forward(request,response);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
