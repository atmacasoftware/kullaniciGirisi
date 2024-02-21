# Kullanıcı Girişi

Java dilinde kayıt yapılması ve kullanıcı girişinin yapılması işlemleri yapılmıştır.

Yapılan işlemler;
* `int select, select2, durum = 0;` int türünde değişkenler oluşturulmuştur.
* `String currentUserName, userName, currentPassword, password, newPassword;` String türünde değişkenler oluşturulmuştur.
* Yapılan hem username hemde password kayıtlarının tutulması için List türünde 2 adet boş liste oluşturulmuştur.
* Kullanıcılara 3 seçenek sunulmaktadır. 1-Kayıt Ol, 2-Giriş Yap, 3-Çıkış Yap
* Kullanıcı ekrana 1 yazar ise önce kullanıcı adını yazınca kullanıcıların tutulduğu listeye aktarılacak, daha sonra şifre yazınca şifrelerin tutulduğu listeye aktarılacaktır.
* Akabinde bir üste belirtilen 3 seçenek tekrar çıkmaktadır.
* Kullanıcı ekrana 2 yazar ise önce giriş yapacağı kullanıcı adını yazacaktır. Eğer liste içerisinde kullanıcı adı mevcut ise daha sonra şifresini isteyecektir. Kullanıcı adı listede yok ise tekrar başa dönecektir.
* Kullanıcı şifresini yanlış yazar ise 1-Şifremi unuttum, 2-Çıkış yap seçenekleri karşısına çıkacaktır. 
* Kullanıcı ekrana 1 uazar ise önce kullanıcı adını yazacak ve listede kullanıcının mevcut olup olmadığı sorgulandıktan sonra eğer kullanıcı mevcut ise yeni şifresini isteyecektir. Kullanıcının yeni yazdığı şifre eski şifresi ile değiştirilip başlangıç ekranına tekrar geri dönüp yeniden giriş yapması gerecektir.
