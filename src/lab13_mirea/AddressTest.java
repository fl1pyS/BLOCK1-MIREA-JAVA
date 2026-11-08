package lab13_mirea;

public class AddressTest {
    public static void main(String[] args) {
        String[] commaAddresses = {
                "Россия, Московская область, Химки, Молодёжная, 10, 1, 25",
                "Россия, Татарстан, Казань, Баумана, 15, 2, 30",
                "Россия, Свердловская область, Екатеринбург, Мира, 20, , 45",
                "Россия, Новосибирская область, Новосибирск, Советская, 5, 3, 12"
        };
        String[] mixedAddresses = {
                "Россия; Московская область. Химки, Молодёжная; 10. 1, 25",
                "Россия. Татарстан; Казань, Баумана. 15; 2, 30",
                "Россия, Свердловская область; Екатеринбург. Мира, 20;;45",
                "Россия; Новосибирская область, Новосибирск. Советская; 5, 3. 12"
        };
        for (int i = 0; i < commaAddresses.length; i++) {
            Address first = new Address();
            first.parseWithSplit(commaAddresses[i]);
            System.out.println("\nЧерез split:");
            System.out.println(first);
            Address second = new Address();
            second.parseWithTokenizer(mixedAddresses[i]);
            System.out.println("\nЧерез StringTokenizer:");
            System.out.println(second);
        }
    }
}
