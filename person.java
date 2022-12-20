public abstract class person {
    public String name;
    public float height;
    private int age;

    public person(String name, float height, int age){
        this.name = name + " Tran";
        this.height = height;
        this.age = age;
    }

    public void setAge(int age){
        if (age>=0 && age<=100){
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void getInfo(){
        System.out.print("Name: " +this.name);
        System.out.print("Age: " +this.age);
        System.out.println("Height: " +this.height);
    }

    public person getInstance(){
            return this;
    }
}
    
interface IStudy{
    void study();
}

interface ISpeak{
    void speak();
}