package com.hogenbros.shamania.acces;

import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShamanRepository extends JpaRepository<Shaman, String> {
    Shaman findShamanByFullName(String fullName);
}