public class fungsi {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 5}
        };

        int[] harga = {75000, 50000, 60000, 10000};
        int[] pengurangan = {1, 2, 0, 5};

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + " adalah: " + pendapatan);
        }

        System.out.println("\nStock RoyalGarden 4 sebelum pengurangan:");
        tampilkanStock(stock[3]);

        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] -= pengurangan[i];
        }

        System.out.println("\nStock RoyalGarden 4 setelah pengurangan:");
        tampilkanStock(stock[3]);
    }

    public static void tampilkanStock(int[] stock) {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stock.length; i++) {
            System.out.println(jenisBunga[i] + ": " + stock[i]);
        }
    }
}
