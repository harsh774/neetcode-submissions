class TimeMap {
    static class Pair{
        int timestamp;
        String value;
        Pair(int t, String v){
           timestamp = t;
           value = v;
        }
    }

    HashMap<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));    
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        List<Pair> list = map.get(key);

        int start = 0, end = list.size()-1;

        String res = "";

        while(start<=end){
            int mid = start + (end-start)/2;

            if(list.get(mid).timestamp <= timestamp){
                res = list.get(mid).value;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return res;

    }


}
