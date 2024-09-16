package practice;

public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }
    
    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
    	double value=0;
    	switch (discountType) {
		case Seasonal: {
			if(cartWeight>10)
			   value =totalPrice- 18;
			return value;
		}
		case Standard:{
			if(cartWeight<=10)
				   value =totalPrice-6;
			return value;
		}
		case Weight:{
			       value =totalPrice- 12;
				   return value;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + discountType);
		}
        
    }
    
    public static void main(String[] args) {        
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}
