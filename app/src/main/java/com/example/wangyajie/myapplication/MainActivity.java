package com.example.wangyajie.myapplication;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wangyajie.myapplication.CallBackUtil;
import com.example.wangyajie.myapplication.OkhttpUtil;
import com.google.gson.Gson;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {
private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show= (TextView) findViewById(R.id.show);


        String url = "http://news-at.zhihu.com/api/4/themes";

        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {}

            @Override
            public void onResponse(String response) {
                //gradle添加gson依赖
                final Gson gson = new Gson();

                final JavaBean javabean = gson.fromJson(response, JavaBean.class);
                //取出 StoriesBean
//                List<JavaBean.OthersBean> stories = javabean.getOthers();
//                //StringBuilder类实现字符串拼接
//                final StringBuilder stringBuilder = new StringBuilder();
//                //For循环List 遍历
//                for (JavaBean.OthersBean ss : stories) {
//                    stringBuilder.append(ss);//javabean 中添加toString()函数
//
//                    stringBuilder.append("\n\n\n");
//
//
//                }
//                stringBuilder.append(stories.toString());

                String ss =javabean.getOthers().toString();
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("kwwl",response);
                show.setText(ss);
            }
        });
    }

//    public void click(View v){
//        String url = "http://news-at.zhihu.com/api/4/themes";
//
//        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
//            @Override
//            public void onFailure(Call call, Exception e) {}
//
//            @Override
//            public void onResponse(String response) {
//                //gradle添加gson依赖
//                final Gson gson = new Gson();
//
//                final JavaBean javabean = gson.fromJson(response, JavaBean.class);
//                //取出 StoriesBean
//                List<JavaBean.OthersBean> stories = javabean.getOthers();
//                //StringBuilder类实现字符串拼接
//                final StringBuilder stringBuilder = new StringBuilder();
//                //For循环List 遍历
//                for (JavaBean.OthersBean ss : stories) {
//                    stringBuilder.append(ss);//javabean 中添加toString()函数
//
//                    stringBuilder.append("\n\n\n");
//
//
//                }
//
//
//                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
//                Log.d("kwwl",response);
//                show.setText(stringBuilder);
//            }
//        });
//
//
////        String url1 = "http://27.223.99.146:8003/static/";
////        File file = new File(Environment.getExternalStorageDirectory()+"/dcim/triple/video1.jpg");
////        HashMap<String, String> paramsMap = new HashMap<>();
////        paramsMap.put("title","title");
////        OkhttpUtil.okHttpUploadFile(url1, file, "image", OkhttpUtil.FILE_TYPE_IMAGE, paramsMap, new CallBackUtil.CallBackString() {
////            @Override
////            public void onFailure(Call call, Exception e) {
////
////            }
////
////            @Override
////            public void onProgress(float progress, long total) {
////
////            }
////
////            @Override
////            public void onResponse(String response) {
////
////            }
////        });
//     }
}