 public class CityNode {

     private City data;
     private CityNode link;

     public CityNode(City newData, CityNode newLink) {
        setData(newData);
        setLink(newLink);
     }
     
     /** 
      * @return City
      */
     public City getData(){
         return data;
     }

     
     /** 
      * @param newData
      */
     public void setData(City newData){
        data = newData;
     }

     
     /** 
      * @return CityNode
      */
     public CityNode getLink(){
         return link;
     }

     
     /** 
      * @param newLink
      */
     public void setLink(CityNode newLink){
         link = newLink;
     }

     
     /** 
      * @param newNode
      */
     public void addNodeAfter(CityNode newNode){
         if(this.getLink() != null){
             CityNode pointer = this.getLink();
             this.setLink(newNode);
             newNode.setLink(pointer);
         }else
            this.setLink(newNode);
     }

     public void removeAfter(){
         if(this.getLink().getLink() != null)
            this.setLink(this.getLink().getLink());
        else
            this.setLink(null);
     }
 }