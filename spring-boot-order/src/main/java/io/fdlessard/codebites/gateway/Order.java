package io.fdlessard.codebites.gateway;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table(name = "order", schema = "order")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @Version
    @Column(name = "version")
    private int version;

    @Column(name = "date")
    private String date;

    @JoinColumn(name = "order_id")
    @OneToMany(cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems;

}

