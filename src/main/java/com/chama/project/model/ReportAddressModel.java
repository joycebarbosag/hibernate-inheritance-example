package com.chama.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="report_address", schema="chama")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReportAddressModel extends AddressModel{

 @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
 @JsonBackReference
 private ReportModel reports;
 
}
