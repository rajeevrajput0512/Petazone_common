package com.petazone.common.dto.request;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonMasterRequestDTO {
    @NotNull
    String value;
}
