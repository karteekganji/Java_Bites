package Java.Miscellaneous;

public class Enums {

	// An enum is a special type of data type which is basically a collection
	// (set) of constants.

	public enum Directions {
		EAST, WEST, NORTH, SOUTH
	}

	public static class EnumDemoIfElse {
		public static void main(String args[]) {
			Directions dir = Directions.NORTH;
			if (dir == Directions.EAST) {
				System.out.println("Direction: East");
			} else if (dir == Directions.WEST) {
				System.out.println("Direction: West");
			} else if (dir == Directions.NORTH) {
				System.out.println("Direction: North");
			} else {
				System.out.println("Direction: South");
			}
		}
	}

	public static class EnumDemoSwitchCase {
		Directions dir;

		public EnumDemoSwitchCase(Directions dir) {
			this.dir = dir;
		}

		public void getMyDirection() {
			switch (dir) {
			case EAST:
				System.out.println("In East Direction");
				break;

			case WEST:
				System.out.println("In West Direction");
				break;

			case NORTH:
				System.out.println("In North Direction");
				break;

			default:
				System.out.println("In South Direction");
				break;
			}
		}

		public static void main(String[] args) {
			EnumDemoSwitchCase obj1 = new EnumDemoSwitchCase(Directions.EAST);
			obj1.getMyDirection();
			EnumDemoSwitchCase obj2 = new EnumDemoSwitchCase(Directions.SOUTH);
			obj2.getMyDirection();

			// Iterate through an Enum variable

			for (Directions dir : Directions.values()) {
				System.out.println(dir);
			}
		}
	}

	public enum EnumDemoMethods {
		EAST("E"), WEST("W"), NORTH("N"), SOUTH("S");
		/*
		 * Important Note: Must have semicolon at the end when there is a enum
		 * field or method
		 */
		private final String shortCode;

		EnumDemoMethods(String code) {
			this.shortCode = code;
		}

		public String getDirectionCode() {
			return this.shortCode;
		}
		
		public static void main(String[] args) {
			EnumDemoMethods dir = EnumDemoMethods.SOUTH;
			System.out.println(dir.getDirectionCode());
			EnumDemoMethods dir2 = EnumDemoMethods.EAST;
			System.out.println(dir2.getDirectionCode());
	}
		
	}
}
