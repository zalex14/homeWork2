public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        // Задача 1
        // Объявите переменные типа int, byte, short, long, float, double
            byte amountOranges = 64;
            short amountKiwi = 16412;
            int amountApples = 226420;
            long amountPersimmons = 3642781;
                float distanceFromCar = 2.234f;
                double currentWavenumber = 534.2348314493;
        System.out.println( "Домашнее задание 2. Задача 1" );
        System.out.println( "amountOranges : " + amountOranges );
        System.out.println( "amountKiwi : " + amountKiwi );
        System.out.println( "amountApples : " + amountApples );
        System.out.println( "amountPersimmons : " + amountPersimmons );

        System.out.println( "distanceFromCar : " + distanceFromCar + " miles");
        System.out.println( "currentWavenumber : " + currentWavenumber + " nm"  );

        // Задача 2
        // Инициализируйте переменные, используя изученные ранее типы переменных.
        // 27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67
        // Задания на использование переменных или вывод в консоль Задача 2 не содержит. Добавил формальное использование переменных
            float distanceHome = 27.12f;
            long amountSamples = 987678965549L;
            double distanceSchool = 2.786;

            boolean isChild = false;

            short amountFruits = 569;
            int currentTemperature = -159;
            short amountNails = 27897;
            byte dadAge = 67;

        System.out.println( "Домашнее задание 2. Задача 2" );
        System.out.println( "Значения переменных : " + distanceHome + ", " + amountSamples + ", " + distanceSchool + ", " + isChild + ", " + amountFruits + ", " + currentTemperature + ", " + amountNails + ", " + dadAge );

    // Задача 3
    // Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса
            int studentsLudmilaPavlovna = 23;
            int studentsAnnaSergeevna = 27;
            int studentsEkaterinaAndreevna = 30;
                int totalPapers = 480;
            int papersPerStudent = totalPapers / (studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna);
        System.out.println( "Домашнее задание 2. Задача 3" );
        System.out.println( "На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");

    // Задача 4
    // Производительность машины для изготовления бутылок
    // 1 месяц считаем 30 дней (не 28, не 29, не 31)
            int machinePerformancePerHour = 16 /2 ;    // бутылок в час
        System.out.println( "Домашнее задание 2. Задача 4" );
        System.out.println( "За 20 минут машина произвела бутылок " + (machinePerformancePerHour / 3) + " штук" );
        System.out.println( "За сутки машина произвела бутылок " + (machinePerformancePerHour * 24 ) + " штук" );
        System.out.println( "За 3 дня машина произвела бутылок " + (machinePerformancePerHour * 24 * 3 ) + " штук" );
        System.out.println( "За 1 месяц машина произвела бутылок " + (machinePerformancePerHour * 24 * 30 ) + " штук" );

    // Задача 5
    // ремонт школы
            int tinWhitePaintPerRoom = 2;  // Банок белой краски на аудиторию
            int tinBrownPaintPerRoom = 4;  // Банок коричневой краски на аудиторию
            int totalTinsPurchased = 120;  // Всего банок краски закуплено
            int totalSchoolRoom = totalTinsPurchased / (tinWhitePaintPerRoom + tinBrownPaintPerRoom);   // Аудиторий в школе
        System.out.println( "Домашнее задание 2. Задача 5" );
        System.out.println( "В школе, где " + totalSchoolRoom + " классов, нужно " + ( tinWhitePaintPerRoom * totalSchoolRoom) + " банок белой краски и " + ( tinBrownPaintPerRoom * totalSchoolRoom) + " банок коричневой краски" );

    // Задача 6
    // Подсчитайте вес (количество грамм) спорт-завтрака
            int bananaWeight = 80 ;  // все банана в граммах
            int milkWeight = 105 ;   // вес 100 мл молока в граммах
            int iceCreamWeight =  100 ; // вес брикета в граммах
            int eggWeight = 70 ;    // вес яйца в граммах
            int breakfastWeight = (bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4 );
        System.out.println( "Домашнее задание 2. Задача 6" );
        System.out.println( "Вес (количество грамм) такого спорт-завтрака " + breakfastWeight + ", что составляет  " +  ((float) breakfastWeight / 1000 ) + " килограмм" );

    // Задача 7
    // Cколько дней уйдёт на похудение
            float weightLose = (float) 7 ;    // Задание сбросить вес, кг
            int gramPerKilo = 1000;           // Перевод кг в г
                int lossPlan250 = (int) Math.ceil(weightLose / ((float) 250 / gramPerKilo)) ;       // План тренера 250 г в день
                int lossPlan500 = (int) Math.ceil(weightLose / ((float) 500 / gramPerKilo)) ;       // План тренера 500 г в день
                int averageLossPlan = (int) Math.ceil( (lossPlan250 + lossPlan500) / 2.0 )  ;       // Среднее
        System.out.println( "Домашнее задание 2. Задача 7" );
        System.out.println( "Дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм : " + lossPlan250 );
        System.out.println( "Дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм : " + lossPlan500 );
        System.out.println( "В среднем на похудение уйдет : " + averageLossPlan + " дней");

    // Задача 8
    // Задача автоматизировать повышение зарплаты, два знака после запятой с учетом копеек
        float salaryMasha = (float) 67760;
        float salaryDenis = (float) 83690;
        float salaryCristina = (float) 76230;
            float tenPercentage = (float) 10 / 100;
        System.out.println( "Домашнее задание 2. Задача 8" );
        System.out.println( "Маша теперь получает " + String.format("%.2f", ( salaryMasha + salaryMasha * tenPercentage )) + " рублей. Годовой доход вырос на " + String.format("%.2f", ( salaryMasha * tenPercentage * (float) 12)) + " рублей" );
        System.out.println( "Денис теперь получает " + String.format("%.2f", ( salaryDenis + salaryDenis * tenPercentage )) + " рублей. Годовой доход вырос на " + String.format("%.2f", ( salaryDenis * tenPercentage * (float) 12)) + " рублей" );
        System.out.println( "Кристина теперь получает " + String.format("%.2f", ( salaryCristina + salaryCristina * tenPercentage )) + " рублей. Годовой доход вырос на " + String.format("%.2f", ( salaryCristina * tenPercentage * (float) 12)) + " рублей" );

    }
}