package com.company.demo.entity.customer;

import io.jmix.ui.screen.*;
import com.company.demo.entity.Customer;

@UiController("vdnstp_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}