package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold a Successful response information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code in the Response", example = "200"
    )
    private String statusMessage;
    @Schema(
            description = "Status message in the Response", example = "Request processed Successfully"
    )
    private String statusCode;

}
