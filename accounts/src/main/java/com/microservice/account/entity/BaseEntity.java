package com.microservice.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@MappedSuperclass // Indicates that this class is a base class for JPA entities and will not have its own table.
@Setter @Getter @ToString
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Column(updatable = false)// Prevents JPA from updating this field once it is set. Ideal for fields that should remain constant after creation.
    @CreatedDate//Indicates that this field should be automatically populated with the date and time when the entity is created.
    private LocalDateTime createdAt;

    @Column(updatable = false)
    @CreatedBy//Marks this field to be automatically populated with the user responsible for creating the entity.
    private String createdBy;

    @Column(insertable = false)
    @LastModifiedDate//Indicates that this field should be automatically updated with the current date and time whenever the entity is modified.
    private LocalDateTime updatedAt;

    @Column(insertable = false) //insertable = false tells JPA not to include createdAt in the INSERT SQL statement.
    @LastModifiedBy//Specifies that this field should be automatically populated with the user who last modified the entity.
    private String updatedBy;
}
