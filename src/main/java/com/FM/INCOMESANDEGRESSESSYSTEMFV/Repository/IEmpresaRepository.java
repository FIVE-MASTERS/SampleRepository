package com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository;


import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Long> {
}
