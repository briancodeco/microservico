package com.ms.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.email.model.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
