package net.cho.api.Item.repository;

import net.cho.api.Item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itemrepository extends JpaRepository<Item,Long> {

}
