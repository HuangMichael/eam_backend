package com.huangbin.gsarts.model.role;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 角色信息
 */
@Entity
@Table(name = "T_ROLE")
@Data
public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private String name;
    private Long sortNo;
    @Column(length = 1, nullable = false)
    private String status;
}