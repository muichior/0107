package pet_1111410053;

public class Puppy {

 private String PuppyName;  
 private String PuppyType; 
 private String PuppyColor; 
 private String PuppyGender;
 static final String[]Citmes={"洗澡","修指","理毛","大美容","中美容"}; 
 static final double[]Cprice={600,200,300,1000,750};
 Puppy() {}
 Puppy(String PuppyName) 
      {
	 this.setPuppyName(PuppyName);
      }
 Puppy(String PuppyName,String PuppyType, String PuppyColor)
      {
	 this(PuppyName);
	 this.setPuppyType(PuppyType);
	 this.setPuppyColor(PuppyColor);	     
      }

 public double check(double ... shopping)
 {
	 double RtnValue=0;
	 for(var EachIndex : shopping )
	 {
     if (EachIndex>this.Citmes.length ||EachIndex <0)
    	 return -1;
	 }
	 for(var EachIndex : shopping )
		 RtnValue+= Cprice[(int)EachIndex];
	 System.out.printf("%s消費明細%n",this.getPuppyName());
	 System.out.printf("*****************%n");
	 int Seriano=0;
	 for(var EachIndex : shopping )
	 {
		 Seriano++;
		 System.out.printf("%d %s %8.2f%n",Seriano,Citmes[(int)EachIndex],Cprice[(int)EachIndex]);
	 }
	 System.out.printf("*****************%n");
	 return RtnValue;
 }  
    public String getPuppyName() {
		return PuppyName;
	}
	public void setPuppyName(String puppyName) {
		PuppyName = puppyName;
	}
	public String getPuppyType() {
		return PuppyType;
	}
	public void setPuppyType(String puppyType) {
		PuppyType = puppyType;
	}
	public String getPuppyColor() {
		return PuppyColor;
	}
	public void setPuppyColor(String puppyColor) {
		PuppyColor = puppyColor;
	}
	public String getPuppyGender() {
		return PuppyGender;
	}
	public void setPuppyGender(String puppyGender) {
		PuppyGender = puppyGender;
	}
       
       
}
