public class Main {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        
       
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(k + " x " + i + " = " + k * i);
        // }

        JUET student = new JUET();
        student.setName("Dhruv");
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
    
    
    static class JUET {
        String name;
        int age;

        
        public void setName(String name) {
            this.name = name;
        }

    
        public String getName() {
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }


        public int getAge() {
            return age;
        }
    }
}
