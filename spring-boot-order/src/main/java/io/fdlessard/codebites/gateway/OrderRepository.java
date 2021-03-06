package io.fdlessard.codebites.gateway;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "orders")
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {


}
