package org.man4fun.home.service;

import org.man4fun.utils.echarts.json.GsonOption;
import org.springframework.stereotype.Service;


@Service
public interface LineService {
    GsonOption getOption();
}
