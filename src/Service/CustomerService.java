/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.*;
/**
 *
 * @author pc
 */
public interface CustomerService extends Remote{
    Customer recordCustomer(Customer customerObj ) throws RemoteException;
    Customer updateCustomer(Customer customerObj ) throws RemoteException;
    Customer deleteCustomer(Customer customerObj ) throws RemoteException;
    Customer searchCustomer(Customer customerObj ) throws RemoteException;
    List<Customer> allCustomers() throws RemoteException;
    List<CustomerOrder> allCustomerOrders() throws RemoteException;
    boolean isPhoneNumberExists(String phoneNumber) throws RemoteException;
    Customer searchCustomerByPhoneNumber(String phoneNumber) throws RemoteException;
}
