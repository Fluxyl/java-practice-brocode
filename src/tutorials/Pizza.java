package tutorials;

public class Pizza {
    
    String flavor;
    String size;
    int slices;
    boolean prevCustomer;
    int[] pizzaSliceGuide = {4, 8, 12};

    Pizza(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
        this.slices = sizeToSlices(size);
    }

    Pizza(String flavor, String size, boolean prevCustomer) {
        this.flavor = flavor;
        this.size = size;
        this.prevCustomer = prevCustomer;
        this.slices = sizeToSlices(size);
    }

    int sizeToSlices(String size) {
        switch (size.toLowerCase()) {
            case "small":
                return(4);
        
            case "medium":
                return(8);
        
            case "large":
                return(12);
        
            default:
                System.out.println("ERROR CALCULATING SLICES");
                return(0);
        }
    }
}
