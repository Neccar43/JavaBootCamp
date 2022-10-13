package interfaces;

public interface ICustomerDal {// bir class birden fazla interfaces i implemente edebilir
    void add();
    // intrface metodun imzasını tutar (abstract lara benzer)
    // implement eden sınıf bu metodu barındırmalı ve kendi yazmalıdır (abstract lara benzer)
    //interface ler new lenemezler (abstract lara benzer)
    //interface ler bağımlılıkları azaltmak için yazılım projelerindeki katmalar arasındaki geçişlerde kullanılır
    // bir class birden fazla interface i implement edebilir
}
