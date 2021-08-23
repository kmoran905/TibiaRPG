/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tibiarpg;

/**
 *
 * @author KHYLE
 */
public enum Items {
    
//Item , Buying Value , Selling Value    
    
AXE("Axe" , 7 , 20), 
BATTLEAXE("Battle Axe", 80 , 285),
BATTLEHAMMER("Battle Hammer", 80  , 235),
BATTLESHIELD("Battle Shield", 95),
BONECLUB("Bone Club", 5),
BONESWORD("Bone Sword", 20),
BRASSARMOR("Brass Armor", 150),
BRASSHELMET("Brass Helmet", 30),
BRASSLEGS("Brass Legs", 49),
BRASSHIELD("Brass Shield", 25),
CARLINSWORD("Carlin Sword", 118 , 473),
CHAINARMOR("Chain Armor", 70 , 200),
CHAINHELMET("Chain Helmet", 17),
CHAINLEGS("Chain Legs", 25),
CLUB("Club", 1),
COAT("Coat", 1),
COPPERSHIELD("Copper Shield", 50),
CROWBAR("Crowbar", 50),
DAGGER("Dagger", 2),
DOUBLEAXE("Double Axe", 260),
DOUBLET("DoubleT", 3),
DWARVENSHIELD("Dwarven Shield", 100 , 500),
FIRESWORD("Firesword", 1000),
HALBERD("Halberd", 400),
HANDAXE("HandAxe", 4),
HATCHET("Hatchet", 4),
IRONHELMET("Iron Helmet", 150),
JACKET("Jacket", 1),
KATANA("Katana", 35),
LEATHERARMOR("Leather Armor", 12),
LEATHERBOOTS("Leather Boots", 2),
LEATHERHELMET("Leather Helmet", 4),
LEATHERLEGS("Leather Legs", 9),
LEGIONHELMET("Legion Helmet", 22),
LONGSWORD("Long Sword", 51),
MACE("Mace", 30),
MAGICPLATEARMOR("Magic Plate Armor", 6400),
MORNINGSTAR("Morning Star" , 100),
ORCISHAXE("Orcish Axe", 100),
PLATEARMOR("Plate Armor", 400 , 1200),
PLATELEGS("Plate Legs", 115),
PLATESHIELD("Plate Shield", 45),
RAPIER("Rapier", 5),
SABRE("Sabre", 12),
SCALEARMOR("Scale Armor", 75),
SHORTSWORD("Short Sword", 10),
SICKLE("Sickle", 3),
SMALLAXE("Small Axe", 3),
SOLDIERHELMET("Soilder Helmet", 5),
SPIKESWORD("Spike Sword", 16 , 8000),
STEELHELMET("Steel Helmet", 20 ),
STEELSHIELD("Steel Shield", 80),
STUDDEDARMOR("Studded Armor", 25),
STUDDEDCLUB("Studded Club" , 10),
STUDDEDHELMET("Studded Helmet" , 20 ),
STUDDEDLEGS("Studded Legs" , 15),
STUDDEDSHIELD("Studded Shield", 16),
SWAMPLINGCLUB("Swampling Club", 40),
SWORD("Sword", 25),
THROWINGKNIFE("Throwing Knife", 2),
TWOHANDEDSWORD("Two Handed Sword" , 450),
VIKINGHELMET("Viking Helmet" , 66),
VIKINGSHIELD("Viking Shield" , 85),
WARHAMMER("War Hammer" , 470 , 10000),
WOODENSHIELD("Wooden Shield", 5);

private final String items;
private final int buyingValue;
private int sellingValue;

private Items(String items, int buyingValue, int sellingValue) {
    this.items = items;
    this.buyingValue = buyingValue;
    this.sellingValue = sellingValue;
}

private Items(String items, int buyingValue) {
    this.items = items;
    this.buyingValue = buyingValue;
  
}

    /**
     * @return the items
     */
    public String getItems() {
        return items;
    }

    /**
     * @return the buyingValue
     */
    public int getBuyingValue() {
        return buyingValue;
    }

    /**
     * @return the sellingValue
     */
    public int getSellingValue() {
        return sellingValue;
    }
    
    
    


    
    
    
    
}
