package com.petazone.common.repository;

import com.petazone.common.entity.CommonMasterEntity;
import com.petazone.common.entity.CommonMasterPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommonMasterRepository extends JpaRepository<CommonMasterEntity, CommonMasterPK> {
  List<CommonMasterEntity> findByIdKey(String value);
}
