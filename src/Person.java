public class Person {
   protected String name;
   protected String firstName;
   protected int age;
   protected String profession;
   protected static int numberOfClass6e = 4;
   protected static int numberOfClass5e = 4;
   protected static int numberOfClass4e = 4;
   protected static int numberOfClass3e = 3;
   protected static int nombreTotalClasses = numberOfClass3e+numberOfClass4e+
         numberOfClass5e+numberOfClass6e;
   protected static int EffectifTotal= 0;
   //Constructeur par défaut
   public Person() {EffectifTotal++;}
   //Constructeur d'initialisation
   public Person(String name, String firstName, int age, String profession){
      this();
      this.name = name;
      this.firstName = firstName;
      this.age = age;
      this.profession = profession;
   }
   //Accesseurs et mutateurs
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getProfession() {return profession;}
   public void setProfession(String profession) {this.profession = profession;}
   @Override
   public String toString(){
      return "\nJe suis "+this.name+" "+this.firstName+", j'ai "+this.age+" ans, "+
            this.profession;
   }
}
