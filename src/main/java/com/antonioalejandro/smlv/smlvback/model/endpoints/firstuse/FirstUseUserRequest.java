package com.antonioalejandro.smlv.smlvback.model.endpoints.firstuse;

public record FirstUseUserRequest(
String username, String name,
String lastname, String email,
String password, FirstUseHealthRequest health)
{

}
