package com.arolla.kata.harrypotter;

import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class HarryPotterDiscount {
    private final double PRICE_OF_ONE_BOOK = 8.00;
    private final double DISCOUNT_FOR_ONE_DISTINCT_BOOKS = 1.0;
    private final double DISCOUNT_FOR_TWO_DISTINCT_BOOKS = 0.95;
    private final double DISCOUNT_FOR_THREE_DISTINCT_BOOKS = 0.90;
    private final double DISCOUNT_FOR_FOUR_DISTINCT_BOOKS = 0.80;
    private final double DISCOUNT_FOR_FIVE_DISTINCT_BOOKS = 0.75;
    private final double [] discounts = {
            0,
            DISCOUNT_FOR_ONE_DISTINCT_BOOKS,
            DISCOUNT_FOR_TWO_DISTINCT_BOOKS,
            DISCOUNT_FOR_THREE_DISTINCT_BOOKS,
            DISCOUNT_FOR_FOUR_DISTINCT_BOOKS,
            DISCOUNT_FOR_FIVE_DISTINCT_BOOKS};

    public double calculatePrice(String... books) {
        int number_of_books = books.length;

        Set<String> distinctBooks = Stream.of(books).collect(toSet());

        if (distinctBooks.size() == number_of_books) {
            return number_of_books * PRICE_OF_ONE_BOOK * discounts[number_of_books];
        }
        else {
            if (number_of_books - distinctBooks.size() == 1 ) {
                return PRICE_OF_ONE_BOOK * distinctBooks.size() * discounts[distinctBooks.size()] + PRICE_OF_ONE_BOOK;
            }
            if (number_of_books == 4 && distinctBooks.size() == 2 ) {
                return PRICE_OF_ONE_BOOK * distinctBooks.size() * discounts[distinctBooks.size()] + 2*PRICE_OF_ONE_BOOK;
            }

        }

        return number_of_books * PRICE_OF_ONE_BOOK;
    }
}
