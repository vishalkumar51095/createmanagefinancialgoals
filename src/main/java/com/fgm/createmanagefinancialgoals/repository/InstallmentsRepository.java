package com.fgm.createmanagefinancialgoals.repository;

import com.fgm.createmanagefinancialgoals.entities.Installments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("")
public interface InstallmentsRepository extends JpaRepository<Installments, Integer> {
    List<Installments> findByUserName(String userName);

    @Query(value = "SELECT SUM(instaAmount) FROM INSTALLMENTS",nativeQuery = true)
    public int selectTotals();


}
