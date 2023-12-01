package com.example.demo.personDb;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name="PersonData")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=30)
    private  String fname;

    private String lname;

    @Column(length = 40, unique = true)
    private String email;

    private Integer age;

    @Transient
    private String country;
}
