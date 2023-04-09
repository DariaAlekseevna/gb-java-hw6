package hw.hw6;

public class laptop {

    String color;
    Integer RAM;
    String OS;
    Integer HDD;
    Integer id;
    String brand;
    Integer price;

    public laptop(Integer id, String brand, Integer price){
        this.brand = brand;
        this.id = id;
        this.price = price;
        System.out.println("Ноутбук "+ this.brand + " id " + Integer.toString(this.id));
    }
    public String getColor(){
        return this.color;
    }
    public Integer getRAM(){
        return this.RAM;
    }
    public String getOS(){
        return this.OS;
    }
    public Integer getHDD(){
        return this.HDD;
    }
    public Integer getid(){
        return this.id;
    }
    public String getBrand(){
        return this.brand;
    }
    public Integer getPrice(){
        return this.price;
    }
    public void setColor(String color){
        this.color =color;
    }
    public void setRAM(Integer RAM){
        this.RAM = RAM;
    }
    public void setOS(String OS){
        this.OS = OS;
    }
    public void setHDD(Integer HDD){
        this.HDD = HDD;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.id);
        sb.append(" ");
        sb.append(this.brand);
        sb.append(System.lineSeparator());
        sb.append("Color " + this.color);
        sb.append(System.lineSeparator());
        sb.append("OS " + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.RAM);
        sb.append(System.lineSeparator()); 
        sb.append("Цена: " + this.price);     
        return(sb.toString());
    }
}
