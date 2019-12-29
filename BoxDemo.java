public class Box {
   private float width;
   private float height;
   private float lenght;


    Box(float w,float h,float l){
         width = w;
        height = h ;
        lenght = l;

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float w) {
         width = w;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float h) {
       height = h;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float l) {
       lenght = l;
    }
    float getVolume(){
        return width*height*lenght;
    }
    float getArea(){
        return  width*height;
    }

}
class BoxDemo{
    public  static void main(String args[]){
        Box box = new Box(2.2f,5.5f,5.9f);

      /*box.setWidth((float) 25.5);
      box.setHeight((float) 5.5);
      box.setLenght((float) 27.2);*/
      System.out.println("The volume is :" + box.getVolume());
        System.out.println("The area is :" + box.getArea());
    }


}


