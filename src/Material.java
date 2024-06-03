enum Material implements IMaterial {
    GOLD(19.28),
    TITAN(4.54),
    silbe(10.49),
    plati(21.45),
    Blei(11.34);

     Material (double dichte) {
     this.dichte = dichte;

     }


        public double dichte;
        public double getDichte () {
        return dichte;
    }
}
