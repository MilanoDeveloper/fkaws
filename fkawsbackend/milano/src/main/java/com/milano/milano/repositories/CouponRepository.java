package com.milano.milano.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milano.milano.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{

}
