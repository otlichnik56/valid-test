public class Main {

    private static void valid(String userName, String password) throws WrongLoginAndPasswordException{
        String userNameDataBase = "123";
        String passwordDataBase = "123";
        if (!(userName.equals(userNameDataBase) && password.equals(passwordDataBase))){
            throw new WrongLoginAndPasswordException();
        }
    }

    public static void main(String[] args) {
        String userName = "123";
        String password = "123д";
        try {
            valid(userName, password);
            System.out.println("Логин и пароль верны");
        } catch (WrongLoginAndPasswordException a){
            System.out.println("Ошибка при вводе логина или пароля к базе данных");
        } finally {
            System.out.println("Проверка учётных данных завершена");
        }
    }

}