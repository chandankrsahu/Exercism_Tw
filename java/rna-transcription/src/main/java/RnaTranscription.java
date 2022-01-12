class RnaTranscription {

    String transcribe(String dnaStrand) {
        String st="";
        for(int i=0;i<dnaStrand.length();i++){
            char ch=dnaStrand.charAt(i);
            if(ch=='G')
                st+='C';
            else if(ch=='C')
                st+='G';
             else if(ch=='T')
                st+='A';
            else if(ch=='A')
                st+='U';
        }
        return st;
    }

}
