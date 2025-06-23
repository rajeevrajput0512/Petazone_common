package com.petazone.common.dto.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseCommon<T> {
    Boolean flg;
    T data;
    String msg;

    public ApiResponseCommon(Boolean flg , T data, String msg){
        this.data = data;
        this.flg = flg;
        this.msg = msg;
    }

}
