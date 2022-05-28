package GOJ.Netsed.Static;

public class OuterOfStatic {
    static class StaticNested {
        private int value=0;
        public int getValue() {
            return this.value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
