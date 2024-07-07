package com.example.form;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import lombok.Data;

@Data
public class SignupForm {

	@NotNull
	@Min(6)
	private int userId;

    @NotBlank(groups = ValidGroup1.class)
    private String userName;
    
    private String mailAdrres;
    
    @NotBlank(groups = ValidGroup1.class)
    @Length(min = 4, max = 100, groups = ValidGroup2.class)
    @Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidGroup2.class)
    private String password;
    
    private String role;
}