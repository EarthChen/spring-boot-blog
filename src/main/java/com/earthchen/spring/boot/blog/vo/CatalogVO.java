package com.earthchen.spring.boot.blog.vo;

import com.earthchen.spring.boot.blog.domain.Catalog;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
@Data
public class CatalogVO implements Serializable {

    private static final long serialVersionUID = -5966619098104846325L;

    private String username;
    private Catalog catalog;

    public CatalogVO() {
    }

}
