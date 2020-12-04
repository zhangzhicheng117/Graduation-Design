package qdu.java.recruit.service;

import qdu.java.recruit.entity.HREntity;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface HRService {

    HREntity getHR(int hrId);

    boolean updateHR(HREntity HREntity);

    boolean registerHR(HREntity HREntity);

    boolean loginHR(String mobile, String password);

    HREntity getHRByMobile(String mobile);
}
