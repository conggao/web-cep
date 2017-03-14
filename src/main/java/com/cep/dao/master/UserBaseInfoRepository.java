package com.cep.dao.master;


import com.cep.entity.master.UserBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserBaseInfoRepository extends JpaRepository<UserBaseInfo,Long> {
     UserBaseInfo findByUserName(String userName);
}
