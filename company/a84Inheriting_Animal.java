package com.company;

class animal
{
     public String type; // terrestrial, reptile, aquatic, aerial
    public String PetOrNot;
     public void setType(String s)
     {
         type=s;
     }
     public String getType()
     {
         return type;
     }
     public String getPetOrNot()
     {
         return PetOrNot;
     }
     public void setPetOrNot(String y)
     {
         PetOrNot = y;
     }
}
class dog extends animal
{
    String quality;
    String colour;
    String breed;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
public class a84Inheriting_Animal {
    public static void main(String[] args) {
        //animal a = new animal();
        dog d = new dog();
        d.setType("terrestrial");
        d.setPetOrNot("Pet");
        d.setBreed("Pitbull");
        d.setQuality("Barking, " + "Nodding, " + "Eating");
        d.setColour("Black");
        System.out.println(d.getBreed());
        System.out.println(d.getType());
        System.out.println(d.getColour());
        System.out.println(d.getQuality());
        System.out.println(d.getPetOrNot());
    }
}
