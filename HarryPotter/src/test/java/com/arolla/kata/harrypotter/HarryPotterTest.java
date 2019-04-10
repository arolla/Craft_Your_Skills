package com.arolla.kata.harrypotter;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;
import org.junit.Test;

public class HarryPotterTest {

    @Rule
    public JUnitSoftAssertions should = new JUnitSoftAssertions();

    private HarryPotterDiscount harryPotterDiscount = new HarryPotterDiscount();
    private final double PRICE_OF_ONE_BOOK = 8.00;
    private final double DISCOUNT_FOR_TWO_DISTINCT_BOOKS = 0.95;
    private final double DISCOUNT_FOR_THREE_DISTINCT_BOOKS = 0.90;
    private final double DISCOUNT_FOR_FOUR_DISTINCT_BOOKS = 0.80;
    private final double DISCOUNT_FOR_FIVE_DISTINCT_BOOKS = 0.75;

    @Test
    public void a_single_book_is_8_pounds() {
        should.assertThat(harryPotterDiscount.calculatePrice("1")).isEqualTo(PRICE_OF_ONE_BOOK);
        should.assertThat(harryPotterDiscount.calculatePrice("2")).isEqualTo(PRICE_OF_ONE_BOOK);
        should.assertThat(harryPotterDiscount.calculatePrice("3")).isEqualTo(PRICE_OF_ONE_BOOK);
        should.assertThat(harryPotterDiscount.calculatePrice("4")).isEqualTo(PRICE_OF_ONE_BOOK);
        should.assertThat(harryPotterDiscount.calculatePrice("5")).isEqualTo(PRICE_OF_ONE_BOOK);
    }

    @Test
    public void same_books_get_no_discount() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "1")).isEqualTo(PRICE_OF_ONE_BOOK * 2);
        should.assertThat(harryPotterDiscount.calculatePrice("5", "5")).isEqualTo(PRICE_OF_ONE_BOOK * 2);
        should.assertThat(harryPotterDiscount.calculatePrice("5", "5", "5")).isEqualTo(PRICE_OF_ONE_BOOK * 3);
        should.assertThat(harryPotterDiscount.calculatePrice("5", "5", "5", "5")).isEqualTo(PRICE_OF_ONE_BOOK * 4);
        should.assertThat(harryPotterDiscount.calculatePrice("5", "5", "5", "5", "5")).isEqualTo(PRICE_OF_ONE_BOOK * 5);
    }

    @Test
    public void two_different_books_get_discount() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "2"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 2 * DISCOUNT_FOR_TWO_DISTINCT_BOOKS);
    }

    @Test
    public void three_different_books_get_discount() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "2", "3"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 3 * DISCOUNT_FOR_THREE_DISTINCT_BOOKS);
    }

    @Test
    public void four_different_books_get_discount() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "2", "3", "4"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 4 * DISCOUNT_FOR_FOUR_DISTINCT_BOOKS);
    }

    @Test
    public void five_different_books_get_discount() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "2", "3", "4", "5"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 5 * DISCOUNT_FOR_FIVE_DISTINCT_BOOKS);
    }

    @Test
    public void three_books_with_one_doublon() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "3", "3"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 2 * DISCOUNT_FOR_TWO_DISTINCT_BOOKS + PRICE_OF_ONE_BOOK);
    }
    @Test
    public void four_books_with_one_doublon() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "3", "3", "2"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 3 * DISCOUNT_FOR_THREE_DISTINCT_BOOKS + PRICE_OF_ONE_BOOK);
    }

    @Test
    public void five_books_with_one_doublon() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "3", "3", "2", "4"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 4 * DISCOUNT_FOR_FOUR_DISTINCT_BOOKS + PRICE_OF_ONE_BOOK);
    }

    @Test
    public void four_books_with_one_triplon() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "3", "3", "3"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 2 * DISCOUNT_FOR_TWO_DISTINCT_BOOKS +  2*PRICE_OF_ONE_BOOK);
    }

    @Test
    public void four_books_with_two_doublon() {
        should.assertThat(harryPotterDiscount.calculatePrice("1", "3", "1", "3"))
                .isEqualTo(PRICE_OF_ONE_BOOK * 2 * DISCOUNT_FOR_TWO_DISTINCT_BOOKS * 2);
    }

}
