package com.varkovich.lesson_13;

import com.varkovich.lesson_13.exception.WrongLoginException;
import com.varkovich.lesson_13.exception.WrongPasswordException;
import com.varkovich.lesson_13.validator.CredentialValidator;

/**
 * \
 * Создать класс, в котором будет статический метод.
 * Этот метод принимает на вход три параметра:
 * Login
 * Password
 * confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать
 * пробелы.
 * Если login не соответствует этим требованиям, необходимо "выбросить" WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * Классы-исключения WrongPasswordException и WrongLoginException - пользовательские
 * классы исключения с двумя конструкторами – один по умолчанию, второй
 * принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения валидны или false в другом случае.
 * Разместить классы по пакетам: класс для проверки значений должен находится в своем отдельном пакете,
 * классы для исключений - в своем.
 * Создать класс Runner для тестирования этого класса.
 * Попробовать решить задачу двумя способами:
 * 1. методами класса String "из коробки", например метод contains
 * 2. разбив строку на массив char'ов (string toCharArray()) и сделать обход и проверку массива
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        try {
            CredentialValidator.isCredentialValidFirstOption("1", "dfdsfCS3C", "");
            System.out.println("Successful authorization");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            CredentialValidator.isCredentialValidSecondOption("dfdfdf", "fefefef3", "fefeff3");
            System.out.println("Successful authorization");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
