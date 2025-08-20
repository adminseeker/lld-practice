public class Laptop {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;
    private final String os;

    public Laptop(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.graphicsCard=builder.graphicsCard;
        this.os=builder.os;
    }
    
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Laptop {" +
            "CPU='" + cpu + '\'' +
            ", RAM='" + ram + '\'' +
            ", Storage='" + storage + '\'' +
            ", GraphicsCard='" + graphicsCard + '\'' +
            ", OS='" + os + '\'' +
            '}';
    }

    public static class Builder{
        private String cpu="Intel i5";
        private String ram="8 GB";
        private String storage="256 GB";
        private String graphicsCard="Integrated Graphics";
        private String os="Windows 11";

        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder ram(String ram){
            this.ram=ram;
            return this;
        }

        public Builder storage(String storage){
            this.storage=storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard){
            this.graphicsCard=graphicsCard;
            return this;
        }

        public Builder os(String os){
            this.os=os;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);
        }

    }
}
