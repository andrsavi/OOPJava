package po83.savinov.oop.model;

public class Test {
    public static void main(String[] args) {
        lab1tests();
    }

    public static void lab1tests() {

        Workout workout1 = new Workout(8);
        Exercise firstEx = new Exercise("Bobs", 5);
        Exercise secondEx = new Exercise("Run", 10);
        Exercise thirdEx = new Exercise("Chin-ups", 15);
        Exercise fourEx = new Exercise("Swimming", 10);
        Exercise fiveEx = new Exercise("Dumbbells", 7);


        workout1.addExercise(firstEx);
        workout1.addExercise(secondEx);
        workout1.addExercise(thirdEx);
        workout1.addExercise(fourEx);
        workout1.addExercise(fiveEx);
        //System.out.println(workout1.durationTotal());
        //System.out.println(workout1.hasExercise("Run"));
        //System.out.println(workout1.getExercise(4));

    }
}
