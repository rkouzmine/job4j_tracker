package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (login.equals(user.getUserName())) {
                result = user;
                break;
            }
            if (result == null) {
                throw new UserNotFoundException("Логин не найден");
            }

        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUserName().length() < 3) {
            throw new UserInvalidException("Имя пользователя меньше 3 символов");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Руслан Кузьмин", true)
        };
        try {
            User user = findUser(users, "Руслан Кузьмин");
            if (validate(user)) {
                System.out.println("У пользователя есть доступ");
            }
        } catch (UserInvalidException a) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException b) {
            System.out.println("Пользователь не найден");
        }
    }
}
