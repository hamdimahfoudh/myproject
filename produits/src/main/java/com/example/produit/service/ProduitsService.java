package com.example.produit.service;

import java.util.List;

import com.example.produit.entities.Produit;

public interface ProduitsService {

	
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits(); 
	
}
