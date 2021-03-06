/**
 * This is the Material class. Every material has a cost and material type associated with it, and every
 * project is made up of a variety of materials.
 * 
 * @author Gavin
 */
package model;

/**
 * Contains the Material class.
 * @author Gavin Montes
 */
public class Material {
	/** The cost of the material. */
	private double myCost;

	/** The name of the material. */
	private String myMaterialType;

	/**
	 * Constructor to initialize the fields of the Material. Every material has a
	 * type and cost associated with it.
	 * @author Gavin Montes
	 * @param type the kind of material
	 * @param cost the cost of the material
	 */
	public Material(String type, double cost) {
		myMaterialType = type;
		myCost = cost;
	}

	/**
	 * Getter for the material type.
	 * @author Gavin Montes
	 * @return myMaterialType the identifier (name) of this material.
	 */
	public String getName() {
		return myMaterialType;
	}

	/**
	 * Getter for the cost.
	 * @author Gavin Montes
	 * @return myCost the cost of this material.
	 */
	public double getCost() {
		return myCost;
	}
	/**
	 * @author Gavin Montes
	 * Returns a string representation of this material
	 */
	public String toString() {
		return "$" + Double.toString(getCost()) + "\t" + getName();
	}
}
