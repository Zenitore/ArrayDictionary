public class ArrayDictionaryDriver {
    public static void main(String[] args) {
        ArrayDictionary<String, Integer> d = new ArrayDictionary<>();
        d.put("Ur Mom is extremely kind",6);
        d.put("Ahmeds Mom is very nice",8);
        d.put("Luke is kinda cool", 9);
        System.out.println(d.keys());
        System.out.println(d.values());
        System.out.println(d.size());
        System.out.println(d.remove("Ahmeds Mom is very nice"));
        System.out.println(d.keys());
        System.out.println(d.values());
        System.out.println(d.size());
        System.out.println(d.get("Luke is kinda cool"));
        System.out.println(d.get("MAN I LOVE THIS CLAAAASSSSS"));
        System.out.println(d.remove("Luke is kinda cool"));
        System.out.println(d.remove("Ur Mom is extremely kind"));
        System.out.println(d.isEmpty());
    }
}

