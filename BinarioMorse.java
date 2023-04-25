import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class BinarioMorse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner scan_morse = new Scanner(System.in);

        Scanner scan_binario = new Scanner(System.in);
        int Loop = 1;


        // Valor em BINÁRIO de cada caractere
        Map<Character, String> valor = new HashMap<Character, String>();
        valor.put('a', "01100001");  valor.put('A', "01000001"); 
        valor.put('b', "01100010");  valor.put('B', "01000010");
        valor.put('c', "01100011");  valor.put('C', "01000011");
        valor.put('d', "01100100");  valor.put('D', "01000100");
        valor.put('e', "01100101");  valor.put('E', "01000101");
        valor.put('f', "01100110");  valor.put('F', "01000110");
        valor.put('g', "01100111");  valor.put('G', "01000111");
        valor.put('h', "01101000");  valor.put('H', "01001000");
        valor.put('i', "01101001");  valor.put('I', "01001001");
        valor.put('j', "01101010");  valor.put('J', "01001010");
        valor.put('k', "01101011");  valor.put('K', "01001011");
        valor.put('l', "01101100");  valor.put('L', "01001100");
        valor.put('m', "01101101");  valor.put('M', "01001101");
        valor.put('n', "01101110");  valor.put('N', "01001110");
        valor.put('o', "01101111");  valor.put('O', "01001111");
        valor.put('p', "01110000");  valor.put('P', "01010000");
        valor.put('q', "01110001");  valor.put('Q', "01010001");
        valor.put('r', "01110010");  valor.put('R', "01010010");
        valor.put('s', "01110011");  valor.put('S', "01010011");
        valor.put('t', "01110100");  valor.put('T', "01010100");
        valor.put('u', "01110101");  valor.put('U', "01010101");
        valor.put('v', "01110110");  valor.put('V', "01010110");
        valor.put('w', "01110111");  valor.put('W', "01110111");
        valor.put('x', "01111000");  valor.put('X', "01011000");
        valor.put('y', "01111001");  valor.put('Y', "01011001");
        valor.put('z', "01111010");  valor.put('Z', "01011010");


        // Números
        valor.put('0', "00110000");  valor.put('1', "00110001");
        valor.put('2', "00110010");  valor.put('3', "00110011");
        valor.put('4', "00110100");  valor.put('5', "00110101");
        valor.put('6', "00110110");  valor.put('7', "00110111");
        valor.put('8', "00111000");  valor.put('9', "00111001");


        // Especiais
        valor.put('?', "00111111");  valor.put('!', "00100001");
        valor.put('.', "00101110");  valor.put('@', "01000000");
        valor.put('(', "00101000");  valor.put(')', "00101001");


        // Valor em MORSE de cada caractere
        Map<Character, String> Mvalor = new HashMap<Character, String>();
        Mvalor.put('a',   ".-");  
        Mvalor.put('b', "-...");
        Mvalor.put('c', "-.-.");
        Mvalor.put('d',  "-.."); 
        Mvalor.put('e',    "."); 
        Mvalor.put('f', "..-.");
        Mvalor.put('g',  "--."); 
        Mvalor.put('h', "....");
        Mvalor.put('i',   ".."); 
        Mvalor.put('j', ".---");
        Mvalor.put('k',  "-.-"); 
        Mvalor.put('l', ".-..");
        Mvalor.put('m',   "--"); 
        Mvalor.put('n',   "-."); 
        Mvalor.put('o',  "---"); 
        Mvalor.put('p', ".--.");
        Mvalor.put('q', "--.-");
        Mvalor.put('r',  ".-."); 
        Mvalor.put('s',  "..."); 
        Mvalor.put('t',    "-");
        Mvalor.put('u',  "..-"); 
        Mvalor.put('v', "...-");
        Mvalor.put('w',  ".--"); 
        Mvalor.put('x', "-..-");
        Mvalor.put('y', "-.--");
        Mvalor.put('z', "--..");
/* 
        HashMap<String, String> Pvalor = new HashMap<>();
        Pvalor.put(".-",    "a");
        Pvalor.put("-...",  "b");
        Pvalor.put("-.-.",  "c");
        Pvalor.put("-..",   "d"); 
        Pvalor.put(".",     "e");
        Pvalor.put("..-.",  "f");
        Pvalor.put("--.",   "g");
        Pvalor.put("....",  "h");
        Pvalor.put("..",    "i");
        Pvalor.put(".---",  "j");
        Pvalor.put("-.-",   "k");
        Pvalor.put(".-..",  "l");
        Pvalor.put("--",    "m");
        Pvalor.put("-.",    "n");
        Pvalor.put("---",   "o");
        Pvalor.put(".--.",  "p");
        Pvalor.put("--.-",  "q");
        Pvalor.put(".-.",   "r");
        Pvalor.put("...",   "s");
        Pvalor.put("-",     "t");
        Pvalor.put("..-",   "u");
        Pvalor.put("...-",  "v");
        Pvalor.put(".--",   "w");
        Pvalor.put("-..-",  "x");
        Pvalor.put("-.--",  "y");
        Pvalor.put("--..",  "z");
        Pvalor.put(".----", "1");
        Pvalor.put("..---", "2");
        Pvalor.put("...--", "3");
        Pvalor.put("....-", "4");
        Pvalor.put(".....", "5");
        Pvalor.put("-....", "6");
        Pvalor.put("--...", "7");
        Pvalor.put("---..", "8");
        Pvalor.put("----.", "9"); 
        Pvalor.put("-----", "0"); 
*/
        // Menu
        while (Loop == 1) {
        System.out.println("Escolhe ae:");
        System.out.println("[1] Binário");
        System.out.println("[2] Morse");
        System.out.println("[3] Sair");
        byte menu = input.nextByte();
        
        switch(menu) {
            // Binário
            case 1:
                System.out.println("[1] Binário ---> Texto");
                System.out.println("[2] Texto --> Binário");
                System.out.println("[3] Voltar");
                byte binario_menu = input.nextByte();
                    
                    switch(binario_menu) {
                        case 1:
                            System.out.println("Cola o BINÁRIO ae: ");
                            String binario = scan_binario.nextLine();

                            String[] partes = binario.split(" ");
                            StringBuilder texto = new StringBuilder();

                            for (String parte: partes) {
                                int codigo = Integer.parseInt(parte,2);
                                char caractere = (char) codigo;
                                texto.append(caractere);
                            }
                            System.out.println("----------");
                            System.out.println("Seu BINÁRIO convertido em TEXTO: " + "\n");
                            System.out.println("\t" + texto.toString());
                            System.out.println("----------");
                        
                        break;
                        case 2:
                            System.out.println("Cola o TEXTO ae: ");
                            String txt_binario = scan_binario.nextLine();

                            String[] palavras = txt_binario.split("\\s+"); // Divide o texto em palavras separadas por espaços em branco
                            StringBuilder binarioTexto = new StringBuilder();
                            for (String palavra : palavras) {
                               for (char letra : palavra.toCharArray()) {
                                   String valorBinario = valor.get(letra);
                                   if (valorBinario != null) {
                                       binarioTexto.append(valorBinario + " ");
                                   }
                               }
                               binarioTexto.append("00100000 "); // Adiciona um espaço em branco após cada palavra
                            }
                            System.out.println("----------");
                            System.out.println("Seu TEXTO convertido em BINÁRIO: " + "\n");
                            System.out.println(binarioTexto.toString());
                            System.out.println("----------");

                        case 3:
                        continue;    
                    }

            // Morse        
            break;
            case 2:
                System.out.println("[1] Morse ---> Texto");
                System.out.println("[2] Texto --> Morse");
                System.out.println("[3] Voltar");
                byte morse_menu = input.nextByte();

                    switch(morse_menu){
                        case 1:
                            System.out.println("Cola o MORSE ae: ");
                            String morse = scan_morse.nextLine();

                            System.out.println("dps eu arrumo");
                            
                        case 2:
                            System.out.println("Cola o TEXTO ae: ");
                            String txt_morse = scan_morse.nextLine();

                            String[] palavras = txt_morse.split("\\s+"); // Divide o texto em palavras separadas por espaços em branco
                            StringBuilder morseTexto = new StringBuilder();
                            for (String palavra: palavras) {
                               for (char letra : palavra.toCharArray()) {
                                   String valorMORSE = Mvalor.get(letra);
                                   if (valorMORSE != null) {
                                       morseTexto.append(valorMORSE + " ");
                                   }
                               }
                               morseTexto.append("/ "); // Adiciona um espaço em branco após cada palavra
                            }
                            System.out.println("----------");
                            System.out.println("Seu TEXTO convertido em MORSE: " + "\n");
                            System.out.println(morseTexto.toString());
                            System.out.println("----------");

                        case 3:
                            continue;
                    }
            
            // Sair
            case 3:
                input.close();
                scan_morse.close();
                scan_binario.close();
                System.out.println("Saindo...");
                System.exit(0);  
        }
    }

    }
}



