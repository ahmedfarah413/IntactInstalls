package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Basic Install", "• One TV mounted\n" +
                "• Unpack your TV\n" +
                "• TV mount not included\n" +
                "• Hide cables not included\n" +
                "• Mounting over fireplace not included\n" +
                "• For TVs 32-65 inches\n" +
                "• On drywall surface\n", 90, true, "https://www.dupageseniorcouncil.org/wp-content/uploads/2018/02/Bronze-Icon-1-600x605.jpg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Silver Install", "• One TV mounted\n" +
                "• TV flat mount included\n" +
                "• Hide cables not included\n" +
                "• Unpack your TV\n" +
                "• Mounting over fireplace not included\n" +
                "• For TVs 32-65 inches\n" +
                "• On drywall surface",125, true, "https://www.dupageseniorcouncil.org/wp-content/uploads/2018/02/Silver-Icon-600x605.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Gold Install", "• One TV mounted\n" +
                "• New outlet behind TV\n" +
                "• No cables visible\n" +
                "• TV flat mount INCLUDED\n" +
                "• Unpack your TV\n" +
                "• Mounting over fireplace not included\n" +
                "• For TVs 32-65 inches\n" +
                "• On drywall surface",195, true, "https://www.dupageseniorcouncil.org/wp-content/uploads/2018/02/Gold-Icon-600x605.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Deluxe Fireplace Install", "• One TV mounted\n" +
                "• New outlet behind TV\n" +
                "• No cables visible\n" +
                "• TV flat mount INCLUDED\n" +
                "• Unpack your TV\n" +
                "• Mounting over fireplace INCLUDED\n" +
                "• For TVs 32-65 inches\n" +
                "• On drywall surface",245, true, "https://previews.123rf.com/images/mushan/mushan1804/mushan180400103/99299690-deluxe-gold-badge-icon.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Custom Install", "• Multiple TVs\n" +
                "• Soundbars\n" +
                "• LED lights\n" +
                "• Game systems\n" +
                "• Cable fix-ups\n" +
                "• Ceiling fans\n" +
                "• Picture hanging\n" +
                "• AND MORE!!!", 245, false, "https://static.wixstatic.com/media/01ef68_739b9c217a7c4e2482afe7b7f71d080c~mv2.png/v1/fill/w_85,h_110,al_c,q_85,usm_0.66_1.00_0.01/logo2b_edited.webp"));
        mutableProductList.setValue(productList);
    }
}
