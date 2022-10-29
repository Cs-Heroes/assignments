package mutable;

public class example {

        private String s;
        example (String s){
            this.s=s;
            
        }
        public String getName(){
            return s;
        }
        public void setName(String coursename){
            this.s=coursename;
        }

    public static void main(String[] args) {
        example E=new example("Mutable");
        System.out.println(E.getName());
    }
}

