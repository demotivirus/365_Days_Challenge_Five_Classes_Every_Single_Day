package com.demotivirus.Day_012;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//@Data
@ToString
@EqualsAndHashCode
public class Backpack {
    private List<Inventoreable> inventorys;

    public Backpack() {
        inventorys = new ArrayList<>();
    }

    public void add(Inventoreable inventoreable){
        printAddMsg(inventoreable);
        inventorys.add(inventoreable);
    }

    public void add(Inventoreable inventoreable, int nums){
        printAddMsg(inventoreable);
        if (!inventorys.contains(inventoreable))
            inventorys.add(inventoreable);
        for (int i = 0; i < inventorys.size(); i++) {
            if (inventorys.get(i).equals(inventoreable)) {
                Inventoreable inventory = inventorys.get(i);
                inventory.addNumbers(nums);
                break;
            }
        }
    }

    public void showAllInventory(){
        System.out.println("SHOW ALL INVENTORY:");
        for (Inventoreable inventory : inventorys)
            System.out.println(inventory);
    }

    public void delete(Inventoreable inventoreable){
        printDeleteMsg(inventoreable);
        if(inventorys.contains(inventoreable))
            inventorys.remove(inventoreable);
    }

    public void delete(Inventoreable inventoreable, int nums){
        printDeleteMsg(inventoreable);
        for (int i = 0; i < inventorys.size(); i++) {
            if (inventorys.get(i).equals(inventoreable)) {
                Inventoreable inventory = inventorys.get(i);
                inventory.updateNumbers(nums);
                break;
            }
        }
    }

    private List<Inventoreable> getInventorys() {
        return inventorys;
    }

    private void setInventorys(List<Inventoreable> inventorys) {
        this.inventorys = inventorys;
    }

    private void printAddMsg(Inventoreable inventoreable){
        System.out.println("ADD " + inventoreable);
    }

    private void printDeleteMsg(Inventoreable inventoreable){
        System.out.println("Delete " + inventoreable);
    }
}
