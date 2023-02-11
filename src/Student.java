public class Student extends Person {
   //Déclarer les variables don j'aurai besoin
   private String classe;  //La classe de l'élève
   private String level;//Le niveau de l'élève
   public static int numberOfStudents = 0;
   public static int nS6A=0, nS6B=0, nS6C=0, nS6D=0, nS5A=0, nS5B=0, nS5C=0, nS5D=0;
   public static int nS4A=0, nS4B=0, nS4C=0, nS4D=0, nS3A=0, nS3B=0, nS3C=0;
   //Dans le constructeur, nous allons faire hériter

   public Student() {
      super();
      numberOfStudents++;
   }
   //Constructeur d'instance
   public Student(String name, String firstName, int age, String profession, String classe,
                  String level){
      super(name, firstName, age, profession);
      this.classe = classe;
      this.level = level;
      numberOfStudents++;//this();
   }
   //Accesseurs et mutateurs de l'élève

   public String getClasse() {return classe;}
   public void setClasse(String classe) {this.classe = classe;}
   public String getLevel() {return level;}
   public void setLevel(String level) {this.level = level;}
   //We are going to create a method which counts the number of students by class
   /*public int CounterOfStudentsByClass(Student student){
      while (this.classe == "6A")
         nS6A++;
      while (this.classe == "6B")
         nS6B++;
      while (this.classe == "6C")
         nS6C++;
      while (this.classe == "6D")
         nS6D++;
      while (this.classe == "5A")
         nS5A++;
      while (this.classe == "5B")
         nS5B++;
      while (this.classe == "5C")
         nS5C++;
      while (this.classe == "5D")
         nS5D++;
      while (this.classe == "4A")
         nS4A++;
      while (this.classe == "4B")
         nS4B++;
      while (this.classe == "4C")
         nS4C++;
      while (this.classe == "4D")
         nS4D++;
      while (this.classe == "3A")
         nS3A++;
      while (this.classe == "3B")
         nS3B++;
      while (this.classe == "3C")
         nS3C++;
      return student.CounterOfStudentsByClass(student);
   }*/
   @Override
   public String toString(){
      return super.toString()+" en classe de "+this.classe;
   }
}
