package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
