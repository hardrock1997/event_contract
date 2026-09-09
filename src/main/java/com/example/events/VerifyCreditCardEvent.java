package com.example.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyCreditCardEvent {
    @Builder.Default
    private eventType event = eventType.Approve_credit_card;
    private List<CreditCardVerificationStatus> creditCardVerificationStatus;
}
