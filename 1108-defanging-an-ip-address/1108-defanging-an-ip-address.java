class Solution {
    public String defangIPaddr(String address) {
        String b=address.replace(".","[.]");
        return b;
    }
}