/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.hackingspringboot.reactive.ch2;

/**
 * @author Greg Turnquist
 */
public class Sample1 {

	void demo1() {

		Cart cart = new Cart("My Cart");

		// tag::1[]
		boolean found = false;

		for (CartItem cartItem : cart.getCartItems()) {
			if (cartItem.getItem().getId().equals("5")) {
				found = true;
			}
		}

		if (found) {
			// increment
		} else {
			// add new CartItem
		}
		// end::1[]
	}

	void demo2() {

		Cart cart = new Cart("My Cart");

		// tag::2[]
		if (cart.getCartItems().stream() //
				.anyMatch(cartItem -> cartItem.getItem().getId().equals("5"))) {
			// increment
		} else {
			// add new CartItem
		}
		// end::2[]
	}
}