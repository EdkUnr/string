public class EmployeeDataFullProcess {
    public static void main(String[] args) {
        // Инициализация Ф. И. О. сотрудника
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";

        // Формирование полного имени
        String fullName = lastName + " " + firstName + " " + middleName;

        // Замена 'ё' на 'е'
        String correctedFullName = fullName.replace('ё', 'е');

        // Преобразование в верхний регистр
        String fullNameUpperCase = correctedFullName.toUpperCase();

        // Вывод результата
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);
    }
}
