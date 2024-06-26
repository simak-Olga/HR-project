import java.util.HashMap;
import java.util.Map;

public class employeereport {
    public static void main(String[] args) {
        // Создаем отчет по принятым сотрудникам
        Map<String, String> acceptedEmployees = new HashMap<>();
        acceptedEmployees.put("Иванов", "01.02.2022");
        acceptedEmployees.put("Петров", "13.08.2022");
        acceptedEmployees.put("Колесников", "06.07.2023");

        // Получаем текущую дату
        String currentDate = "01.02.2022"; // Замените на текущую дату

        // Выводим отчет по принятым сотрудникам на текущую дату
        System.out.println("Отчет по принятым сотрудникам на текущую дату (" + currentDate + "):");
        for (Map.Entry<String, String> entry : acceptedEmployees.entrySet()) {
            if (entry.getValue().equals(currentDate)) {
                System.out.println(entry.getKey());
            }
        }
    }
}