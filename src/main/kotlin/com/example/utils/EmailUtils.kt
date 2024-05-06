package com.example.utils

import org.apache.commons.lang3.RandomStringUtils

class EmailUtils {


    public fun randomEmail(): String {
        return randomStringByApacheCommons().plus("@gmail.com")
    }

    private fun randomStringByApacheCommons(): String = RandomStringUtils.randomAlphanumeric(10)

}