package com.idyl.site.service.manager.photographer;

import com.idyl.site.dao.manager.photographer.PhotographerAuthenticateDAO;
import com.idyl.site.data.PhotographerExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @类功能说明：摄影师后台维护Service
 * @类包：com.idyl.site.service.manager.photographer
 * @修改日期：
 * @修改说明：
 * @公司名称：首都信息发展股份有限公司
 * @作者：zhaochun
 * @创建时间：2015-05-11
 */
@Component
@Transactional(readOnly = true)
public class PhotographerAuthenticateService {
    @Autowired
    PhotographerAuthenticateDAO photographerAuthenticateDAO;
    @Transactional(readOnly = false)
    public void authenticateUpdate(PhotographerExtra photographerExtra){
        photographerAuthenticateDAO.authenticateUpdate(photographerExtra);
    }
}
