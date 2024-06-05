package com.ohgiraffers.section02;



import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {

    public static void main(String[] args) {

        // Supplier
        /* Supplier<T>#get() : T : 객체 T를 리턴*/
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();

        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);


        BooleanSupplier booleanSupplier = () -> {

            int random = (int) (Math.random() * 2);
            return random == 0? false : true;

        };

        System.out.println("랜덤 true or false" + booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt() : int : int값을 리턴한다. */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) +1;
        System.out.println("1~6까지의 수 랜덤 = " + intSupplier.getAsInt());

        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 = " + doubleSupplier.getAsDouble());

        LongSupplier longSupplier = () -> new java.util.Date().getTime();

        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 = " + longSupplier.getAsLong());



    }

    public int num() {
        return 10;

    }


}
