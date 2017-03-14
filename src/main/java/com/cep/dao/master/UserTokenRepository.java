package com.cep.dao.master;

import com.cep.entity.master.UserToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2017/1/22.
 */
public interface UserTokenRepository extends JpaRepository<UserToken,Long>{
}
