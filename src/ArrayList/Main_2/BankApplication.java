package ArrayList.Main_2;

import java.util.ArrayList;

public class BankApplication {
    protected String name;
    private ArrayList<Account> accounts = new ArrayList();

    public BankApplication() {

    }

    public BankApplication(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void addAccount(Account a) {
        accounts.add(a);
    }
    // Добавляет новый объект Account


    void removeAccount(int i) {
        accounts.remove(i);
    }
    // Удаляет объект со списка под индексом i

    Account getMaxAccount() {
        Account max = accounts.get(0);
        for (int i = 0; i < accounts.size(); i++) {
            if (max.getBalance() < accounts.get(i).getBalance()) {
                max = accounts.get(i);
            }
        }
        return max;
    }
    // Возвращает объект Account у кого самый высокий баланс


    double getAverageBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (sum < accounts.get(i).getBalance()) {
                sum = sum + accounts.get(i).getBalance();
            }
        }
        return sum / accounts.size();
    }
    // Возвращает среднее значение баланса пользователей

    double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (sum < accounts.get(i).getBalance()) {
                sum = sum + accounts.get(i).getBalance();
            }
        }
        return sum;
    }

    // Возвращает сумму баланса пользователей

    int totalAccounts() {
       return accounts.size();
    }
    // Возвращает количество пользователей

    String getBankData() {
        return name +  " " + accounts.size() + " " +getTotalBalance() + " " + getAverageBalance() ;
    }

}


