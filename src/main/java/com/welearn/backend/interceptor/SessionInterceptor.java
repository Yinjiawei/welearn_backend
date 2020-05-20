package com.welearn.backend.interceptor;


import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class SessionInterceptor implements HandlerInterceptor {
//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    NotificationService notificationService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Cookie[] cookies = request.getCookies();
//        Long unreadNotificationCount = Long.valueOf(0);
//        if (cookies != null && cookies.length != 0) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("token")) {
//                    String token = cookie.getValue();
//                    UserExample userExample = new UserExample();
//                    userExample.createCriteria().andTokenEqualTo(token);
//                    List<User> users = userMapper.selectByExample(userExample);
//                    if (users.size() != 0) {
//                        request.getSession().setAttribute("user", users.get(0));
//                        unreadNotificationCount = notificationService.unreadCount(users.get(0).getId());
//                    }
//                    break;
//                }
//            }
//        }
//        request.getSession().setAttribute("unreadNotificationCount", unreadNotificationCount);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
