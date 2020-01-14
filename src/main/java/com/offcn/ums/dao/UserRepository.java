package com.offcn.ums.dao;

import com.offcn.ums.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    

}
