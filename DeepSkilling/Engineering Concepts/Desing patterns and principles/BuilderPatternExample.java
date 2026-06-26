class Computer{
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.graphicsCard =builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer[ CPU: "+ cpu+" RAM: "+ram+" Storage: "+storage+" GraphicsCard: "+graphicsCard+"]";
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;

        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder RAM(String RAM){
            this.ram = RAM;
            return this;
        }

        public Builder storage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard){
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}

public class builderPatternExample {
    public static void main(String[] args){
        Computer com = new Computer.Builder()
                                .cpu("Intel Core i9")
                                .RAM("16GB")
                                .storage("2 TB")
                                .graphicsCard("NVIDIA RTX 4090")
                                .build();

        System.out.println(com.toString());

        Computer com2 = new Computer.Builder()
                .cpu("Intel Core i5")
                .RAM("16GB")
                .storage("512 GB")
                .build();

        System.out.println(com2.toString());
    }
}


/*
OUTPUT:
Computer[ CPU: Intel Core i9 RAM: 16GB Storage: 2 TB GraphicsCard: NVIDIA RTX 4090]
Computer[ CPU: Intel Core i5 RAM: 16GB Storage: 512 GB GraphicsCard: null]
*/

