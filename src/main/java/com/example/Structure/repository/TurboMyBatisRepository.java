package com.example.Structure.repository;

import com.example.Structure.entity.model.Turbo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;
@Mapper
public interface TurboMyBatisRepository {

        List<Turbo> findAll();
        Optional<Turbo> findById(@Param("id") Long id);
        void insert(Turbo turbo);
        void update(Turbo turbo);
        void updateCarYear(@Param("id") Long id, @Param("year") Integer year);
        void delete(@Param("id") Long id);
    }

