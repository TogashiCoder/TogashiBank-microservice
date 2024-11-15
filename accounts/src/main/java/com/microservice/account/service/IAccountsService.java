package com.microservice.account.service;


import com.microservice.account.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Creates a new account for the provided customer details.
     *
     * @param customerDto the data transfer object containing customer information
     *                    required to create an account. It should include necessary
     *                    fields such as name, email, and address.
     */
    void createAccount(CustomerDto customerDto);



    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);


    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);

}
