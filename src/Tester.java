public class Tester {

    public static void main (String [] args){
        Student s1 = new Student();
        s1.setName("Irene");
        s1.setAge(44);
        s1.setStudentNum(524921798);
        s1.setSchoolName("DeVry");
        s1.setStatus(true);

        System.out.println("Name:" +s1.getName() + "\n" + "Age:" + s1.getAge() + "\n" + "Student number:" + s1.getStudentNum() + "\n" + "School name:" + s1.getSchoolName() + "\n" + "Status:" + s1.getStatus());

    }
}
