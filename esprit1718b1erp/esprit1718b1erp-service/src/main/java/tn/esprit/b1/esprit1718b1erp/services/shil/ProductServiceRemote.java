package tn.esprit.b1.esprit1718b1erp.services.shil;

import javax.ejb.Remote;

import tn.esprit.b1.esprit1718b1erp.entities.Product;
import tn.esprit.b1.esprit1718b1erp.utilities.IGenericDAO;

@Remote
public interface ProductServiceRemote extends IGenericDAO<Product>{

}
