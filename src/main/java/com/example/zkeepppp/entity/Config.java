package com.example.zkeepppp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class Config implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userNm;
    private String userPw;
}
