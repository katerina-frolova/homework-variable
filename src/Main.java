public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var firstBoxerWeight=78.2;
        System.out.println("Вес первого боксера "+firstBoxerWeight+" кг");
        var secondBoxerWeight=82.7;
        System.out.println("Вес второго боксера "+secondBoxerWeight+" кг");
        var totalWeight=firstBoxerWeight+secondBoxerWeight;
        System.out.println("Общий вес двух бойцов "+totalWeight+" кг");
        var differenceWeight = secondBoxerWeight-firstBoxerWeight;
        System.out.println("Разница между весами бойцов "+differenceWeight+" кг");
        differenceWeight=secondBoxerWeight%firstBoxerWeight;
        System.out.println("Разница между весами бойцов "+differenceWeight+" кг");
        var totalWorkingTime=640;
        var employeeWorkingTime=8;
        var staff=totalWorkingTime/employeeWorkingTime;
        System.out.println("Всего работников в компании - "+staff+" человек");
        staff=staff+94;
        totalWorkingTime=staff*employeeWorkingTime;
        System.out.println("Если в компании работает "+staff+" человека, то всего "+totalWorkingTime+" часа работы может быть поделено между сотрудниками.");
    }
}