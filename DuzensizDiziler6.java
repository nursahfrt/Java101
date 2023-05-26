package Diziler6;

public class DuzensizDiziler6 {

    //Farklı sütun değerine sahip dizilere "Ragged Arrays" yani düzensiz diziler denir.
    // Başka bir açıdan bakıldığında ise, 2 boyutlu dizileri, dizilerin dizisi (array of arrays) olarak düşünmek doğru olur. Yani iki boyutlu dizileri tek boyutlu diziler oluşturur.
    //Diziler aynı türden elemanlardan oluşmak zorundadır.
    //int türünde bir dizi olabileceği gibi, dizinin dizisi de olabilir.
    //Yukarıdaki örneklerde matrisin sütun sayısını 4 olarak belirledik.
    // Bu şekilde oluşturulursa matrisin bütün satırları 4 elemanlı olur.
    // Fakat bu zorunlu değildir.
    // Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir.
    // Örneğin aşağıdaki kodu inceleyelim:

    //int[][] matrix = new int[3][];
    //matrix[0] = new int[1];
    //matrix[1] = new int[2];
    //matrix[2] = new int[3];

    //Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı vermedik.
    // Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.
    //Çok boyutlu dizi oluştururken, yalnızca ilk boyutun (en soldaki) kapasitesini belirlemeniz yeterlidir.
    // Diğer boyutların kapasitesini dinamik olarak belirleyebilirsiniz.
}
