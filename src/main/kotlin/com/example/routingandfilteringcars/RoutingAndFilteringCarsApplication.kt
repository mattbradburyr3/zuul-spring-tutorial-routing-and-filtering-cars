package com.example.routingandfilteringcars

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// Follows Routing and Filtering tutorial https://spring.io/guides/gs/routing-and-filtering/ but converts to kotlin this is the books repo

@RestController
@SpringBootApplication
class RoutingAndFilteringCarsApplication{

	@GetMapping("/available")
	fun available(): String {
		return "Car is avialable"
	}
	@GetMapping("/outofstock")
	fun outOfStock(): String {
		return "car is out of stock"
	}

}

fun main(args: Array<String>) {
	runApplication<RoutingAndFilteringCarsApplication>(*args)
}
