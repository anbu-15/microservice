package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of Easy Bank Account",example = "9879875431"
    )
    @NotEmpty(message = "Account Number cannot be null or empty")
    @Pattern(regexp = "($|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Easy Bank Account",example = "Savings"
    )
    @NotEmpty(message = "Account Type cannot be null or Empty")
    private String accountType;

    @Schema(
            description = "Branch Address of Easy Bank Account",example = "123,NewYork"
    )
    @NotEmpty(message = "Branch Address cannot be null or Empty")
    private String branchAddress;
}
