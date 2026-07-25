package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDDto);

    boolean deleteAccount(String mobileNumber);
}
