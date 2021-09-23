package com.company.demo.entity.customer;

import io.jmix.ui.screen.*;
import com.company.demo.entity.Customer;

@UiController("vdnstp_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}