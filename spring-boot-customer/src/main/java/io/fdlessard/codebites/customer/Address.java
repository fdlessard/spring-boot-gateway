package io.fdlessard.codebites.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "address", schema = "customer")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @JsonIgnore
  @Version
  @Column(name = "version")
  private int version;

  @Column(name = "number")
  private String number;
  @Column(name = "street")
  private String street;
  @Column(name = "city")
  private String city;
  @Column(name = "postal_code")
  private String postalCode;
  @Column(name = "province")
  private String province;
  @Column(name = "country")
  private String country;

}