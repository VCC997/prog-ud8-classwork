package actividad9;

public enum Color {

    RED{
        public String toString(){
            return "\u001B[30m";
        }
    },
    GREEN{
        public String toString(){
            return "\u001B[32m";
        }
    },
    BLACK{
        public String toString(){
            return "\u001B[30m";
        }
    },
    YELLOW{
        public String toString(){
            return "\u001B[31m";
        }
    };
}
