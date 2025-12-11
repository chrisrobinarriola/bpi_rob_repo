package bpi.training;

public class Main {

	public static void main(String[] args) {
        Executable excel = new MSExcel();
        Executable word = new MSWord();
 
        runExe(excel);
        runExe(word);
 
        stopExe(excel);
        stopExe(word);
    }
 
    private static void runExe(Executable exe) {
        exe.run();
    }
 
    private static void stopExe(Executable exe) {
        exe.stop();
    }

}
