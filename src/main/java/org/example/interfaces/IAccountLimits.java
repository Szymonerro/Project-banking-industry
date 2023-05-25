package org.example.interfaces;

public interface IAccountLimits {
    void changeWithdrawalLimit(int newLimit);
    void changeMaxDailyTransfers (int newLimit);
    void changeMaxDailyTransferAmount(double newLimit);
}