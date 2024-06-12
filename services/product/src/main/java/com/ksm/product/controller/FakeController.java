package com.ksm.product.controller;

import com.ksm.product.util.FakeData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fake")
@RequiredArgsConstructor
public class FakeController {
    private final FakeData fakeData;

    @PostMapping("/category")
    public void addFakeCategory(@RequestParam("count") int count) {
        fakeData.addFakeCategories(count);
    }

    @PostMapping("/product")
    public void addFakeProduct(@RequestParam("count") int count) {
        fakeData.addFakeProducts(count);
    }
}
