package com.example.bookStore.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookOrderRequest {
    private List<Integer> bookIdList;
    private String username;
}
