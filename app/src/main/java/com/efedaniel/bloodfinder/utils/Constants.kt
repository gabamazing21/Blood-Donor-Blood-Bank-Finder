package com.efedaniel.bloodfinder.utils

class PrefKeys {
    companion object {
        const val LOGGED_IN_FIREBASE_AUTH_USER = "LOGGED_IN_FIREBASE_AUTH_USER"
        const val LOGGED_IN_USER_DATA = "LOGGED_IN_USER_DATA"
        const val PREVIOUSLY_USED_EMAIL_ADDRESS = "PREVIOUSLY_USED_EMAIL_ADDRESS"
    }
}

class APIDataKeys {
    companion object {
        const val INPUT_ERROR_CODE = 400
    }
}

class ApiKeys{
    companion object{
        const val AUTH_BASE_URL = "https://identitytoolkit.googleapis.com/"
        const val DATABASE_BASE_URL = "https://blooddonorbankfinder-h4373.firebaseio.com/"
        const val WEB_API_KEY = "AIzaSyA4PDmmaafAasb2l33XrprsH05DDVz4HEU"
        const val DONOR_ID = "donorID"
        const val BLOOD_TYPE = "bloodType"
    }
}

class ErrorCodes {
    companion object {
        const val EMAIL_NOT_FOUND = "EMAIL_NOT_FOUND"
        const val MISSING_EMAIL = "MISSING_EMAIL"
        const val INVALID_EMAIL = "INVALID_EMAIL"
        const val EMAIL_EXISTS = "EMAIL_EXISTS"
        const val INVALID_PASSWORD = "INVALID_PASSWORD"
        const val USER_DISABLED = "USER_DISABLED"
        const val TOO_MANY_ATTEMPTS = "TOO_MANY_ATTEMPTS_TRY_LATER : Too many unsuccessful login attempts.  Please include reCaptcha verification or try again later"
    }
}

class Misc {
    companion object {
        const val DAY_MONTH_YEAR_AND_TIME = "dd MMMM yyyy 'by' hh:mma"
        const val DAY_MONTH_AND_TIME = "dd MMMM 'at' hh:mma"
        const val TIME = "hh:mma"
        const val CALL_PERMISSION_REQUEST = 200
        const val LOCATION_PERMISSION_REQUEST = 201
        const val LOCATION_DEVICE_ACCESS_REQUEST = 202
    }
}