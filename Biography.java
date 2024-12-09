package Library;

public class Biography extends TextBook {
    
        String about;

        public String getAbout () {
            return this.about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public Biography() {
            super();
            about = "";
        }

        public Biography(String Title, int Year, double Price, String subject, String about) {
            super(Title, Year, Price, Subject);
            this.about = about;
        }

        public void print() {
            super.print();
            System.out.println("Tokoh: " + about);
    }
    
}
