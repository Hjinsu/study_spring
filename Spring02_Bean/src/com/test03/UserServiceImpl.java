package com.test03;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		System.out.println("UserServiceImpl constructor");
	}
	@Override
	public void addUser(UserDto dto) {
		System.out.println("addUser 메서드 호출");
		System.out.println(dto.getName());
		System.out.println(dto.getMyDate());
	}

}
