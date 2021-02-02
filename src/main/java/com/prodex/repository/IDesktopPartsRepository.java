package com.prodex.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prodex.entity.DesktopParts;

public interface IDesktopPartsRepository extends JpaRepository<DesktopParts, Integer>{
	
	@Query("select expireDate from com.prodex.entity.DesktopParts where customerName LIKE '%'||?1||'%' OR instanceName LIKE '%'||?1||'%' OR ipAddress LIKE '%'||?1||'%'")
	public Date searching(String prop);

}
