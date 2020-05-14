package po83.savinov.oop.model;

public class Exercise {
    private  String name; //название
    private  int duration; //продолжительность
    public  static  final  int dur = 3; //время выполнения - 3 минуты

    Exercise(String name) {
        this.duration = dur;
    }

    Exercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return  name; } //метод, возвращающий название

    public  void setName(String newName) { name = newName; } //метод, устанавливающий новое значение названия

    public  int getDuration() { return  duration; } // метод, возвращающий продолжительность

    public void setDuration(int newDuration) { duration = newDuration; } // метод, возвращающий новое значение продолжительности
}
