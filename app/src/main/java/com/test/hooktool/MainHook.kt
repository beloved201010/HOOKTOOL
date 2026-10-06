package com.test.hooktool

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.callbacks.XC_LoadPackage

class MainHook : IXposedHookLoadPackage {

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam?) {
        if (lpparam?.packageName == "com.test.hooktool") {
            XposedBridge.log("HOOKTOOL: Hook 成功加载！")
            // 以后在这里写你的 Hook 逻辑
        }
    }
}
