public class MediaVoti {
    private double media;

    public MediaVoti(double[]a){
        double sum=0;
        for(int i= 0;i<a.length;i++){
            sum += a[i];

        }
        media = sum/a.length;
    }

    public double getMedia(){
        return media;
    }

}
