package org.practice.capitalmortgase.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LoanProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LoanId;
}
