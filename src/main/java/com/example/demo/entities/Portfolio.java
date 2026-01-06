package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    private LocalDate createdDate;

    public Portfolio(Long portfolioId, Client client, LocalDate createdDate) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.createdDate = createdDate;
    }

    public Portfolio() {
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
