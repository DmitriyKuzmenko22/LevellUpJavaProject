
    public class Coin {

        private double weight;
        private double diameter;

        public Coin(final double weight, final double diameter) throws CoinLogicException {
            if(diameter < 0) throw new CoinLogicException();
            this.weight = weight;
            this.diameter = diameter;
        }
    }
