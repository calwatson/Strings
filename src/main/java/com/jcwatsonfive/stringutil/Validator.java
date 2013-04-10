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

public class Validator {

    //Returns true if value is the empty String
    public static boolean empty(String value){
        return "".equals(value);
    }
}
