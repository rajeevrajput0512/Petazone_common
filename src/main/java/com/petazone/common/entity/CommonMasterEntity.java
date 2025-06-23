package com.petazone.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(schema = "cmn_tbl",name = "common_master")
@Getter
@Setter
public class CommonMasterEntity {

    @EmbeddedId
    CommonMasterPK id;

    @Column(name = "value")
    String value;

    @Column(name = "is_active")
    Boolean isActive;

}
