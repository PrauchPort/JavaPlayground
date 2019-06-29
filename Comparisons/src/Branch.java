
public class Branch  implements Comparable<Branch>{

	private String treeType;
	private double length;
	
	public Branch()
	{
		
	}
	
	public Branch(String treeType, double length) {
		this.treeType = treeType;
		this.length = length;
	}
	
	public String getTreeType() {
		return treeType;
	}
	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public int compareTo(Branch o) {
		if(this.getLength() > o.getLength())
			return 1;
		else if(this.getLength() < o.getLength())
			return -1;
		else
			return 0;
			
	}

	@Override
	public String toString() {
		return "Branch [treeType=" + treeType + ", length=" + length + "]";
	}
	
	
	
	
}
