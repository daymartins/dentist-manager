package br.com.dayanemt.dentistmanager.repository;

import br.com.dayanemt.dentistmanager.model.StorageItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<StorageItem, Long> {
}
