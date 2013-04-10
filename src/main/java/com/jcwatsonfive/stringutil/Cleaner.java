package com.jcwatsonfive.stringutil;

/*************************************************************************
 *
 * SecondMarket Labs CONFIDENTIAL
 *
 * [2007] - [2013] SecondMarket Labs, LLC.
 * All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property
 * of SecondMarket Labs, LLC. and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to SecondMarket Labs, LLC.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret and copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SecondMarket Labs, LLC.
 */

public class Cleaner {


    public static String cleanNonAlphaNumeric(String value){
        if(Validator.empty(value))
            return value;

        return value.replaceAll("[^a-zA-Z0-9]", "");
    }
}
