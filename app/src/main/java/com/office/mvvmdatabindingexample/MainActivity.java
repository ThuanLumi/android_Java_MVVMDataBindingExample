package com.office.mvvmdatabindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.office.mvvmdatabindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,
              R.layout.activity_main);
      LoginViewModel loginViewModel = new LoginViewModel();
      activityMainBinding.setLoginViewModel(loginViewModel);
   }
}