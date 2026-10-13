    void main(String[] args) {

        int a = 1729;
        // a　はお釣りを計算したい数値

        int b = 500;
        int c = 100;
        int d = 50;
        int e = 10;
        int f = 5;
        int g = 1;

        IO.println("500　" + (a / b) +"枚");

        System.out.println("100　" + ((a - (b * (a / b))) / c +"枚"));

        System.out.println("50　" + (((a - b - ((a - b) / c ) * c ) / d )) +"枚");

        System.out.println("10　" + ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) -
                                      (d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d))) / e) +"枚");

        System.out.println("5　" + ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) -
                ((d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d))) -
                (e * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) - (d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d))) / e)))) / f +"枚");

        System.out.println("1　" + ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) -
                (d * ((a - b - ((a - b) / c ) * c ) / d )) -
                (e * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) - (d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d))) / e)) -
                (f * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) - (d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d)) -
                        (e * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c)) - (d * ((a - (b * (a / b)) - (c * ((a - (b * (a / b))) / c))) / d))) / e))) / f))) / g) + "枚");


}