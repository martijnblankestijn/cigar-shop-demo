package nl.ordina.javaee6.service;

import nl.ordina.javaee6.domain.Cigar;
import nl.ordina.javaee6.domain.Cigar_;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CigarServiceImpl implements CigarService {
    @Override
    public List<Cigar> getCigars() {
        System.out.println("Getting list of cigars");

        final Cigar cigar = new Cigar();
        cigar.setName("dummy");
        cigar.setPrice(new BigDecimal("20.45"));
        return Arrays.asList(cigar);

    }

    @Override
    public void persist(Cigar cigar) {
        System.out.println("Persisting new cigar: " + cigar.getName());
    }
}
