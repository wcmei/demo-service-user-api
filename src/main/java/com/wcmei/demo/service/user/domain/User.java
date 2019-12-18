package com.wcmei.demo.service.user.domain;


import com.wcmei.demo.commons.domain.AbstractBaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@Data
@Entity
@Table(name = "tb_base_user")
public class User extends AbstractBaseDomain {

    private String userName;//名称
    private String userAccount;//账号
    private String userPassword;//密码
    private Long roleId;//角色id
}
