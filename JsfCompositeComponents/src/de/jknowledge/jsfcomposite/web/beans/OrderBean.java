package de.jknowledge.jsfcomposite.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.jknowledge.jsfcomposite.domain.model.BankAccount;


@ManagedBean(name="orderBean")
@SessionScoped
public class OrderBean implements Serializable {
	
	private BankAccount bankAccount;
	
	
	public BankAccount getBankAccount() {
		if(bankAccount == null) {
			bankAccount = new BankAccount();
		}
		
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	

}
