package com.example.java;

import java.util.ArrayList;

public class ClientsList {
    ArrayList<Clients> myClients = new ArrayList<Clients>();

    public ClientsList(){
        Clients client1 = new Clients(0,1928,2520.3);
        Clients client2 = new Clients(1,3829,30595.4);
        Clients client3 = new Clients(2,7682,3485006.4);
        Clients client4 = new Clients(3,1937,1235.3);
        Clients client5 = new Clients(4,6849,204956.3);
        Clients client6 = new Clients(5,6739,10435.3);
        Clients client7 = new Clients(6, 3840,2948504.2);
        Clients client8 = new Clients(7, 4937,2847053.4);
        Clients client9 = new Clients(8,9374,947573.3);
        Clients client10 = new Clients(9,3856,2839505.3);

        this.myClients.add(client1);
        this.myClients.add(client2);
        this.myClients.add(client3);
        this.myClients.add(client4);
        this.myClients.add(client5);
        this.myClients.add(client6);
        this.myClients.add(client7);
        this.myClients.add(client8);
        this.myClients.add(client9);
        this.myClients.add(client10);
    }


    public boolean isFound(int idInt){
        boolean isFound = false;

        for (Clients client: myClients) {
            if (client.getId() == idInt) {
                isFound = true;
                break;
            }
        }

        if (isFound){
            System.out.println("USER NUMBER: " + idInt);
        } else {
            System.out.println("USER NOT FOUND");
            System.exit(0);
        }
        return true;
    }

    public boolean pwdSecurity(int pwdClient){
        boolean pwdMatch = false;

        for (Clients client:myClients) {
            if (client.getPwd()==pwdClient){
                pwdMatch = true;
            }

            if (!pwdMatch) {
                System.out.println("WRONG PASSWORD");
            }
            break;
        }
        return true;
    }

    


    public double withdrew(int idInt,double amountToWD){
        Clients myClientToModify =null;
        int counter = 0;
        int indexOfClient = -1;
        double newBalance=0;

        for (Clients client:myClients) {
            if (client.getId()==idInt){
                myClientToModify = client;
                indexOfClient = counter;
                break;
            }
        }
        newBalance = myClientToModify.getBalance() - amountToWD;
        myClientToModify.setBalance(newBalance);
        myClients.add(indexOfClient,myClientToModify);
        return newBalance;
    }

    public double dpOperation(int idInt,double amountToWD){
        Clients myClientToModify =null;
        int counter = 0;
        int indexOfClient = -1;
        double newBalance=0;

        for (Clients client:myClients) {
            if (client.getId()==idInt){
                myClientToModify = client;
                indexOfClient = counter;
                break;
            }
        }
        newBalance = myClientToModify.getBalance() + amountToWD;
        myClientToModify.setBalance(newBalance);
        myClients.add(indexOfClient,myClientToModify);
        return newBalance;
    }

    public ArrayList<Clients> getMyClients() {
        return myClients;
    }

    public void setMyClients(ArrayList<Clients> myClients) {
        this.myClients = myClients;
    }
}
