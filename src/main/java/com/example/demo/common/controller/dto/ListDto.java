package com.example.demo.common.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ListDto<I> {

  private final List<I> items;

}
