public class MoyaBorba {
    public static class Igor {
        public String name = "Igor";
        public int health = 100;
        public boolean isIgorAlive = true;
        public int kickpower = 40;

    }

    public static class Shura {
        public String name = "Shura";
        public int health = 100;
        public boolean isShuraAlive = true;
        public int kickpower = 30;
    }
    public static class Fight {
        public static void main(String[] args) {
            Igor igor = new Igor();
            Shura shura = new Shura();
            fight(igor,shura);
        }

        public static void fight(Igor igor, Shura shura) {
            while(true) {
                if(!igor.isIgorAlive && shura.isShuraAlive) {
                    System.out.println("Игорь мертв. Шура победила");
                    break;
                } else if (igor.isIgorAlive && !shura.isShuraAlive) {
                    System.out.println("Шура мертв. Игорь победил");
                    break;
                }
                if(igor.health<0) {
                    igor.isIgorAlive = false;
                } else {
                    igor.health-= shura.kickpower;
                }
                if(shura.health<0) {
                    shura.isShuraAlive = false;
                } else {
                    shura.health-= igor.kickpower;
                }
            }
    }
}

}
