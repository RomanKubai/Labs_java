package ua.lviv.iot.lab1;

public class Main {
	public static void main(String[] args) {
		perfume avon = new perfume(125, 800, "germany");
		perfume oriflame = new perfume(200, 400, "oriflame", "turkey", "for victory", "red");
		perfume dior = new perfume();
		
		System.out.println(avon);
		System.out.println(oriflame);
		System.out.println(dior);
		System.out.println(perfume.showShopNumber());
		}
}
