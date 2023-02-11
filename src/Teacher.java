public class Teacher extends Person {
   private String matter;    //Matière enseignée par l'enseignant
   public static int numberOfTeachers = 0;

   //Constructeur hérité
   public Teacher() {
      super();
      numberOfTeachers++;
   }
   //Constructor d'instanciation
   public Teacher(String name, String firstName, int age,
                  String profession, String matter){
      super(name, firstName, age, profession);
      this.matter = matter;
      numberOfTeachers++;
   }
   public String getMatter(){return matter;}
   public void setMatter(String matter){this.matter = matter;}
   @Override
   public String toString(){
      return super.toString()+" de "+this.matter+" au CEG Adétikopé";
   }
}
