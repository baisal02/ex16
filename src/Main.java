import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal[] animals = {shark, turtle, eagle};
        Shark[] sharks = new Shark[5];   //         ||
        Turtle[] turtles = new Turtle[5];//         ||
        Eagle[] eagles = new Eagle[5]; //           ||
        for (Animal animal :           //          \  /
                animals) {             //           \/    zhon ele koshup koidum, koshpoi koiso da bolot
            if (animal instanceof Shark && animal.getClass().equals(Shark.class)) {
                shark.attack();
            } else if (animal instanceof Turtle && animal.getClass().equals(Turtle.class)) {
                turtle.swim();
            } else if (animal instanceof Eagle && animal.getClass().equals(Eagle.class)) {
                eagle.fly();
            }
        }
        int k = 0;
        int t = 0;
        int y = 0;
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            if (a instanceof Shark) {
                sharks[k] = (Shark) a;
                k++;
            }
            if (a instanceof Turtle) {
                turtles[t] = (Turtle) a;
                t++;
            }
            if (a instanceof Eagle) {
                eagles[y] = (Eagle) a;
                y++;
            }
        }
    }
}