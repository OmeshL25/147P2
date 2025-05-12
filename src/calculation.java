//calculates total as a class
public class calculation {
    private double total;
    private static final double taxRate=0.05;
    /** Calculate total, while using this for requirement
     * @param  double for price
     * */
    public calculation(){
        this.total=0.0;
    }
    public void addItem(double price){
        total+=price;
    }
    public double calculateTotal(){
        return total+(total*taxRate);
    }
    public double calculateTotal(double tip){
        return tip+total+(total*taxRate);
    }


}
