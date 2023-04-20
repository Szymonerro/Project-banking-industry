package org.example;

    public class Bank {
        final private String bankName = "Lloyds Bank";
        private String bankBranch;
        private String address;

        public Bank(String bankName, String bankBranch, String address) {
            this.bankBranch = bankBranch;
            this.address = address;
        }

        public String getBankBranch() {
            return bankBranch;
        }

        public void setBankBranch(String bankBranch) {
            this.bankBranch = bankBranch;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String toString () {
            return "Bank name: " + bankName +
                    "\nBank branch: " + getBankBranch() +
                    "\nAddres: " + getAddress();
        }
    }