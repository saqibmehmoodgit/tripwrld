package com.airline.responselist;

import com.airline.mapper.ResponseDto;
import com.airline.mapper.ResponseDto.ResponseDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {
	private String userName;
	  private String userPassword;
	  private String firstName;
}
