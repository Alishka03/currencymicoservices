package com.example.solva.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveTransactionDTO {
    private String accountFrom;

    private String accountTo;

    private String currencyShortname;

    private Double sum;

    private String category;
}
