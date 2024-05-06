package top.gongshuai.homeassistant.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.gongshuai.homeassistant.Utils.House;
import top.gongshuai.homeassistant.dal.mapper.HouseMapper;

@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

}
