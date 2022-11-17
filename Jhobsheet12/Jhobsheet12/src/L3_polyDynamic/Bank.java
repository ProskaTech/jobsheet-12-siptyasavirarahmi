package L3_polyDynamic;
// Created by 21343015_Siptya Savira Rahmi
class Bank {
    float SukuBunga(){
        return 0;
    }
}

class BRI extends Bank{
    float SukuBunga(){
        return  5.5f;
    }
}

class BNI extends Bank{
    float SukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    float SukuBunga(){
        return 0.4f;
    }
}

class polyDynamic {
        public static void main(String[] args) {
            Bank B;
    
            B = new BRI();
            System.out.println("tingkat suku bunga BRI adalah: "+B.SukuBunga());
        
            B = new BNI();
            System.out.println("tingkat suku bunga BNI adalah : "+B.SukuBunga());
        
            B = new Mandiri();
            System.out.println("tingkat suku bunga Mandiri adalah : "+B.SukuBunga());
    
        }
}