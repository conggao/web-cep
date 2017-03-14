package com.cep.dao.file;

import com.cep.entity.file.DirInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2016/12/28.
 */
public interface DirRepository extends JpaRepository<DirInfo, Long> {
    DirInfo findByParentIdAndCreateUserId(Long parentId, Long createUserId);

}
