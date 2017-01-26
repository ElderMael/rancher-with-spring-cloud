package io.eldermael.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@Entity
@Builder
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String name;

}
