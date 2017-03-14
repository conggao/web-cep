package com.cep.dao.file;

import java.util.List;
import com.cep.entity.file.UploadFileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2017/1/11.
 */
public interface UploadFileInfoReponsitory extends JpaRepository<UploadFileInfo, Long> {
    List<UploadFileInfo> findByNameLike(String name);
}
