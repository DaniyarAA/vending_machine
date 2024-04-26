package model;

import interfaces.MoneyAcceptable;

import java.util.Scanner;

public class CardAcceptor implements MoneyAcceptable {
    public int amount;
    public String cardNumber;
    public String oneTimePassword;
    public CardAcceptor(int amount){
        this.amount = amount;
        insertCard();
    }
    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void insertCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер вашей банковской карты: ");
        this.cardNumber = scanner.nextLine();
        System.out.print("Введите одноразовый пароль: ");
        this.oneTimePassword = scanner.nextLine();
        System.out.print("Карта принята. ");
    }
}
