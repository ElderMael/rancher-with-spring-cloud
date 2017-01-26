package io.eldermael.repositories;


import io.eldermael.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
