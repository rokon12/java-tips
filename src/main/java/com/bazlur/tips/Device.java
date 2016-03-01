package com.bazlur.tips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Bazlur Rahman Rokon
 * @since 2/28/16.
 */
public class Device {

    public static final String[] FEATURES = {"F1", "F2", "F3", "F4", "F5", "F6"};
    public static final String[] NAMES = {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "D11", "D12"};

    private int id;
    private String name;
    private String[] features;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public static void main(String[] args) throws JsonProcessingException, JSONException {

        List<Device> devices = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < NAMES.length; i++) {
            Device device = new Device();
            device.setId(i);
            device.setName(NAMES[i]);

            device.setFeatures(new String[]{FEATURES[random.nextInt(3)], FEATURES[random.nextInt(3) + 3]});

            devices.add(device);
        }

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(devices);
        System.out.println(json);

        JSONObject deviceMap = new JSONObject();
        JSONArray array = new JSONArray();
        try {

            final int[] index = {0};

            devices.stream().forEach(device -> {
                JSONObject row = new JSONObject();
                try {
                    row.put("id", ++index[0]);
                    row.put("name", device.getName());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                boolean[] featureItems = getFeatureItems(device.getFeatures());
                for (int i = 0; i < featureItems.length; i++) {
                    try {
                        row.put(FEATURES[i], featureItems[i]);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                array.put(row);

            });
            deviceMap.put("@total", devices.size());
            deviceMap.put("deviceMap", array);

            JSONObject object = new JSONObject();
            object.put("deviceMaps", deviceMap);


            System.out.println(object.toString());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


            JSONObject featureMaps = new JSONObject();

            JSONArray array1 = new JSONArray();
            for (int i = 0; i < FEATURES.length; i++) {
                String feature = FEATURES[i];
                JSONObject row = new JSONObject();
                row.put("id", i);
                row.put("name", feature);
                int used = random.nextInt(10) + 1;
                row.put("used", used);
                int available = random.nextInt(10) + 1;
                row.put("available", available);
                row.put("total", (used + available));
                array1.put(row);
            }

            featureMaps.put("@total", devices.size());
            featureMaps.put("content", array1);

            JSONObject object2 = new JSONObject();
            object2.put("contents", featureMaps);

            System.out.println(object2.toString());

        } catch (JSONException e) {
        }
    }

    public static boolean[] getFeatureItems(String[] features) {
        boolean[] arr = new boolean[FEATURES.length];

        for (String feature : features) {
            int indexOf = Arrays.asList(FEATURES).indexOf(feature);
            arr[indexOf] = true;
        }

        return arr;
    }

    static class Item {
        String name;
        boolean[] features;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean[] getFeatures() {
            return features;
        }

        public void setFeatures(boolean[] features) {
            this.features = features;
        }
    }
}
