package com.anwar.jpaProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInformation {
  @Id
  @GeneratedValue(generator = "id")
  Integer id;

  @Column(name = "name")
  String name;

  @Column(name = "user_name")
  String userName;

  @Column(name = "password")
  String password;
}
