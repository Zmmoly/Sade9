package com.awab.ai

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService() {

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.d("AccessibilityService", "خدمة إمكانية الوصول متصلة")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // يمكن معالجة أحداث إمكانية الوصول هنا
        event?.let {
            Log.d("AccessibilityService", "Event: ${it.eventType}")
        }
    }

    override fun onInterrupt() {
        Log.d("AccessibilityService", "خدمة إمكانية الوصول متوقفة")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AccessibilityService", "خدمة إمكانية الوصول تم إيقافها")
    }
}
