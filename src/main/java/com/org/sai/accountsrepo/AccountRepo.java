package com.org.sai.accountsrepo;


import com.org.sai.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Accounts,Integer> {


}
