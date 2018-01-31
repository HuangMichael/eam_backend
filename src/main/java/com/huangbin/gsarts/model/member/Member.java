package com.huangbin.gsarts.model.member;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 会员信息
 */
@Entity
@Table(name = "T_MEMBER")
@Data
public class Member implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20, nullable = false)
    private String name;
    private Long sortNo;
    @Column(length = 1, nullable = false)
    private String status;
}
