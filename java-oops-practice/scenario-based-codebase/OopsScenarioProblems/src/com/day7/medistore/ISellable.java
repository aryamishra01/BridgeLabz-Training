package com.day7.medistore;

//Interface defining selling and expiry behavior
interface ISellable {
 double sell(int quantity);
 boolean checkExpiry();
}
