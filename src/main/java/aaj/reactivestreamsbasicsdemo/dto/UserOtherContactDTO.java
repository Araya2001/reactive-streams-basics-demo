package aaj.reactivestreamsbasicsdemo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

@Builder
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public record UserOtherContactDTO(
    @JsonProperty("email")
    String email,
    @JsonProperty("phone_number")
    String phoneNumber,
    @JsonProperty("address")
    String address
) {
}
