package com.cep.dao.imgText;

import com.cep.entity.imgText.ImgTextBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2017/2/23.
 */
public interface ImgTextRepository extends JpaRepository<ImgTextBaseInfo,Long>,ImgTextViewRepository {

}
