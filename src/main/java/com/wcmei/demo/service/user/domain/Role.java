package com.wcmei.demo.service.user.domain;

import com.wcmei.demo.commons.domain.AbstractBaseDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author wcmei
 * @date 2019-12-17
 * @description
 */
@Data
@Entity
@Table(name = "tb_base_role")
public class Role extends AbstractBaseDomain {

    String roleName;//名称
}
