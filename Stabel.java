class Stabel <T> extends Lenkeliste <T> {

    public void leggTil(T x) {
        Node ny = new Node(x);
        ny.neste = fremst;
        fremst = ny;
        stoerrelse += 1;
    }

}
