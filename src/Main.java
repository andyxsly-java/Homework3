public class Main {
    public static void main(String[] args) {
        //Задание 1

        int one = 100000;
        byte two = 1;
        short three = 1000;
        long four = 100000000;
        float five = 1.5f;
        double six = 8.5;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

        //Задание 2

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.789f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //Задание 3

        byte ludPavl = 23;
        byte annSerg = 27;
        byte kateAndr = 30;
        short totalSheets = 480;
        int everyStudent = totalSheets / (ludPavl + annSerg + kateAndr);
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");

        //Задание 4

        byte perfOneMinute = 16 / 2;
        short minutesInDay = 24 * 60;
        int perfTwentyMinute = perfOneMinute * 20;
        int perfDay = perfOneMinute * minutesInDay;
        int perfThreeDays = perfOneMinute * (minutesInDay * 3);
        int perfOneMonth = perfOneMinute * (minutesInDay * 30);
        System.out.println("За 20 минут машина произвела " + perfTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + perfDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + perfThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + perfOneMonth + " штук бутылок");

        //Задание 5

        byte totalCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        byte oneClass = 2 + 4;
        int totalClass = totalCans / oneClass;
        int totalWhiteCans = totalClass * whiteCans;
        int totalBrownCans = totalClass * brownCans;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans +  " банок коричневой краски");

        // Задание 6

        short gramsBananas = 5 * 80;
        short gramsMilk = 105 * 2;
        short gramsIcecream = 100 * 2;
        short gramsEggs = 4 * 70;
        int totalGrams = gramsBananas + gramsMilk + gramsIcecream + gramsEggs;
        float weightsKilo = totalGrams / 1000f;
        System.out.println(totalGrams);
        System.out.println(weightsKilo);

        //Задание 7

        int target = 7 * 1000;
        int loseWeight1 = target / 250;
        int loseWeight2 = target / 500;
        int averageValue = (loseWeight1 + loseWeight2) / 2 ;
        System.out.println(loseWeight1);
        System.out.println(loseWeight2);
        System.out.println(averageValue);

        //Задание 8

        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float increaseM = (67760 / 100f) * 10;
        float increaseD = (83690 / 100f) * 10;
        float increaseK = (76230 / 100f) * 10;
        float totalSalaryM = salaryM + increaseM;
        float totalSalaryD = salaryD + increaseD;
        float totalSalaryK = salaryK + increaseK;
        int annualIncomeM = 67760 * 12;
        int annualIncomeD = 83690 * 12;
        int annualIncomeK = 76230 * 12;
        float yearsIncreaseM = totalSalaryM * 12;
        float yearsIncreaseD = totalSalaryD * 12;
        float yearsIncreaseK = totalSalaryK * 12;
        float differenceM = yearsIncreaseM - annualIncomeM;
        float differenceD = yearsIncreaseD - annualIncomeD;
        float differenceK = yearsIncreaseK - annualIncomeK;
        System.out.println("Маша теперь получает " + totalSalaryM + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + totalSalaryD + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + totalSalaryK + " рублей. Годовой доход вырос на " + differenceK + " рублей");






    }
}