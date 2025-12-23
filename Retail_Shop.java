class Retail_Shop{
    public static void main(String[] args){
        double price;
        int itema=200, itemb=75, itemc=500;
        price = ((itema*2)+(itemb)+(itemc*3));
        price = price-(.1*price);
        price = price + (0.05*price);
        System.out.println(price);
    }
}
         