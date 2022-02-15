package com.example.bai3;

public class ConvertYear {
    private int year;
    public String Convert(int year){
        String str = null;
        switch (year%10){
            case 0: {
                str = "Canh";
                break;
            }
            case 1: {
                str = "Tân";
                break;
            }
            case 2: {
                str = "Nhâm";
                break;
            }case 3: {
                str = "Quý";
                break;
            }case 4: {
                str = "Giáp";
                break;
            }case 5: {
                str = "Ất";
                break;
            }case 6: {
                str = "Bính";
                break;
            }case 7: {
                str = "";
                break;
            }case 8: {
                str = "Mậu";
                break;
            }case 9: {
                str = "Kỷ";
                break;
            }
        }
        switch (year%12){
            case 0: {
                str += " Thân";
                break;
            }
            case 1: {
                str += " Dậu";
                break;
            }
            case 2: {
                str += " Tuất";
                break;
            }case 3: {
                str += " Hợi";
                break;
            }case 4: {
                str += " Tý";
                break;
            }case 5: {
                str += " Sửu";
                break;
            }case 6: {
                str += " Dần";
                break;
            }case 7: {
                str += " Mẹo";
                break;
            }case 8: {
                str += " Thìn";
                break;
            }case 9: {
                str += " Tỵ";
                break;
            }case 10: {
                str += " Ngọ";
                break;
            }case 11: {
                str += " Mùi";
                break;
            }
        }
        return str;
    }
}
