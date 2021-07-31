import service.Barber;

public class demoClass {
    public static void main(String[] args)
    {
        try {
            Barber barberService = new Barber();
            barberService.start();
            barberService.addCustomer("Upen");
            barberService.addCustomer("Tom");
            barberService.addCustomer("Anthony");
            barberService.addCustomer("John");
            barberService.addCustomer("soo");
            barberService.addCustomer("see");
            Thread.sleep(6000);
            barberService.addCustomer("Nishad");
        }catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
