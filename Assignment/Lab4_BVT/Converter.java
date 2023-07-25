package main;

public class Converter {

	private final boolean intflight; //true = international flight, false = domestic flight
	private final int flightClass; //1 = 1st class, 2 = business class, 3 = economy
	private final int royalty; //1 = platinum, 2 = gold, 3 = silver, 0 = not a member
	
	
	public Converter(boolean intflight, int flightclass, int royalty) {
		this.intflight = intflight;
		this.flightClass = flightclass;
		this.royalty = royalty;
	}
	
	public enum SizeInKilo {
		XS, S, M, L, XL;
		
		public String getSize() {
			switch(this) {
			case XS:
				return "7 kg";
			case S:
				return "15 kg";
			case M:
				return "23 kg";
			case L:
				return "32 kg";
			case XL:
				return "40 kg";
			default:
				return null;
			}
		}
	}
	
	public SizeInKilo convert() {
		
		if (royalty == 0) {
			if ((intflight) && (flightClass == 3)) {
				return SizeInKilo.M;
			}
			else if ((intflight) && (flightClass == 2)) {
				return SizeInKilo.L;
			}
			else if ((intflight) && (flightClass == 1)) {
				return SizeInKilo.XL;
			}
			else if ((!intflight) && (flightClass == 3)) {
				return SizeInKilo.XS;
			}
			else if ((!intflight) && (flightClass == 2)) {
				return SizeInKilo.S;
			}
			else
				return SizeInKilo.XS;
		}
		else if (royalty == 1) {
			if ((intflight) && (flightClass == 3)) {
				return SizeInKilo.L;
			}
			else if ((intflight) && (flightClass == 2)) {
				return SizeInKilo.XL;
			}
			else if ((intflight) && (flightClass == 1)) {
				return SizeInKilo.XL;
			}
			else if ((!intflight) && (flightClass == 3)) {
				return SizeInKilo.M;
			}
			else if ((!intflight) && (flightClass == 2)) {
				return SizeInKilo.L;
			}
			else
				return SizeInKilo.S;
		}
		else if (royalty == 2) {
			if ((intflight) && (flightClass == 3)) {
				return SizeInKilo.L;
			}
			else if ((intflight) && (flightClass == 2)) {
				return SizeInKilo.L;
			}
			else if ((intflight) && (flightClass == 1)) {
				return SizeInKilo.XL;
			}
			else if ((!intflight) && (flightClass == 3)) {
				return SizeInKilo.M;
			}
			else if ((!intflight) && (flightClass == 2)) {
				return SizeInKilo.L;
			}
			else
				return SizeInKilo.M;
		}
		else if (royalty == 3) {
			if ((intflight) && (flightClass == 3)) {
				return SizeInKilo.M;
			}
			else if ((intflight) && (flightClass == 2)) {
				return SizeInKilo.L;
			}
			else if ((intflight) && (flightClass == 1)) {
				return SizeInKilo.XL;
			}
			else if ((!intflight) && (flightClass == 3)) {
				return SizeInKilo.S;
			}
			else if ((!intflight) && (flightClass == 2)) {
				return SizeInKilo.M;
			}
			else
				return SizeInKilo.L;
		}
		else
			return SizeInKilo.XS;
	}
	
	public String showResult(SizeInKilo size) {
		return size.getSize();
	}

}
