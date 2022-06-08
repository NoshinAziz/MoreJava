public class Teacher {
    private String name;
    private String subject;
    private int student;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setStudent(int s){
        this.student=s;
    }
    public int getStudent(){
        return student;
    }

    public static void main(String[] args) {
        Teacher tecInfo= new Teacher();
        tecInfo.setName("Sana");
        tecInfo.getName();
        tecInfo.setSubject("QA");
        tecInfo.getStudent();
        tecInfo.setStudent(14);
        tecInfo.getStudent();

        System.out.println("Teacher name is :"+ tecInfo.getName());
        System.out.println("Subject is :"+ tecInfo.getSubject());
        System.out.println("Number of student :"+ tecInfo.getStudent());
    }

}
