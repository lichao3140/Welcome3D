package com.lqh.lichao.welcome3d;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017-10-24.
 */

public class WelcompagerTransformer implements ViewPager.PageTransformer {

    /**
     * 此方法是滑动的时候每一个页面View都会调用该方法
     * view:当前的页面
     * position:当前滑动的位置
     * 视差效果：在View正常滑动的情况下，给当前View或者当前view里面的每一个子view来一个加速度
     * 而且每一个加速度大小不一样。
     * -1~0
     * 0~1
     */
    @Override
    public void transformPage(View view, float position) {
        //缩放效果
//      view.setScaleX(1 - Math.abs(position));
//      view.setScaleY(1 - Math.abs(position));
        //效果2
//      view.setScaleX(Math.max(0.9f, 1-Math.abs(position)));
//      view.setScaleY(Math.max(0.9f, 1-Math.abs(position)));
        //效果3 3D翻转
        view.setPivotX(position < 0f ? view.getWidth() : 0f);//左边页面：0~-1；右边的页面：1~0
        view.setPivotY(view.getHeight()*0.5f);
        view.setRotationY(position*45f);//0~90度
        //效果4 3D内翻转
//        view.setPivotX(position < 0f ? view.getWidth() : 0f);//左边页面：0~-1；右边的页面：1~0
//        view.setPivotY(view.getHeight()*0.5f);
//        view.setRotationY(-position*45f);//0~90度
        //效果5
//        view.setPivotX(view.getWidth()*0.5f);//左边页面：0~-1；右边的页面：1~0
//        view.setPivotY(view.getHeight()*0.5f);
//        view.setRotationY(-position*45f);//0~90度

        //效果6
//        if (position < 1 && position > -1) {
//            //找到里面的子控件
//            ViewGroup v = (ViewGroup) view.findViewById(R.id.rl);
//            int childCount = v.getChildCount();
//            for (int i = 0; i < childCount; i++) {
//                View childView = v.getChildAt(i);
//                float factor = (float) Math.random() * 3;
//                if (childView.getTag() == null) {
//                    childView.setTag(factor);
//                } else {
//                    factor = (float) childView.getTag();
//                }
//                /**每一个子控件达到不同的视差效果，translationX是不一样的
//                 * position : 0 ~ -1
//                 * translationX: 0 ~ childView.getWidth();
//                 */
//                childView.setTranslationX(factor * childView.getWidth()*position);
//            }
//        }

    }
}
