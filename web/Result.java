package web;

public class Result{
        private String name;
        private String price;
        private String vendor;
        public Result(String name,String price,String vendor){
            this.name=name;
            this.price=price;
            this.vendor=vendor;
        }

        public String getName(){
            return name;
        }

        public String getPrice(){
            return price;
        }

        public String getVendor(){
            return vendor;
        }

    }

