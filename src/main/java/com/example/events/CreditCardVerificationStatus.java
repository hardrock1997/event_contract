package com.example.events;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardVerificationStatus {
    private String firstName;

    private String lastName;

    private Integer AnnualIncome;

    private String address;

    private verificationStatus status;

    private String refId;
}
