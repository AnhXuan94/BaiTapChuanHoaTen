public class Main {
    public static void main(String[] args) {
        // Dữ liệu đầu vào cần kiểm tra
        String input = "  nguyEN   van  a  ";

        // Gọi hàm chuẩn hóa từ lớp ChuanHoaTen
        String output = ChuanHoaTen.chuanHoaTen(input);

        System.out.println("Ket qua: " + output);
    }
}