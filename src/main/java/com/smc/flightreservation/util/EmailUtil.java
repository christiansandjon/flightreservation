package com.smc.flightreservation.util;

public interface EmailUtil {

    void sendEmail(String toAddress, String subject, String body);
}
