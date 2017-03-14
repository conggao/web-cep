package com.cep.dao.master;

import com.cep.entity.master.IoBaseInfo;
import com.cep.entity.master.UserPasswordInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2016/12/26.
 */
public interface IOPasswordReponsitory extends JpaRepository<IoBaseInfo, Long> {

}
