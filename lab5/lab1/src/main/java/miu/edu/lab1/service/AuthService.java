package miu.edu.lab1.service;


import miu.edu.lab1.entity.dto.request.LoginRequest;
import miu.edu.lab1.entity.dto.request.RefreshTokenRequest;
import miu.edu.lab1.entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
