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
public class NewCreditCardEvent {

    @Builder.Default
    private eventType event = eventType.New_Credit_Card;

    private List<ApplicationDetail> creditCardApplications;
}