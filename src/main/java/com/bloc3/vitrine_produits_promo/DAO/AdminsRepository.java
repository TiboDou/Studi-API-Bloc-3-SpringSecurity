package com.bloc3.vitrine_produits_promo.DAO;

import com.bloc3.vitrine_produits_promo.Models.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminsRepository extends JpaRepository<Admins, Integer> {

    Optional<Admins> findByName(String name);

}
