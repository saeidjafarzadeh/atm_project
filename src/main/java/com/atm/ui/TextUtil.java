package com.atm.ui;

public class TextUtil {
    private static final String RED_BOLD = "\u001b[1;31m";
    private static final String GREEN_BOLD = "\u001b[1;32m";
    private static final String YELLOW_BOLD = "\u001b[1;33m";
    private static final String BLUE_BOLD = "\u001b[1;34m";
    private static final String CYAN_BOLD = "\u001b[1;36m";
    private static final String RESET = "\u001b[0m";

    public static void printError(String message) {
        System.out.println(RED_BOLD + message + RESET);
    }

    public static void printWarning(String message) {
        System.out.println(YELLOW_BOLD + message + RESET);
    }

    public static void printInfo(String message) {
        System.out.println(BLUE_BOLD + message + RESET);
    }

    public static void printSuccess(String message) {
        System.out.println(GREEN_BOLD + message + RESET);
    }

    public static void printText(String message) {
        System.out.println(CYAN_BOLD + message + RESET);
    }

    public static void printHelpUser(){
        TextUtil.printText("please select number of operation");
        TextUtil.printInfo("1-create");
        TextUtil.printInfo("2-update");
        TextUtil.printInfo("3-delete");
        TextUtil.printInfo("4-read");
        TextUtil.printInfo("5-search");
        TextUtil.printInfo("6-find");
        TextUtil.printInfo("7-back to main menu");
        TextUtil.printInfo("8-continue");
    }
}
