package com.example.demo.controller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwsSecrets {

    private String username;
    private String password;
    private String host;
    private String engine;
    private String port;
    private String dbInstanceIdentifier;

    @Override
    public String toString() {
        return "AwsSecrets{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                ", engine='" + engine + '\'' +
                ", port='" + port + '\'' +
                ", dbInstanceIdentifier='" + dbInstanceIdentifier + '\'' +
                '}';
    }
}