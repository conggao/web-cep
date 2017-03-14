package com.cep.dao.master;

import com.cep.entity.master.UserPasswordInfo;
import com.cep.entity.user.HealthBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2016/12/26.
 */
public interface HealthReponsitory extends JpaRepository<HealthBaseInfo, Long> {

}
