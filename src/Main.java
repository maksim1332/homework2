public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {                                       //task 1
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println("dog " + "cat " + "paper");
                                                //task 2
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println("dog-" + dog);
            System.out.println("cat-" + cat);
            System.out.println("paper-" + paper);

                                                //task 3
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println("dog "+ dog);
            System.out.println("cat "+ cat);
            System.out.println("paper "+ paper);
        }
        {                                       //task 4
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }
        {                                       //task 5
             var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
        }
        {                                       //task 6
            var boxerOne = 78.2;
            var boxerTwo = 82.7;
            var totalWeight = boxerOne + boxerTwo;
            System.out.println(totalWeight);
            var difference = boxerTwo-boxerOne;
            System.out.println(difference);
        }
        {                                        //task 7
            var boxerOne = 78.2;
            var boxerTwo = 82.7;
            var remains = boxerTwo - boxerOne ;
            System.out.println(remains);
        }
        {                                        //task 8
            var timeWorked = 640;
            var change = 8;
            var staff = timeWorked / change;
            System.out.println("Всего работников в компании " + staff + " человек");
            var totalEmployees = staff + 94;
            var openingHours = totalEmployees * 8;
            System.out.println("Если в компании работает "+totalEmployees+" человек, то всего "+openingHours+" часов работы может быть поделено между сотрудниками.");
        }
    }
}
