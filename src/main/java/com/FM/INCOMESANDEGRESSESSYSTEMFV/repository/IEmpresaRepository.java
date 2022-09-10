package com.FM.INCOMESANDEGRESSESSYSTEMFV.repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Long> {
}
