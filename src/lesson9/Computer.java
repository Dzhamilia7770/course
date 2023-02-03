package lesson9;

class Main {
    static Computer[] comp = new Computer[5];

    public static void main(String[] args) {
        comp[0] = new Computer("1");
        comp[1] = new Computer("2");
        comp[2] = new Computer("3");
        comp[3] = new Computer("4");
        comp[4] = new Computer("5");

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].toString());
        }
    }
}

class Computer {
    String numberOfComp;

    public Computer(String numberOfComp) {
        this.numberOfComp = numberOfComp;
    }

    @Override
    public String toString() {
        return "Hello, I am a Computer. My number is:  " +
                numberOfComp;
    }
}
