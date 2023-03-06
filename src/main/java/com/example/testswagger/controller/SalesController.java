package com.example.testswagger.controller;

import com.example.testswagger.model.Product;
import com.example.testswagger.repository.ProductRepository;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SalesController {
    private final ProductRepository productRepository;

    public SalesController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/home")
    public String getChart(){
        return "chart";
    }

    @GetMapping("/chart")
    @ResponseBody
    public List<Map<String, Object>> getProductSalesChartData() {
        //List<Object[]> data = productRepository.findProductSalesData();
        /*List<Map<String, Object>> chartData = new ArrayList<>();
        for (Object[] row : data) {
            Map<String, Object> chartRow = new HashMap<>();
            chartRow.put("name", row[0]);
            chartRow.put("sales", row[1]);
            chartData.add(chartRow);
        }*/
        List<Map<String, Object>> chartData = new ArrayList<>();
        List<Product> products =  List.of(new Product("Bimbim", 30), new Product("kẹo mút", 17),
                new Product("Kem", 26), new Product("Gà rán", 22));
        for (Product p: products){
            Map<String, Object> chartRow = new HashMap<>();
            chartRow.put("name", p.getName());
            chartRow.put("sales", p.getQuantity());
            chartData.add(chartRow);
        }
        return chartData;
    }
}
