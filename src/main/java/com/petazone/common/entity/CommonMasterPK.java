package com.petazone.common.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class CommonMasterPK implements Serializable {

    @Column(name = "key")
    String key;

    @Column(name = "id")
    Long id;

    public CommonMasterPK(String key , Long id){
        this.id = id;
        this.key = key;
    }

}
