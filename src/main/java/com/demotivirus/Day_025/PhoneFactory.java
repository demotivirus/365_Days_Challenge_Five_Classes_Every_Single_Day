package com.demotivirus.Day_025;

public class PhoneFactory {
    public Phone createPhone(String phoneMark){
        return getSmartphone(phoneMark);
    }

    public Smartphone createSmartphone(String phoneMark){
        return getSmartphone(phoneMark);
    }

    public NeuroPhone createNeuroPhone(String phoneMark){
        return getNeuroPhone(phoneMark);
    }

    private Smartphone getSmartphone(String phoneMark) {
        switch (phoneMark.toLowerCase()){
            case "nokia": return new Nokia();
            case "samsung": return new Samsung();
            case "lenovo": return new Lenovo();
            case "azumaru": return new Azumaru();
            default: throw new RuntimeException(phoneMark + " not found");
        }
    }

    private NeuroPhone getNeuroPhone(String phoneMark){
        switch (phoneMark.toLowerCase()){
            case "azumaru": return new Azumaru();
            default: throw new RuntimeException(phoneMark + " not found");
        }
    }
}
