public class ChuanHoaTen {

    // Xóa khoảng trắng thừa đầu cuối và ở giữa các từ.
    // Viết hoa chữ cái đầu mỗi từ, viết thường các chữ còn lại.

    public static String chuanHoaTen(String s) {
        // Kiểm tra chuỗi rỗng hoặc null
        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        // Loại bỏ khoảng trắng thừa và gom về 1 dấu cách
        s = s.trim().replaceAll("\\s+", " ");

        // Tách chuỗi thành mảng các từ
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        // Duyệt từng từ để chuẩn hóa
        for (String word : words) {
            String formattedWord = word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase();
            result.append(formattedWord).append(" ");
        }

        // Trả về kết quả đã xóa khoảng trắng thừa ở cuối
        return result.toString().trim();
    }
}