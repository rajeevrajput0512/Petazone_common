package com.petazone.common.utils;

import com.petazone.common.dto.response.ApiResponseCommon;
import org.springframework.http.ResponseEntity;


public abstract class ResponseUtils {

    private ResponseUtils(){

    }
    public static <T> ResponseEntity<ApiResponseCommon<T> > createSuccessResponse(T data){
        return ResponseEntity.ok(new ApiResponseCommon<>(true,data,null));
    }
}
