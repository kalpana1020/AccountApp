package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized.
 * <p/>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG =
        Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p/>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will ultimately get called when the
     * on-screen button labelled 'Process...' is pressed.
     */
    @Override
    public void process() {
        Account acct1 = new Account(mOut);
        Account acct2 = new Account(mOut);
        Account acct3 = new Account("crony",1234,1000,mOut);





        acct1.name = "Bill";
        acct1.number = 738924;
        acct1.balance = 231.48;

        acct2.name = "Sue";
        acct2.number = 894730;
        acct2.balance = 0;

        acct1.displayName();
        acct1.displayBalance();

        acct2.displayName();
        acct2.displayBalance();

        acct3.displayName();
        acct3.displayBalance();
        acct3.withdrawal(500);
        acct3.displayBalance();
        acct3.deposit(100);
        acct3.displayBalance();

        acct3.setName("Set to Paul");
        acct3.displayName();

        mOut.println("\n");
        String value = acct3.getName();
        mOut.println(value);


    }
}
