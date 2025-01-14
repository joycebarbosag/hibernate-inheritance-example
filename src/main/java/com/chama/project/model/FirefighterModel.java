package com.chama.project.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="firefighter", schema="chama")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FirefighterModel extends UserModel {
    
    private String patent;
    private String fireHouse;
    private String firefighterRegister;

}