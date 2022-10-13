package interfaces;

public class CustomerManager {
    ICustomerDal ıCustomerDal;

    public CustomerManager(ICustomerDal ıCustomerDal) {
        this.ıCustomerDal= ıCustomerDal;
    }

    // iş kodları
    public void add() {
        ıCustomerDal.add();
    }

}
