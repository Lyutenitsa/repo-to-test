package com.indv_project.rest_api.models.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class UserCreateRequest {

    private String username;
    private String password;

}
