package Seminar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Харрактеристики по которым будем проводить отбор
        Map<String, String> userConfig = new HashMap<>();
        // Список с экземплярами класса NoteBook
        ArrayList<NoteBook> listNoteBook = new ArrayList<NoteBook>();
        // Метод заполнения списка
        AddNoteBook(listNoteBook);
        // Приветствие
        HelloUser();
        // Заполоняем userCongig
        Action(userConfig);
        PrintConfig(userConfig);
        selections(listNoteBook, userConfig);
    }

    // Заполняем параметры для поиска
    public static Map<String, String> Action(Map<String, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска ноутбука:");
        System.out.println(
                "1 - Оперативная память\n2 - Объем ЖД\n3 - Операционная система\n4 - Цена\n5 - Подобрать ноутбук");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.print("Доступные конфигурации ram:\n");
                System.out.println("1 - 8гб\n2 - 16гб\n3 - 32гб\n4 - 64гб");
                Scanner sc = new Scanner(System.in);
                String choiseRam = sc.nextLine();
                switch (choiseRam) {
                    case "1":
                        choiseRam = "8";
                        map.put("ram", choiseRam);
                        Action(map);
                        break;

                    case "2":
                        choiseRam = "16";
                        map.put("ram", choiseRam);
                        Action(map);
                        break;
                    case "3":
                        choiseRam = "32";
                        map.put("ram", choiseRam);
                        Action(map);
                        break;
                    case "4":
                        choiseRam = "64";
                        map.put("ram", choiseRam);
                        Action(map);
                        break;
                }
                break;
            case 2:
                System.out.print("Доступные конфигурации жесткого диска:\n");
                System.out.println("1 - 256гб\n2 - 512гб\n3 - 1024гб\n4 - 2048гб");
                Scanner sc1 = new Scanner(System.in);
                String choiseHD = sc1.nextLine();
                switch (choiseHD) {
                    case "1":
                        choiseHD = "256";
                        map.put("hd", choiseHD);
                        Action(map);
                        break;
                    case "2":
                        choiseHD = "512";
                        map.put("hd", choiseHD);
                        Action(map);
                        break;
                    case "3":
                        choiseHD = "1024";
                        map.put("hd", choiseHD);
                        Action(map);
                        break;
                    case "4":
                        choiseHD = "2048";
                        map.put("hd", choiseHD);
                        Action(map);
                        break;
                }
                break;
            case 3:
                System.out.print("Доступные конфигурации ос:\n");
                System.out.println("1 - Windows\n2 - macOS");
                Scanner sc2 = new Scanner(System.in);
                String choiseOS = sc2.nextLine();
                switch (choiseOS) {
                    case "1":
                        choiseOS = "Windows";
                        map.put("OS", choiseOS);
                        Action(map);
                        break;
                    case "2":
                        choiseOS = "macOS";
                        map.put("OS", choiseOS);
                        Action(map);
                        break;
                }
                break;
            case 4:
                System.out.print("Доступные ценовые категории:\n");
                System.out.println(
                        "1 - 20 000 - 50 000\n2 - 50 000 - 100 000\n3 - от 100 000 - 150 000\n4 - от 150 000 - 200 000\n5 - от 200 000 и 500 000");
                Scanner sc3 = new Scanner(System.in);
                String choisePrice = sc3.nextLine();
                switch (choisePrice) {
                    case "1":
                        choisePrice = "20 000 - 50 000";
                        map.put("price", choisePrice);
                        Action(map);
                        break;
                    case "2":
                        choisePrice = "50 000 - 100 000";
                        map.put("price", choisePrice);
                        Action(map);
                        break;
                    case "3":
                        choisePrice = "100 000 - 150 000";
                        map.put("price", choisePrice);
                        Action(map);
                        break;
                    case "4":
                        choisePrice = "150 000 - 200 000";
                        map.put("price", choisePrice);
                        Action(map);
                        break;
                    case "5":
                        choisePrice = "200 000 - 500 000";
                        map.put("price", choisePrice);
                        Action(map);
                        break;
                }
                break;
            case 5:
                return map;
        }
        return map;
    }

    // Выводим выбранные параметры для поиска
    public static void PrintConfig(Map<String, String> map) {
        String delimetr = "--------------------";
        System.out.println(delimetr);
        System.out.println("Выбранные параметры: ");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println(delimetr);
    }

    // Стартовое приветсвие
    public static void HelloUser() {
        System.out.println("Привет, пользователь!");
        System.out.println("---------------------");
    }

    public static List<NoteBook> AddNoteBook(List<NoteBook> list) {
        NoteBook Huawei_MateBook = new NoteBook("Huawei", "D14NbD-WDI9", "Windows", 256, 8, 39999);
        NoteBook AsusFX504 = new NoteBook("Asus", "FX504GE-E4061T", "Windows", 512, 8, 79400);
        NoteBook MacBookAir = new NoteBook("Apple", "MGND3ZP/A", "macOS", 256, 8, 80740);
        NoteBook AcerNitro = new NoteBook("Acer", "AN515-57-57DF", "Windows", 512, 16, 65900);
        NoteBook XioamMiNotebook = new NoteBook("Xiaomi", "JYU4361CN", "Windows", 1024, 32, 168500);
        NoteBook MSI_GS66_Stealth = new NoteBook("MSI", "GS66_Stealth_12UHS-267RU", "Windows", 2048, 64, 275990);
        NoteBook MacBookPro = new NoteBook("Apple", "MNWA3LL/A", "macOS", 1024, 32, 498968);
        NoteBook MSI_Katana = new NoteBook("MSI", "GF76 11SC-853XRU", "Windows", 512, 16, 62990);
        NoteBook MacbookPro16 = new NoteBook("Apple", "MK183ZE/A", "macOS", 512, 16, 181770);
        list.add(Huawei_MateBook);
        list.add(AsusFX504);
        list.add(MacBookAir);
        list.add(AcerNitro);
        list.add(XioamMiNotebook);
        list.add(MSI_GS66_Stealth);
        list.add(MacBookPro);
        list.add(MSI_Katana);
        list.add(MacbookPro16);
        return list;
    }

    public static void selections(List<NoteBook> list, Map<String, String> map){
        int count = 0;
        // только по hd
        if (map.containsKey("hd") == true && map.containsKey("ram") == false && map.containsKey("OS") == false && map.containsKey("price") == false) {
            int hd = Integer.parseInt(map.get("hd"));
            for (var NoteBook : list) {
                if (NoteBook.hd == hd) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        //только по ram
        else if (map.containsKey("hd") == false && map.containsKey("ram") == true && map.containsKey("OS") == false && map.containsKey("price") == false) {
            int ram = Integer.parseInt(map.get("ram"));
            for (var NoteBook : list) {
                if (NoteBook.ram == ram) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // по hd и ram
        else if (map.containsKey("hd") == true && map.containsKey("ram") == true && map.containsKey("OS") == false && map.containsKey("price") == false) {
            int hd = Integer.parseInt(map.get("hd"));
            int ram = Integer.parseInt(map.get("ram"));
            for (var NoteBook : list) {
                if (NoteBook.hd == hd && NoteBook.ram == ram) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // hd ram price os
        else if (map.containsKey("hd") == true && map.containsKey("ram") == true && map.containsKey("OS") == true && map.containsKey("price") == true) {
            int ram = Integer.parseInt(map.get("ram"));
            int hd = Integer.parseInt(map.get("hd"));
            String OS = map.get("OS");
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            for (var NoteBook : list) {
                if (NoteBook.hd == hd && NoteBook.ram == ram && NoteBook.OS == OS && NoteBook.price > minPrice && NoteBook.price < maxPrice ) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // по hd и ram и OS
        else if (map.containsKey("hd") == true && map.containsKey("ram") == true && map.containsKey("OS") == true && map.containsKey("price") == false) {
            int hd = Integer.parseInt(map.get("hd"));
            int ram = Integer.parseInt(map.get("ram"));
            String OS = map.get("OS");
            for (var NoteBook : list) {
                if (NoteBook.hd == hd && NoteBook.ram == ram && NoteBook.OS == OS) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // ram price os
        else if (map.containsKey("hd") == false && map.containsKey("ram") == true && map.containsKey("OS") == true && map.containsKey("price") == true) {
            int ram = Integer.parseInt(map.get("ram"));
            String OS = map.get("OS");
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            for (var NoteBook : list) {
                if (NoteBook.ram == ram && NoteBook.OS == OS && NoteBook.price > minPrice && NoteBook.price < maxPrice ) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        //  hd ram price 
        else if (map.containsKey("hd") == true && map.containsKey("ram") == true && map.containsKey("OS") == false && map.containsKey("price") == true) {
            int ram = Integer.parseInt(map.get("ram"));
            int hd = Integer.parseInt(map.get("hd"));
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            for (var NoteBook : list) {
                if (NoteBook.ram == ram && NoteBook.hd == hd && NoteBook.price > minPrice && NoteBook.price < maxPrice ) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        //  hd  price OS 
        else if (map.containsKey("hd") == true && map.containsKey("ram") == false && map.containsKey("OS") == true && map.containsKey("price") == true) {
            int hd = Integer.parseInt(map.get("hd"));
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            String OS = map.get("OS");
            for (var NoteBook : list) {
                if (NoteBook.OS == OS && NoteBook.hd == hd && NoteBook.price > minPrice && NoteBook.price < maxPrice ) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // сортировка только по OS
        else if (map.containsKey("hd") == false && map.containsKey("ram") == false && map.containsKey("OS") == true && map.containsKey("price") == false) {
            String OS = map.get("OS");
            for (var NoteBook : list) {
                if (NoteBook.OS == OS) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // сортировка только по цене
        else if (map.containsKey("hd") == false && map.containsKey("ram") == false && map.containsKey("OS") == false && map.containsKey("price") == true) {
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]); 
            for (var NoteBook : list) {
                if (NoteBook.price > minPrice && NoteBook.price < maxPrice) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }

        // ram os
        else if (map.containsKey("hd") == false && map.containsKey("ram") == true && map.containsKey("OS") == true && map.containsKey("price") == false) {
            String OS = map.get("OS");
            int ram = Integer.parseInt(map.get("ram"));
            for (var NoteBook : list) {
                if (NoteBook.OS == OS && NoteBook.ram == ram) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // hd os
        else if (map.containsKey("hd") == true && map.containsKey("ram") == false && map.containsKey("OS") == true && map.containsKey("price") == false) {
            String OS = map.get("OS");
            int hd = Integer.parseInt(map.get("hd"));
            for (var NoteBook : list) {
                if (NoteBook.OS == OS && NoteBook.hd == hd) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }
        // hd price
        else if (map.containsKey("hd") == true && map.containsKey("ram") == false && map.containsKey("OS") == false && map.containsKey("price") == true) {
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            int hd = Integer.parseInt(map.get("hd"));
            for (var NoteBook : list) {
                if (NoteBook.hd == hd && NoteBook.price > minPrice && NoteBook.price < maxPrice) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        } 
        // ram price
        else if (map.containsKey("hd") == false && map.containsKey("ram") == true && map.containsKey("OS") == false && map.containsKey("price") == true) {
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            int ram = Integer.parseInt(map.get("ram"));
            for (var NoteBook : list) {
                if (NoteBook.ram == ram && NoteBook.price > minPrice && NoteBook.price < maxPrice) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }  
        // OS price 
        else if (map.containsKey("hd") == false && map.containsKey("ram") == false && map.containsKey("OS") == true && map.containsKey("price") == true) {
            String[] price = map.get("price").replace(" ", "").split("-");
            int minPrice = Integer.parseInt(price[0]);
            int maxPrice = Integer.parseInt(price[1]);
            String OS = map.get("OS");
            for (var NoteBook : list) {
                if (NoteBook.OS == OS && NoteBook.price > minPrice && NoteBook.price < maxPrice) {
                    count++;
                    System.out.println(NoteBook);
                }
            }
            if(count == 0) System.out.println("Сожалеем но ноутбука с такими параметрами нет.");
        }  
    }
}