package top.gongshuai.homeassistant.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.gongshuai.homeassistant.dal.domain.Query;
import top.gongshuai.homeassistant.dal.mapper.QueryMapper;

@Service
public class QueryServiceImpl extends ServiceImpl<QueryMapper, Query> implements QueryService {

}
