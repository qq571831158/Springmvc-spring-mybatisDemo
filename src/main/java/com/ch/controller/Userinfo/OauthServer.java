//package com.ch.controller.Userinfo;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by apple on 2017/4/26.
// */
//@WebServlet()
//public class OauthServer extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try {
//            OAuthAuthzRequest oauthRequest = new OAuthAuthzRequest(request);
//
//            // 检查clientid
//            String clientid = oauthRequest.getClientId();
//
//            // 检查客户端安全KEY是否正确
//            String secret = oauthRequest.getClientSecret();
//
//            log.info(clientid + ":" + secret);
//
//            // 检查用户是否登陆，没登录直接跳转到登陆页面
//
//            // 我们假设用户已经登录过
//
//            MD5Generator md5 = new MD5Generator();
//            String name = "gaoguangjin";
//
//            // 生成授权码
//            String authorizationCode = md5.generateValue(name);
//            // 进行OAuth响应构建
//            OAuthASResponse.OAuthAuthorizationResponseBuilder builder = OAuthASResponse.authorizationResponse(request, HttpServletResponse.SC_FOUND);
//            // 设置授权码
//            builder.setCode(authorizationCode);
//            // 得到到客户端重定向地址
//            String redirectURI = oauthRequest.getParam(OAuth.OAUTH_REDIRECT_URI);
//
//            // 构建响应
//            OAuthResponse response = builder.location(redirectURI).buildQueryMessage();
//            // 根据OAuthResponse返回ResponseEntity响应
//            resp.sendRedirect(response.getLocationUri());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
