package com.spring.stockCast.controller;

import com.spring.stockCast.service.OrderingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class OrderingController {
    private final OrderingService orderingService;
}
