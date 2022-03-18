public class Student {

    //name
    //age
    //student number
    //school name

    //getter and setter methods for the above

    private String name;
    private int age;
    private int studentNum;
    private String schoolName;
    private boolean status;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge (){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }


    public int getStudentNum(){
        return studentNum;
    }

    public void setStudentNum(int newNum){
        studentNum = newNum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String newSName){
        schoolName = newSName;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean newStatus){
        status = newStatus;
    }
}
