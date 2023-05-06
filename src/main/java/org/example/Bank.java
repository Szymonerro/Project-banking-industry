package org.example;

public record Bank(String bankBranch, String address) {
    private static final String bankName = "Lloyd's Bank";

    public String toString() {
        return "Bank name: " + bankName +
                "\nBank branch: " + bankBranch() +
                "\nAddress: " + address() + "\n";
    }
}
