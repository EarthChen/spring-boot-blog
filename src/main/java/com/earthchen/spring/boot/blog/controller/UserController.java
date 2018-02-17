package com.earthchen.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制器.
 */
@RestController
@RequestMapping("/users")
public class UserController {


    /**
     * 查询所用用户
     *
     * @return
     */
    @GetMapping
    public ModelAndView list() {

        return new ModelAndView("users/list");
    }


}
