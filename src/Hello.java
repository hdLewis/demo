public class Hello {

    public static class Student{
       private String name;
       private int age;
       private char sex;

        public String getName() {
            return name;
        }

        public Student setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Student setAge(int age) {
            this.age = age;
            return this;
        }

        public char getSex() {
            return sex;
        }

        public Student setSex(char sex) {
            this.sex = sex;
            return this;
        }

    }


    public static void main(String[] args) {
       /* System.out.println("hello world!");
        System.out.println("Nice day ");
        System.out.println("A");
        System.out.println("新建分支修改");
        System.out.println("云端修改修改");
        System.out.println("云端第二次修改修改");
        System.out.println("111111");*/
      /*  String str="abdasdfwrgasdfasdfafweadfasdfasd";

       *//* for (int i = 0; i < str.toCharArray().length; i++) {
            System.out.println(str.toCharArray()[i]);
        }*//*
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }*/

        Student student=new Student().setName("hahaha").setAge(12).setSex('男');
        System.out.println(student);

    }
}
