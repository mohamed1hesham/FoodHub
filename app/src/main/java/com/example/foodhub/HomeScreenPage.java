package com.example.foodhub;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeScreenPage extends AppCompatActivity {

    public NavigationView navigationView;
    ImageButton menubtn,cart,restview;
    public DrawerLayout drawerLayout;

    ArrayList<CategoryModel> categoryModels = new ArrayList<>();
    RecyclerView catRecyclerView;
    String[] cat_names = {"Burger","Donat","Pizza","Mexian","Asian"};
    int[] cat_Images = {R.drawable.burger,R.drawable.donat,R.drawable.pizza,R.drawable.mexian,R.drawable.asian};


    ArrayList<FeaturedModel> featuredModels = new ArrayList<>();
    RecyclerView FeaturedRecyclerView;




    String name[]={"McDonald's","PaPa Johnnes","Bufflo Burger","Koshry El 3ris"};
    String time[]={"30 - 35 min","10 - 15 min","5 - 10 min","1 - 2 min"};
    String type[]={"Burger","Pizza","Burger","Koshry"};
    int [] img ={R.drawable.food1,R.drawable.food2,R.drawable.food1,R.drawable.food3};
    String rate[]={"4.5","5.0","3.0","5.0"};


    ArrayList<popularModel> popularModels = new ArrayList<>();
    RecyclerView popularRecyclerView;

    String popname[]={"shrimp meal","Bruschetta","Greek salad ","Meat pasta","Red n hot pizza","Greek salad"};
    String popdesc[]={"toppings of tomato","Spicy chicken, beef","meat and basil","with baked salmon","toppings of tomato","Spicy chicken, beef"};
    String popprice[]={"9.50","9.50","9.50","9.50","9.50","9.50"};
    int [] popimg ={R.drawable.pop1s,R.drawable.pop2s,R.drawable.pop3s,R.drawable.pop4s,R.drawable.pop5s,R.drawable.pop1s};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_page);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        menubtn=findViewById(R.id.menubtn);
        navigationView=findViewById(R.id.navigation_View);
        restview=findViewById(R.id.restview);
        cart=findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreenPage.this,CartPage.class));
            }
        });
        restview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeScreenPage.this,Resturantpage.class));
            }
        });

        navigationView.getMenu().getItem(0).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                startActivity(new Intent(HomeScreenPage.this,MyOrdersUpcomingPage.class));
                return false;
            }
        });
        navigationView.getMenu().getItem(1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                    startActivity(new Intent(HomeScreenPage.this,ProfilePage.class));
                return false;
            }
        });
        navigationView.getMenu().getItem(2).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                startActivity(new Intent(HomeScreenPage.this,DeliveryAddress.class));
                return false;
            }
        });
        navigationView.getMenu().getItem(3).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                startActivity(new Intent(HomeScreenPage.this,PaymentPage.class));
                return false;
            }
        });
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout = findViewById(R.id.my_drawer_layout);
                drawerLayout.open();

            }
        });
        catRecyclerView=findViewById(R.id.Category_Recycler_View);
        CategoryAdapter catAdapter = new CategoryAdapter(this, categoryModels);
        setupProductModel();
        catRecyclerView.setAdapter(catAdapter);
        catRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        FeaturedRecyclerView = findViewById(R.id.featured_resycler_view);
        FeaturedAdapter adapter = new FeaturedAdapter(this, featuredModels);
        setupProductModel2();
        FeaturedRecyclerView.setAdapter(adapter);
        FeaturedRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        popularRecyclerView=findViewById(R.id.popular_resycler_view);
        popularAdapter popAdapter=new popularAdapter(this,popularModels);
        setupProductModel3();
        popularRecyclerView.setAdapter(popAdapter);
        popularRecyclerView.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));






    }
    private void setupProductModel(){
        for(int i = 0; i < cat_names.length;i++){
            categoryModels.add(new CategoryModel(cat_names[i],cat_Images[i]));
        }
    }
    private void setupProductModel2() {
        for(int i = 0; i < name.length;i++){
            featuredModels.add(new FeaturedModel(name[i],time[i],type[i],img[i],rate[i]));
        }
    }
    private void setupProductModel3() {
        for(int i = 0; i <= name.length;i++){
            popularModels.add(new popularModel(popname[i],popdesc[i],popprice[i],popimg[i]));
        }
    }
}