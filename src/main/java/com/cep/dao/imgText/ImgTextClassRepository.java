package com.cep.dao.imgText;

import com.cep.entity.imgText.ImgTextClassInfo;
import com.cep.entity.imgText.ImgTextFileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2017/2/23.
 */
public interface ImgTextClassRepository extends JpaRepository<ImgTextClassInfo,Long>{

}
