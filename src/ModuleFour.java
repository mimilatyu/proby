
public class ModuleFour {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("iphone11", false, 64);

        phone2.phoneInfo();
    }

    public static class Phone {
        private String name;  //модель телефона
        private boolean oSystem; // операционная система (андроид(true) или ios(false))
        private int memory; // объем памяти

        public Phone(String name, boolean oSystem, int memory) {
            this.name = name;
            this.oSystem = oSystem;
            this.memory = memory;
        } // создали конструктор вызываемый в том случае, если нам известны данные о телефоне

        public Phone() {
            this("noname", true , 0);
        } // создали конструктор по умолчанию

        void phoneInfo() {
            StringBuilder str = new StringBuilder("Телефон: " + name);
            if (oSystem == true) {
                str.append("\n" + "Операционная система: Android");
            } else str.append("\n" + "Операционная система: iOs");
            str.append("\n" + "Объем памяти: " + memory);
            System.out.println(str);
        }

    }





}
