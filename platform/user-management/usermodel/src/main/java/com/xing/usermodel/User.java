package com.xing.usermodel;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @author xiexingxing
 * @Created by 2019-11-17 22:52.
 */
@Data
@TableName("tb_user")
public class User implements Serializable {
    private String username;
    @TableId
    private Long id;
}