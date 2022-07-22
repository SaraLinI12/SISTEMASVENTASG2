
public class TransformadasM {
    
public static String[][] transformada06(int dimen, int numinit) {
        String[][] matrizR = new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j = 0; j<=i ; j++) {        
                matrizR[i][j]=""+numinit;
                numinit++;      
        }
    }
    return matrizR;
} 
public static String[][] transformada07(int dimen, int numinit) {
        String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =0; j<=(matrizR.length-1)-i; j++) {        
                    matrizR[i][j]=""+numinit;
                    numinit++;      
            }
        }
    return matrizR;
}
public static String[][] transformada08(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =i; j< matrizR[i].length; j++) {        
                matrizR[i][j]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada09(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j = (matrizR[0].length-1)-i; j<=matrizR[0].length-1; j++) {        
                matrizR[i][j]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada11(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =(matrizR.length-1)-i; j>=0; j--) {        
                matrizR[i][j]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada12(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =(matrizR[i].length-1); j>=i; j--) {        
                matrizR[i][j]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada13(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =0; i<=(matrizR.length-1)-j; j++) {        
                matrizR[j][i]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada14(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j = 0; j<=i ; j++) {        
                matrizR[j][i]=""+numinit;
                numinit++;      
        }
    }
    return matrizR;
}
public static String[][] transformada15(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =0; i<=(matrizR.length-1)-j; j++) {        
                matrizR[(dimen-1)-j][i]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
} 
public static String[][] transformada16(int dimen, int numinit) {
    String[][] matrizR = new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j = 0; j<=i ; j++) {        
                matrizR[(dimen-1)-j][i]=""+numinit;
                numinit++;      
        }
    }
    return matrizR;

} 
public static String[][] transformada17(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =0; i<=(matrizR.length-1)-j; j++) {        
                matrizR[j][(dimen-1)-i]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada19(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = 0; i < matrizR.length; i++) {
        for (int j =0; i<=(matrizR.length-1)-j; j++) {        
                matrizR[(dimen-1)-j][(dimen-1)-i]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada20(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = -1; i < matrizR.length; i++) {
        for (int j = 0; j<=i ; j++) {        
                matrizR[(dimen-1)-j][(dimen-1)-i]=""+numinit;
                numinit++;      
        }
    }
        return matrizR;
}
public static String[][] transformada22(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int c = 0; c < matriz[0].length; c++) {
        if (c % 2 == 0) {
            for (int f = matriz.length - 1; f >= 0; f--) {
                matriz[f][c] = "" + numinit;
                numinit = numinit + 1;
            }
        } else {
            for (int f = 0; f < matriz.length; f++) {
                matriz[f][c] = "" + numinit;
                numinit = numinit + 1;
            }
        }

    }
    return matriz;
}
public static String[][] transformada25(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int j = 0; j<matrizR[0].length ; j++) { 
        if(j%2==0){
            for (int i =0; i <matrizR.length; i++) {             
                matrizR[j][i]=""+numinit;
                numinit++;      
            }
        } else{
            for (int i =(matrizR.length-1); i >=0; i--) {             
                matrizR[j][i]=""+numinit;
                numinit++;      
            }
        }
    }
        return matrizR;
} 
public static String[][] transformada26(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int j = 0; j<matrizR[0].length ; j++) { 
        if(j%2==0){
            for (int i =(matrizR.length-1); i >=0; i--) {             
                matrizR[j][i]=""+numinit;
                numinit++;      
            }
         
        } else{
            for (int i =0; i <matrizR.length; i++) {             
                matrizR[j][i]=""+numinit;
                numinit++;      
            }
        }
    }
        return matrizR;
} 
public static String[][] transformada27(int dimen, int numinit) {
    String[][] matrizR=new String[dimen][dimen];
    for (int i = (matrizR.length-1); i>=0 ; i--) { 
        if(i%2==0){
            for (int j =(matrizR.length-1); j >=0; j--) {             
                matrizR[i][j]=""+numinit;
                numinit++;      
            }
          
        } else{
            for (int j =0; j <matrizR.length; j++) {             
                matrizR[i][j]=""+numinit;
                numinit++;      
            }
        }
    }
        return matrizR;
}
public static String[][] transformada29(int dimen, int numinit) {
    String[][] matriz=new String[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=v;ls<dimen-1-v; ls++){
            matriz[v][ls]=""+numinit;
            numinit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][dimen-1-v]=""+numinit;
            numinit++;            
        }        
        for(int li=dimen-1-v;li>v; li--){
            matriz[dimen-1-v][li]=""+numinit;
            numinit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][v]=""+numinit;
            numinit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=""+numinit;
    }
        return matriz;
}
public static String[][] transformada30(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = 0; v < dimen / 2; v++) {
        for (int ld = v; ld < dimen - 1 - v; ld++) {
            matriz[ld][dimen - 1 - v] = "" + numinit;
            numinit++;
        }
        for (int lin = dimen - 1 - v; lin > v; lin--) {
            matriz[dimen - 1 - v][lin] = "" + numinit;
            numinit++;
        }
        for (int liz = dimen - 1 - v; liz > v; liz--) {
            matriz[liz][v] = "" + numinit;
            numinit++;
        }
        for (int ls = v; ls < dimen - 1 - v; ls++) {
            matriz[v][ls] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static String[][] transformada31(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = 0; v < dimen / 2; v++) {

        for (int lin = dimen - 1 - v; lin > v; lin--) {
            matriz[dimen - 1 - v][lin] = "" + numinit;
            numinit++;
        }
        for (int liz = dimen - 1 - v; liz > v; liz--) {
            matriz[liz][v] = "" + numinit;
            numinit++;
        }
        for (int ls = v; ls < dimen - 1 - v; ls++) {
            matriz[v][ls] = "" + numinit;
            numinit++;
        }
        for (int ld = v; ld < dimen - 1 - v; ld++) {
            matriz[ld][dimen - 1 - v] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static String[][] transformada32(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = 0; v < dimen / 2; v++) {

        for (int liz = dimen - 1 - v; liz > v; liz--) {
            matriz[liz][v] = "" + numinit;
            numinit++;
        }
        for (int ls = v; ls < dimen - 1 - v; ls++) {
            matriz[v][ls] = "" + numinit;
            numinit++;
        }
        for (int ld = v; ld < dimen - 1 - v; ld++) {
            matriz[ld][dimen - 1 - v] = "" + numinit;
            numinit++;
        }
        for (int lin = dimen - 1 - v; lin > v; lin--) {
            matriz[dimen - 1 - v][lin] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static String[][] transformada33(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
        for (int ls = v; ls > (dimen - 1) - v; ls--) {
            matriz[(dimen - 1) - v][ls] = "" + numinit;
            numinit++;
        }
        for (int liz = (dimen - 1) - v; liz < v; liz++) {
            matriz[liz][(dimen - 1) - v] = "" + numinit;
            numinit++;
        }
        for (int lin = (dimen - 1) - v; lin < v; lin++) {
            matriz[v][lin] = "" + numinit;
            numinit++;
        }
        for (int ld = v; ld > (dimen - 1) - v; ld--) {
            matriz[ld][v] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static String[][] transformada34(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {

        for (int liz = (dimen - 1) - v; liz < v; liz++) {
            matriz[liz][(dimen - 1) - v] = "" + numinit;
            numinit++;
        }
        for (int lin = (dimen - 1) - v; lin < v; lin++) {
            matriz[v][lin] = "" + numinit;
            numinit++;
        }
        for (int ld = v; ld > (dimen - 1) - v; ld--) {
            matriz[ld][v] = "" + numinit;
            numinit++;
        }
        for (int ls = v; ls > (dimen - 1) - v; ls--) {
            matriz[(dimen - 1) - v][ls] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static String[][] transformada36(int dimen, int numinit) {
    String[][] matriz = new String[dimen][dimen];
    for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {

        for (int ld = v; ld > (dimen - 1) - v; ld--) {
            matriz[ld][v] = "" + numinit;
            numinit++;
        }
        for (int ls = v; ls > (dimen - 1) - v; ls--) {
            matriz[(dimen - 1) - v][ls] = "" + numinit;
            numinit++;
        }
        for (int liz = (dimen - 1) - v; liz < v; liz++) {
            matriz[liz][(dimen - 1) - v] = "" + numinit;
            numinit++;
        }
        for (int lin = (dimen - 1) - v; lin < v; lin++) {
            matriz[v][lin] = "" + numinit;
            numinit++;
        }
    }
    if (dimen % 2 != 0) {
        matriz[dimen / 2][dimen / 2] = "" + numinit;
    }
    return matriz;
}
public static void imprimirMatriz(String[][] matriz) {
    for (int f = 0; f < matriz.length; f++) {
        for (int c = 0; c < matriz[0].length; c++) {
            if(matriz[f][c]!=null && !matriz[f][c].equals("")){
                System.out.print(matriz[f][c]+"\t");
            }else{
                System.out.print("\t");
            }            
        }
        System.out.println("");
    } 
 }
public static void main(String[] args) {
    imprimirMatriz(transformada06(5, 0));
    System.out.println("");
    imprimirMatriz(transformada07(5, 0));
    System.out.println("");
    imprimirMatriz(transformada08(5, 0));
    System.out.println("");
    imprimirMatriz(transformada09(5, 0));
    System.out.println("");
    imprimirMatriz(transformada11(5, 0));
    System.out.println("");
    imprimirMatriz(transformada12(5, 0));
    System.out.println("");
    imprimirMatriz(transformada13(5, 0)); 
    System.out.println("");
    imprimirMatriz(transformada14(5, 0));
    System.out.println("");
    imprimirMatriz(transformada15(5,0 ));
    System.out.println("");
    imprimirMatriz(transformada16(5, 0));
    System.out.println("");
    imprimirMatriz(transformada17(5, 0));
    System.out.println("");
    imprimirMatriz(transformada19(5, 0));
    System.out.println("");
    imprimirMatriz(transformada20(5, 0));
    System.out.println("");
    imprimirMatriz(transformada22(5, 0));
    System.out.println("");
    imprimirMatriz(transformada25(5, 0));
    System.out.println("");
    imprimirMatriz(transformada26(5, 0));
    System.out.println("");
    imprimirMatriz(transformada27(5, 0));
    System.out.println("");
    imprimirMatriz(transformada29(5, 0));
    System.out.println("");
    imprimirMatriz(transformada30(5, 0));
    System.out.println("");
    imprimirMatriz(transformada31(5, 0));
    System.out.println("");
    imprimirMatriz(transformada32(5, 0));
    System.out.println("");
    imprimirMatriz(transformada33(5, 0));
    System.out.println("");
    imprimirMatriz(transformada34(5, 0));
    System.out.println("");
    imprimirMatriz(transformada36(5, 0));
    System.out.println("");


}

}
