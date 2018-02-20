package com.earthchen.spring.boot.blog.vo;

import java.io.Serializable;

/**
 * @author: EarthChen
 * @date: 2018/02/20
 */
public class TagVO implements Serializable {


    private static final long serialVersionUID = -1452218442062873431L;
    private String name;
    private Long count;

    public TagVO(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

}
