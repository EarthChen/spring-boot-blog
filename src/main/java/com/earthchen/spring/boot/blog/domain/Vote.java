package com.earthchen.spring.boot.blog.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
@Data
@Entity // 实体
public class Vote implements Serializable {

    private static final long serialVersionUID = 3133647182996440736L;

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Long id; // 用户的唯一标识

    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false) // 映射为字段，值不能为空
    @org.hibernate.annotations.CreationTimestamp  // 由数据库自动创建时间
    private Timestamp createTime;

    protected Vote() {
    }

    public Vote(User user) {
        this.user = user;
    }


}
