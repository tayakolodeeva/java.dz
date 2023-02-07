import java.util.*;

public class ProgramMain {
    public static void main(String[] args) {
        ProgramLaptop hp_pailion_g6 = new ProgramLaptop("hp_pailion_g6", 16, "4k", 
        true, 500, "16", "Windows", "black"); 
        ProgramBrand brandHp = new ProgramBrand("HP", "U.S.A.", "AmericaLanguage");
        hp_pailion_g6.addBrand(brandHp); 
        ProgramLaptop hp_galaxy_x64 = new ProgramLaptop("hp_galaxy_x64", 14, "FullHD", 
        true, 500, "8", "Windows", "white");
        hp_galaxy_x64.addBrand(brandHp);
        ProgramLaptop samsung_a52 = new ProgramLaptop("samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "black");
        ProgramBrand brandSamsung = new ProgramBrand("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        ProgramLaptop samsung_m31s = new ProgramLaptop("samsung_m31s", 16, "4k", 
        false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        ProgramLaptop lenovo_gtx76 = new ProgramLaptop("lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "white");
        ProgramBrand brandLenovo = new ProgramBrand("Lenovo", "China", "ChinaLanguage");
        lenovo_gtx76.addBrand(brandLenovo);
        ProgramLaptop macbook_14pro = new ProgramLaptop("macbook_14pro", 17, "4k", 
        false, 1000, "8", "ios", "white");
        ProgramBrand brandMacbook = new ProgramBrand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        ProgramLaptop asus_x515 = new ProgramLaptop("asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "black");
        ProgramBrand brandAsus = new ProgramBrand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        ProgramLaptop acer_air5 = new ProgramLaptop("acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "black");
        ProgramBrand brandAcer = new ProgramBrand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        ProgramLaptop acer_air6 = new ProgramLaptop("acer_air6" ,18, "4k", 
        false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);
        ProgramLaptop acer_a313 = new ProgramLaptop("acer_a313", 16, "FullHD", 
        true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);

        Set <ProgramLaptop> laptop = new HashSet<>();
        laptop.add(hp_pailion_g6);      
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_14pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);

        ProgramLaptop FilterLaptop = new ProgramLaptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
