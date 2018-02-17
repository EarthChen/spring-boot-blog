package com.earthchen.spring.boot.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * 权限
 */
@Data
@Entity // 实体
public class Authority implements GrantedAuthority {


    private static final long serialVersionUID = -6013484072348687729L;

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Long id; // 用户的唯一标识

    @Column(nullable = false) // 映射为字段，值不能为空
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

}
