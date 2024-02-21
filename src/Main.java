import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int select, select2, durum = 0;
        String currentUserName, userName, currentPassword, password, newPassword;
        List<String> allUsername = new ArrayList<String>();
        List<String> allPassword = new ArrayList<String>();

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        while (durum == 0) {
            System.out.println("1-Kayıt Ol\n2-Giris Yap\n3-Kapat");
            select = input.nextInt();

            if (select == 1) {
                //Kullanıcıdan bilgi alınması
                System.out.print("Kullanıcı Adınız : ");
                currentUserName = input.next();
                allUsername.add(currentUserName);

                System.out.print("Şifre Giriniz : ");
                currentPassword = input.next();
                allPassword.add(currentPassword);

            } else if(select == 2){
                System.out.print("Kullanıcı Adınız : ");
                userName = input.next();

                for(String user:allUsername){
                    if(Objects.equals(userName, user)){
                        System.out.print("Şifreniz : ");
                        password = input.next();

                        //İlgili kullanıcının şifresinin kontrolünün yapıldığı bölüm
                        String getPassword = allPassword.get(allUsername.indexOf(user));
                        if(Objects.equals(password, getPassword)){
                            System.out.println("Giriş Yapıldı");
                            System.out.println("Hoşgeldiniz: " + user);
                            durum = -1;
                        }else{
                            System.out.println("Parola Hatalı");
                            //Şifre hatalı ise yeniden seçenek oluşturulan bölüm
                            System.out.println("1-Şifremi Unuttum\n2-Çıkış Yap");
                            select2 = input.nextInt();

                            if(select2 == 2){
                                System.out.println("Çıkış yapıldı.");
                                durum = -1;
                            }else{
                                //Yeni şifre oluşturulan bölüm
                                System.out.print("Kullanıcı Adınız : ");
                                userName = input.next();
                                if(Objects.equals(userName, user)){
                                    System.out.print("Yeni Şifreniz : ");
                                    newPassword = input.next();
                                    int getIndex = allUsername.indexOf(user);
                                    allPassword.set(getIndex, newPassword);
                                    System.out.println("Şifreniz değiştirildi.");
                                }

                            }

                        }

                    }else{
                        System.out.println("Kullanıcı bulunamamıştır.");
                    }
                }
            }else if (select == 3) {
                System.out.println("Sistem kapatıldı.");
                durum = -1;
            }
        }


    }
}