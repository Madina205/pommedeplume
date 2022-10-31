package ArrayList.Main_2;

import java.util.ArrayList;

public class Main_2 {
    public static void main(String[] args) {
      BankApplication BA_1 = new BankApplication("Kaspi" );
      BankApplication BA_2 = new BankApplication("Halyk");
      BankApplication BA_3 = new BankApplication("RBK");

      Account Ac_1 =  new Account(1, "Ainara", "Mussina", 146000);
      Account Ac_2 =  new Account(2, "Ain", "Mussina", 8000600);
      Account Ac_3 =  new Account(3, "Aina", "Mussina", 90046500);
      Account Ac_4 =  new Account(4, "Ai", "Mussina", 2000000);
      Account Ac_5 =  new Account(5, "Ainar", "Mussina", 3000000);
      Account Ac_6 =  new Account(6, "Ainarchik", "Mussina", 400056000);
      Account Ac_7 =  new Account(7, "Ainarike", "Mussina", 500056000);
      Account Ac_8 =  new Account(8, "A", "Mussina", 700065005);
      Account Ac_9 =  new Account(9, "Ainarochka", "Mussina", 2000650);
      Account Ac_10 =  new Account(10, "Aiiiiii", "Mussina", 4056000);


      BA_1.addAccount(Ac_1);
      BA_1.addAccount(Ac_2);
      BA_1.addAccount(Ac_3);
      BA_1.addAccount(Ac_4);
      BA_1.addAccount(Ac_5);
      BA_1.addAccount(Ac_6);
      BA_1.addAccount(Ac_7);
      BA_1.addAccount(Ac_8);
      BA_1.addAccount(Ac_9);
      BA_1.addAccount(Ac_10);


      Account Ac_11 =  new Account(11, "Ainara", "M", 100);
      Account Ac_12 =  new Account(12, "Ainara", "Mu", 234);
      Account Ac_13 =  new Account(13, "Ainara", "Mus", 100);
      Account Ac_14 =  new Account(14, "Ainara", "Muss", 460);
      Account Ac_15 =  new Account(15, "Ainara", "Mussi", 105);
      Account Ac_16 =  new Account(16, "Ainara", "Mussin", 100);
      Account Ac_17 =  new Account(17, "Ainara", "Mussina", 1045);
      Account Ac_18 =  new Account(18, "Ainara", "USA", 450);
      Account Ac_19 =  new Account(19, "Ainara", "US", 4000);
      Account Ac_20 =  new Account(20, "Ainara", "UK", 105);

      BA_2.addAccount(Ac_11);
      BA_2.addAccount(Ac_12);
      BA_2.addAccount(Ac_13);
      BA_2.addAccount(Ac_14);
      BA_2.addAccount(Ac_15);
      BA_2.addAccount(Ac_16);
      BA_2.addAccount(Ac_17);
      BA_2.addAccount(Ac_18);
      BA_2.addAccount(Ac_19);
      BA_2.addAccount(Ac_20);


      Account Ac_21 =  new Account(21, "Yerlan", "Mussin", 100);
      Account Ac_22 =  new Account(22, "Yerlan", "Mussin", 660);
      Account Ac_23 =  new Account(23, "Yerlan", "Mussin", 5000);
      Account Ac_24 =  new Account(24, "Yerlan", "Mussin", 6500);
      Account Ac_25 =  new Account(25, "Yerlan", "Mussin", 800);
      Account Ac_26 =  new Account(26, "Yerlan", "Mussin", 6800);
      Account Ac_27 =  new Account(27, "Yerlan", "Mussin", 570);
      Account Ac_28 =  new Account(28, "Yerlan", "Mussin", 5600);
      Account Ac_29 =  new Account(29, "Yerlan", "Mussin", 600);
      Account Ac_30 =  new Account(30, "Yerlan", "Mussin", 8700);

      BA_3.addAccount(Ac_21);
      BA_3.addAccount(Ac_22);
      BA_3.addAccount(Ac_23);
      BA_3.addAccount(Ac_24);
      BA_3.addAccount(Ac_25);
      BA_3.addAccount(Ac_26);
      BA_3.addAccount(Ac_27);
      BA_3.addAccount(Ac_28);
      BA_3.addAccount(Ac_29);
      BA_3.addAccount(Ac_30);

      ArrayList<BankApplication> allBanks = new ArrayList<>();
      BankApplication max;
      allBanks.add(BA_1);
      allBanks.add(BA_2);
      allBanks.add(BA_3);

      for( int i =0; i< allBanks.size(); i++){
        for(int j =0; j<allBanks.size(); j++){
          if(allBanks.get(i).getAverageBalance()< allBanks.get(i).getAverageBalance()){
            max = allBanks.get(i);
            allBanks.set(i, allBanks.get(j));
            allBanks.set(j,max);
          }
        }
      }

      for( int i =0; i< allBanks.size(); i++){
          System.out.println(allBanks.get(i).getBankData());
      }
    }
}

