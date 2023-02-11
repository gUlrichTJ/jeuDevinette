public class MainGestionNotes {
   public static void main(String[]args){
      Student student = new Student("MATHEY-APOSSAN", "Maté Ulrich Graciano",
            10, "élève", "5A", "5ème");
      Teacher teacher = new Teacher("M. GBEGLO", "Komi Dapa", 50,
            "Enseignant", "SVT");
      //System.out.println(student.CounterOfStudentsByClass(student));
      System.out.println(student);
      System.out.println(teacher);
      System.out.println("We have "+student.numberOfStudents+" students");
   }
}
