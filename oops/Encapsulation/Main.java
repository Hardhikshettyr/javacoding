class Student{
    private int marks;

    public void setmarks(int marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Inavlid Marks");
        }
    }
    public int getmarks(){
        return marks;
    }
}

public class Main{
    public static void main(String[] args) {
        Student student=new Student();
        student.setmarks(180);
        System.out.println(student.getmarks());
    }
}