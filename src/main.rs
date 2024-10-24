extern crate num;

use bigdecimal::BigDecimal;
use num::BigInt;
use promptput::input;

fn format_scientific(number: BigInt) -> String {
    if number < BigInt::from(1000) {
        return number.to_string();
    }

    let number_decimal: BigDecimal = BigDecimal::from(number);
    format!("{:.2E}", number_decimal)
}

fn main() {
    let user_input: i32 = input("Number:");

    let mut first: BigInt = BigInt::from(1);
    let mut second: BigInt = BigInt::from(1);
    let mut third: BigInt;

    let mut counter: i32 = 1;

    while counter <= user_input {
        println!("{counter}");

        third = first + second.clone();
        first = second;
        second = third;

        counter += 1;
    }

    println!("\nfib({}): {}\n", user_input, format_scientific(first));
}
