import java.util.Arrays;

public class Learn9 {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields){
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ")
                .append(table + " (")
                .append(String.join(", ", fields))
                .append(") VALUES (")
                .append(String.join(", ", fields).replaceAll("\\w+", "?"))  // 正则匹配字段名并替换为?
                .append(")");
        return sb.toString();
    }
}
