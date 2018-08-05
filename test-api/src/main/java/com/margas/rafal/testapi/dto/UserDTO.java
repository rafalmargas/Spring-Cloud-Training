package com.margas.rafal.testapi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@ApiModel(value="User model", description="Sample user model for the documentation")
public class UserDTO {
    @ApiModelProperty(value = "Age of user",
            allowableValues = "range[18, 120]",
            example = "20")
    @NotNull
    @Min(18)
    @Max(120)
    Long age;
}
