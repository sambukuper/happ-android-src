package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 {
    public static final a4 e = new a4(1, (String) null);
    public static final a4 f = new a4(2, (String) null);
    public static final a4 g;
    public static final a4 h;
    public static final a4 i;
    public static final a4 j;
    public static final a4 k;
    public static final a4 l;
    public static final a4 m;
    public static final a4 n;
    public static final a4 o;
    public static final a4 p;
    public static final a4 q;
    public static final a4 r;
    public static final a4 s;
    public static final a4 t;
    public final Object a;
    public final int b;
    public final Class c;
    public final u4 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionA = null;
        new a4(4, (String) null);
        new a4(8, (String) null);
        g = new a4(16, (String) null);
        new a4(32, (String) null);
        h = new a4(64, (String) null);
        i = new a4(128, (String) null);
        new a4(PSKKeyManager.MAX_KEY_LENGTH_BYTES, n4.class);
        new a4(512, n4.class);
        new a4(1024, o4.class);
        new a4(2048, o4.class);
        j = new a4(4096, (String) null);
        k = new a4(8192, (String) null);
        new a4(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
        new a4(32768, (String) null);
        new a4(DnsOverHttps.MAX_RESPONSE_SIZE, (String) null);
        new a4(131072, s4.class);
        l = new a4(262144, (String) null);
        new a4(524288, (String) null);
        m = new a4(1048576, (String) null);
        new a4(2097152, t4.class);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        n = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, q4.class);
        o = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        p = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        q = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        r = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new a4(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new a4(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new a4(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new a4(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        s = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, r4.class);
        new a4(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, p4.class);
        new a4(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new a4(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new a4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new a4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new a4(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        t = new a4(i2 >= 34 ? u3.f() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i3 = da0.a;
        if (i2 >= 36 && ca0.a() >= 3600001) {
            accessibilityActionA = e4.a();
        }
        new a4(accessibilityActionA, R.id.ALT, null, null, null);
    }

    public a4(Object obj, int i2, CharSequence charSequence, u4 u4Var, Class cls) {
        this.b = i2;
        this.d = u4Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a4)) {
            return false;
        }
        Object obj2 = ((a4) obj).a;
        Object obj3 = this.a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = h4.d(this.b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public a4(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public a4(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
