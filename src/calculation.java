//calculates total as a class
public class calculation {
    private double total;
    private static final double taxRate=0.05;
    /** Calculate total, while using this for requirement
     * @param  double for price
     * */
    public calculation(double price){
        this.total=0.0;
        total+=price;
    }
    public double calculateTotal(){
        return total+(total*taxRate);
    }
    public double calculateTotal(double tip){
        return tip+total+(total*taxRate);
    }


}
