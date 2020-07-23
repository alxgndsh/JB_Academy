class Counter {



        private static int staticField;
        private int instanceField;

        public static void staticMethod() { staticField++; }

        public void instanceMethod() { staticField++; }

}