package com.microservice.account.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class Customer  extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name ="native",strategy = "native")
    private Long id;
    private String name;
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;



}
