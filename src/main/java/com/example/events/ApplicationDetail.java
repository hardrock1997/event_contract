package com.example.events;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDetail {

    private String firstName;

    private String lastName;

    private Integer annualIncome;

    private String address;
}
