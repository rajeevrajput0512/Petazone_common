package com.petazone.common.service;


import com.petazone.common.entity.CommonMasterEntity;
import com.petazone.common.repository.CommonMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonMasterService {

    @Autowired
    CommonMasterRepository commonMasterRepository;

    public List<CommonMasterEntity> getDataByKey(String value){
        List<CommonMasterEntity > result = commonMasterRepository.findByIdKey(value);
        return result;
    }
}
