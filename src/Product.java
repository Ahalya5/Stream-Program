public class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;

        }


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int get() {
            return id;
        }

        public void setId(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }


}

