package ru.job4j.ex;

/**
 * @author Iuriy Gaydarzhi.
 * @since 18.07.2021
 *
 * 1. Создайте класс ru.job4j.ex.UserNotFoundException наследника от Exception.
 * 2. Создайте класс ru.job4j.ex.UserInvalidException наследника от UserNotFoundException.
 * 3. Создайте класс ru.job4j.ex.User и хранилище ru.job4j.ex.UserStore.
 * 4. Вам необходимо реализовать метод findUser, validate и main.
 * main - поправить код за счет использования try-catch с множественным блоком catch.
 * В блоке catch(UserNotFoundException) - должно быть выведено на консоль сообщение, что пользователя не найдено.
 * В блоке  catch(UserInvalidException) - должно быть выведено на консоль сообщение, что пользователь не валидный.
 * 5. Загрузите код в репозиторий, оставьте ссылку на коммит и переведите на ответственного.
 */
public class UserStore {

    /**
     * Метод ищет пользователя и если не найден пользователь в списке, то кидает исключение UserNotFoundException.
     *
     * @param users Массив пользователей.
     * @param login Искомый пользователь.
     * @return Пользователя или исключение.
     * @throws UserNotFoundException Исключение, информирующее о том, что пользователь не найден.
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            } else {
                throw new UserNotFoundException("There is no such user!");
            }
        }
        return null;
    }

    /**
     * Если пользователь не валидный или если имя пользователя состоит из менее трех символов,
     * то кидаем исключение UserInvalidException. Метод validate принимает аргумент user.
     * У объекта user есть метод isValid(). Если он false, то нужно выкинуть исключение UserInvalidException.
     *
     * @param user Пользователь.
     * @return Пользователя или исключение.
     * @throws UserInvalidException Исключение, информирующее о том, что пользователь не валидный.
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("The user is not valid !");
        }
        return true;
    }

    /**
     * Main.
     *
     * @param args Входящие аргументы )
     */
    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Per Arsentev");

            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException ufe) {
            ufe.printStackTrace();
        }
    }
}
