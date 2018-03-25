package tn.esprit.b1.esprit1718b1erp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javafx.collections.ObservableList;

@Entity
public class Purchase implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_purchase;

    @ManyToOne
    private User user2;

    @ManyToOne
    private General_Ledeger general_Ledeger;

    @ManyToOne
    private Contact contact;

    @ManyToMany
    private List<Item> item;

    @OneToOne
    private Commande commande;

    @Temporal(TemporalType.DATE)
    private Date dateDemande;

    @Temporal(TemporalType.DATE)
    private Date dateRecu;

    private Integer Quantite;

    private String purchase_type;

    private Float Somme;

    private String Dsecription;

    private String typePayementPurchase;

    @ManyToOne
    private Product product;

    @Enumerated(EnumType.STRING)
    private Statupurchase statupurchase;

    public Integer getId_purchase() {
        return id_purchase;
    }

    public void setId_purchase(Integer id_purchase) {
        this.id_purchase = id_purchase;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getRecu() {
        return dateRecu;
    }

    public void setRecu(Date recu) {
        dateRecu = recu;
    }

    public Integer getQuantite() {
        return Quantite;
    }

    public void setQuantite(Integer quantite) {
        Quantite = quantite;
    }

    public Float getSomme() {
        return Somme;
    }

    public void setSomme(Float somme) {
        Somme = somme;
    }

    public String getDsecription() {
        return Dsecription;
    }

    public void setDsecription(String dsecription) {
        Dsecription = dsecription;
    }

    public String getTypePayementPurchase() {
        return typePayementPurchase;
    }

    public User getUser() {
        return user2;
    }

    public void setUser(User user) {
        this.user2 = user;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Date getDateRecu() {
        return dateRecu;
    }

    public void setDateRecu(Date dateRecu) {
        this.dateRecu = dateRecu;
    }

    public String getPurchase_type() {
        return purchase_type;
    }

    public void setPurchase_type(String purchase_type) {
        this.purchase_type = purchase_type;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Statupurchase getStatupurchase() {
        return statupurchase;
    }

    public void setStatupurchase(Statupurchase statupurchase) {
        this.statupurchase = statupurchase;
    }

    public void setTypePayementPurchase(String typePayementPurchase) {
        this.typePayementPurchase = typePayementPurchase;
    }

    public Purchase() {
        super();
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public General_Ledeger getGeneral_Ledeger() {
        return general_Ledeger;
    }

    public void setGeneral_Ledeger(General_Ledeger general_Ledeger) {
        this.general_Ledeger = general_Ledeger;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Purchase(Contact contact, String dsecription) {
        super();
        this.contact = contact;
        Dsecription = dsecription;
    }

    public Purchase(Contact contact, String purchase_type, String dsecription, String typePayementPurchase) {
        super();
        this.contact = contact;

        this.purchase_type = purchase_type;
        Dsecription = dsecription;
        this.typePayementPurchase = typePayementPurchase;
    }

    public Purchase(Date dateDemande, String dsecription) {
        super();
        this.dateDemande = dateDemande;
        Dsecription = dsecription;
    }

    public Purchase(Contact contact, Date dateDemande, Date dateRecu, String purchase_type, String dsecription,
            String typePayementPurchase) {
        super();
        this.contact = contact;
        this.dateDemande = dateDemande;
        this.dateRecu = dateRecu;
        this.purchase_type = purchase_type;
        Dsecription = dsecription;
        this.typePayementPurchase = typePayementPurchase;

    }

    public Purchase(Integer id_purchase, User user2, General_Ledeger general_Ledeger, Contact contact, List<Item> item,
            Date dateDemande, Date dateRecu, Integer quantite, String purchase_type, Float somme, String dsecription,
            String typePayementPurchase, Statupurchase statupurchase) {
        super();
        this.id_purchase = id_purchase;
        this.user2 = user2;
        this.general_Ledeger = general_Ledeger;
        this.contact = contact;
        this.item = item;
        this.dateDemande = dateDemande;
        this.dateRecu = dateRecu;
        Quantite = quantite;
        this.purchase_type = purchase_type;
        Somme = somme;
        Dsecription = dsecription;
        this.typePayementPurchase = typePayementPurchase;
        this.statupurchase = statupurchase;
    }

    public Purchase(Contact contact, Date dateDemande, Date dateRecu, Integer quantite,
            String purchase_type, String dsecription, String typePayementPurchase, Product product
           ) {
        super();
        this.contact = contact;
      ////  this.item = item;
        this.dateDemande = dateDemande;
        this.dateRecu = dateRecu;
        Quantite = quantite;
        this.purchase_type = purchase_type;
        
        Dsecription = dsecription;
        this.typePayementPurchase = typePayementPurchase;
        this.product = product;
       
    }


}
