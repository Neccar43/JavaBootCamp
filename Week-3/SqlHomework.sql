
select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers;
Select * from Customers where City = 'London'--Customer tablosundan City si London olanları ver
select * from Products where CategoryID=1 or CategoryID=3 --1 veya 3 kategorisindeki ürünleri getirir
select * from Products where CategoryID=1 and Price>=15-- kategori 1 i ve fiyatı 15 ten büyük eşit olanları getir
select * from Products order by ProductName --ProductName kolonunu alfabetik olarak sırala
select * from Products order by Price asc --ascending düşükten yükseğe sırala
select * from Products order by Price desc --descending yüksekten düşüğe
select * from Products where CategoryID=1 order by Price desc--katagori 1 dekilerin fiyatını yüksekten düşüğe sırala
select count(*)from Products--toplam satır yani ürün sayısını verir
select count(*)from Products where CategoryID=1--kategori 1 deki ürün sayısı
select CategoryID ,count(*) from Products group by CategoryID-- CategoryID ye göre guruplandırıp herbir kategori için sayım yaptırıyoruz
select CategoryID ,count(*) from Products group by CategoryID having count(*)<10--10 dan daha az ürün olan kategorileri göster
select CategoryID ,count(*) from Products where Price>20 group by CategoryID having count(*)<10--fiyatı 20 den küçük olan kategorileri gurupla ve ürün sayısını ver(önce where çalışırve having i count(*) gibi kümülatif guruplara uygularız) 
select Products.ProductID,Products.ProductName,Products.Price,Categories.CategoryName from Products inner join Categories on Products.CategoryID==Categories.CategoryID where Products.Price>10
select * from Products p left join OrderDetails od on p.ProductID=od.ProductID-- left komutu solda olup sağda olmayanlarıda getir demek 
​
Select * from Customers left join Orders o on Customers.CustomerID = O. CustomerID where O. CustomerID is null--sipariş vermeyen müşterileri bulmamızı sağladı