package com.sky.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Member {
	private Long memberId;
	@NonNull private String name;
	@NonNull private String city;
	@NonNull private String street;
	@NonNull private String zipcode;
}
