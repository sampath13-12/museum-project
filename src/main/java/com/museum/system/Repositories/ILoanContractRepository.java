package com.museum.system.Repositories;

import com.museum.system.Entities.LoanContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoanContractRepository extends JpaRepository<LoanContract, Long> {
}
