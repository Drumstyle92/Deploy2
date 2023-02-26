package it.develhope.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

/**
 * @author Drumstyle92
 * Controller class to handle CRUD
 */
@RestController
public class BasicController {

    /**
     * Instance of class Random to be able to use methods to make certain values random
     */
    private Random random = new Random();

    /**
     * @return Returns a result from a sum
     * Get method that adds two random numbers
     */
    @GetMapping("/sum")
    public int sum() {

        int a = random.nextInt(100);
        int b = random.nextInt(100);

        return a + b;

    }

}
