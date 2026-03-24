class IPaddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        IPaddress obj = new IPaddress();

        String input = "192.168.0.1";
        String result = obj.defangIPaddr(input);

        System.out.println("Original IP: " + input);
        System.out.println("Defanged IP: " + result);
    }
}