
abstract class Lenkeliste <T> implements Liste <T> {

    protected Node fremst;
    protected Node sist;
    protected int stoerrelse = 0;

    public Lenkeliste() {
        this.fremst = null;
        this.sist = null;
        this.stoerrelse = 0;
    }

    protected class Node {
        T data;
        Node neste = null;
        Node forrige = null;

        public Node(T data){
            this.data = data;
        }

        public String toString() {
            return data.toString();
        }
    }

    public int stoerrelse() {
        return stoerrelse;
    }

    public boolean erListaTom(){
        return fremst == null;
    }

    public void leggTil (T x) {
        Node nyNode = new Node(x);

        if (erListaTom()) {
            fremst = nyNode;
        }
        else {
            sist.neste = nyNode;
            nyNode.forrige = sist;
        }
        sist = nyNode;
        stoerrelse++;
    }


    public T hent(){
        if (erListaTom()){
            throw new UgyldigListeindeks(0);
        }
        else {
            return fremst.data;
        }
        // return første element i lista
    }

    public T fjern() {
        Node node = fremst;

        if (erListaTom()){
            throw new UgyldigListeindeks(-1);
        }
        fremst = fremst.neste;
        if (fremst != null){
            fremst.forrige = null;
        }
        stoerrelse--;
        return node.data;
    }

}
