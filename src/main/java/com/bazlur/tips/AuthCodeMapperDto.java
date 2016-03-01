package com.bazlur.tips;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 2/27/16.
 */

@JsonRootName("authCodeMap")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthCodeMapperDto {

    private Boolean success = Boolean.TRUE;
    private String authCode;
    private String feature;
    private String device;
    private int id ;
    private Boolean leaf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("children")
    private List<AuthCodeMapperDto> children = new ArrayList<AuthCodeMapperDto>();

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public List<AuthCodeMapperDto> getChildren() {
        return children;
    }

    public void setChildren(List<AuthCodeMapperDto> children) {
        this.children = children;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public static void main(String[] args) throws IOException {
        AuthCodeMapperDto root = new AuthCodeMapperDto();
        root.setSuccess(Boolean.TRUE);
        root.setAuthCode("1");
        root.setFeature("F1");
        root.setDevice("D2");
        root.setId(1);


        AuthCodeMapperDto authCodeMapperDto2 = new AuthCodeMapperDto();
        authCodeMapperDto2.setAuthCode("2");
        authCodeMapperDto2.setFeature("F1");
        authCodeMapperDto2.setDevice("D1");
        authCodeMapperDto2.setId(2);
        authCodeMapperDto2.setLeaf(Boolean.TRUE);


        AuthCodeMapperDto authCodeMapperDto3 = new AuthCodeMapperDto();
        authCodeMapperDto3.setAuthCode("3");
        authCodeMapperDto3.setFeature("F1");
        authCodeMapperDto3.setDevice("D1");
        authCodeMapperDto3.setId(3);
        authCodeMapperDto3.setLeaf(Boolean.TRUE);


        root.getChildren().add(authCodeMapperDto2);
        root.getChildren().add(authCodeMapperDto3);

        AuthCodeMapperDto authCodeMapperDto4 = new AuthCodeMapperDto();
        authCodeMapperDto4.setAuthCode("1");
        authCodeMapperDto4.setFeature("F1");
        authCodeMapperDto4.setDevice("D2");
        authCodeMapperDto4.setId(4);

        AuthCodeMapperDto authCodeMapperDto5 = new AuthCodeMapperDto();
        authCodeMapperDto5.setAuthCode("1");
        authCodeMapperDto5.setFeature("F1");
        authCodeMapperDto5.setDevice("D2");
        authCodeMapperDto5.setId(5);
        authCodeMapperDto5.setLeaf(Boolean.TRUE);

        authCodeMapperDto4.getChildren().add(authCodeMapperDto5);

        root.getChildren().add(authCodeMapperDto4);


        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(root);
        System.out.println(s);

    }


}
