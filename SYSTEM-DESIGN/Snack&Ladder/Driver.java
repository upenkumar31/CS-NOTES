import service.SnackLadderService;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        SnackLadderService snackLadderService = new SnackLadderService(2,1);
        snackLadderService.start();
    }
}
