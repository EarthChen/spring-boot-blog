package com.earthchen.spring.boot.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户主页空间控制器.
 */
@Controller
@RequestMapping("/u")
@Slf4j
public class UserspaceController {

    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username") String username) {
        log.info("username" + username);
        return "u";
    }

    @GetMapping("/{username}/blogs")
    public String listBlogsByOrder(@PathVariable("username") String username,
                                   @RequestParam(value = "order", required = false, defaultValue = "new") String order,
                                   @RequestParam(value = "category", required = false) Long category,
                                   @RequestParam(value = "keyword", required = false) String keyword) {

        if (category != null) {

            log.info("category:" + category);
            log.info("selflink:" + "redirect:/u/" + username + "/blogs?category=" + category);
            return "/u";

        } else if (keyword != null && !keyword.isEmpty()) {

            log.info("keyword:" + keyword);
            log.info("selflink:" + "redirect:/u/" + username + "/blogs?keyword=" + keyword);
            return "/u";
        }

        log.info("order:" + order);
        log.info("selflink:" + "redirect:/u/" + username + "/blogs?order=" + order);
        return "/u";
    }

    @GetMapping("/{username}/blogs/{id}")
    public String listBlogsByOrder(@PathVariable("id") Long id) {

        log.info("blogId:" + id);
        return "/blog";
    }


    @GetMapping("/{username}/blogs/edit")
    public String editBlog() {

        return "/blogedit";
    }
}
