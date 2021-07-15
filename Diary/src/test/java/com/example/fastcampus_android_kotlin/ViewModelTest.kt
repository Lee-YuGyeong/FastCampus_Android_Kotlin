package com.example.fastcampus_android_kotlin

import org.junit.Rule
import org.koin.test.KoinTest
import org.mockito.Mockito
import org.mockito.junit.MockitoRule

internal class ViewModelTest: KoinTest{

    @get:Rule
    val mockitoRule: MockitoRule
}