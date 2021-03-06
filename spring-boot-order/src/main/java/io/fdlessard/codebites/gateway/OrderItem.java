package io.fdlessard.codebites.gateway;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Table(name = "order_item", schema = "order")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @Version
    @Column(name = "version")
    private int version;

    @NotBlank(message = "product name name cannot be blank")
    @Size(min = 2, message = "product name must have more thant 2 characters")
    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity")
    private Integer quantity;

}
