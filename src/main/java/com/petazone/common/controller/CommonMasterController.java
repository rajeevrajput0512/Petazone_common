package com.petazone.common.controller;


import com.petazone.common.dto.request.CommonMasterRequestDTO;
import com.petazone.common.dto.response.ApiResponseCommon;
import com.petazone.common.entity.CommonMasterEntity;
import com.petazone.common.service.CommonMasterService;
import com.petazone.common.utils.ResponseUtils;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/petazone/v1/common")
public class CommonMasterController {

    @Autowired
    CommonMasterService commonMasterService;

    @PostMapping("/getAllByKey")
    public ResponseEntity<?> getDataByKey(@Valid @RequestBody CommonMasterRequestDTO requestDTO){
        List<CommonMasterEntity> data =  commonMasterService.getDataByKey(requestDTO.getValue());
        return ResponseUtils.createSuccessResponse(data);
    }

}
