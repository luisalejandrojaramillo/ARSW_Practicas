public class Anagram {
    public String comparation (String x, String y){
        String palabraUno = x.toLowerCase();
        String palabraDos = y.toLowerCase();
        if(x.length()==y.length()){
            for(int i=0;i<x.length();i++){
                if(!palabraDos.contains(String.valueOf(palabraUno.charAt(i)))){
                    return "Not Anagrams";
                }else{
                    return "Anagrams";
                }
            }
        }else{
            return "Not Anagrams";
        }
        return "Not Anagrams";
    }
}
