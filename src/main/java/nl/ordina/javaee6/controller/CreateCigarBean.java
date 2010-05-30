package nl.ordina.javaee6.controller;

import nl.ordina.javaee6.domain.Cigar;
import nl.ordina.javaee6.service.CigarService;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class CreateCigarBean {
    private CigarService cigarService;
    private FacesContext facesContext;
    private ExternalContext externalContext;
    private Cigar cigar;

    public CreateCigarBean() {
    }

    public CreateCigarBean(Cigar cigar, ExternalContext externalContext, FacesContext facesContext, CigarService cigarService) {
        this.externalContext = externalContext;
        this.facesContext = facesContext;
        this.cigarService = cigarService;
        this.cigar = cigar;
    }


    public String create() {
        System.out.println("Creating a new cigar: " + cigar.getName());
        
        cigarService.persist(cigar);

        facesContext.addMessage(null, new FacesMessage("Give that man a cigar!!"));
        return "cigars";
    }

    public Cigar getCigar() {
        return cigar;
    }

}
