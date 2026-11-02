package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw8 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {j46.accessibility_custom_action_0, j46.accessibility_custom_action_1, j46.accessibility_custom_action_2, j46.accessibility_custom_action_3, j46.accessibility_custom_action_4, j46.accessibility_custom_action_5, j46.accessibility_custom_action_6, j46.accessibility_custom_action_7, j46.accessibility_custom_action_8, j46.accessibility_custom_action_9, j46.accessibility_custom_action_10, j46.accessibility_custom_action_11, j46.accessibility_custom_action_12, j46.accessibility_custom_action_13, j46.accessibility_custom_action_14, j46.accessibility_custom_action_15, j46.accessibility_custom_action_16, j46.accessibility_custom_action_17, j46.accessibility_custom_action_18, j46.accessibility_custom_action_19, j46.accessibility_custom_action_20, j46.accessibility_custom_action_21, j46.accessibility_custom_action_22, j46.accessibility_custom_action_23, j46.accessibility_custom_action_24, j46.accessibility_custom_action_25, j46.accessibility_custom_action_26, j46.accessibility_custom_action_27, j46.accessibility_custom_action_28, j46.accessibility_custom_action_29, j46.accessibility_custom_action_30, j46.accessibility_custom_action_31};
    public static final rv8 e = new rv8();

    public static qx8 a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        qx8 qx8Var = (qx8) weakHashMap.get(view);
        if (qx8Var != null) {
            return qx8Var;
        }
        qx8 qx8Var2 = new qx8(view);
        a.put(view, qx8Var2);
        return qx8Var2;
    }

    public static void b(View view, w19 w19Var) {
        WindowInsets windowInsetsF = w19Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? zv8.a(view, windowInsetsF) : sv8.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            w19.g(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = bw8.d;
        bw8 bw8Var = (bw8) view.getTag(j46.tag_unhandled_key_event_manager);
        if (bw8Var == null) {
            bw8Var = new bw8();
            bw8Var.a = null;
            bw8Var.b = null;
            bw8Var.c = null;
            view.setTag(j46.tag_unhandled_key_event_manager, bw8Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = bw8Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = bw8.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (bw8Var.a == null) {
                            bw8Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = bw8.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                bw8Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    bw8Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = bw8Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = bw8Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    bw8Var.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = bw8.d;
            bw8 bw8Var = (bw8) view.getTag(j46.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (bw8Var == null) {
                bw8Var = new bw8();
                bw8Var.a = null;
                bw8Var.b = null;
                bw8Var.c = null;
                view.setTag(j46.tag_unhandled_key_event_manager, bw8Var);
            }
            WeakReference weakReference2 = bw8Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                bw8Var.c = new WeakReference(keyEvent);
                SparseArray sparseArray = bw8Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    bw8Var.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(j46.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    c2.m();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return yv8.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        int i = j46.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = xv8.a(view);
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(j46.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(j46.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? aw8.a(appCompatEditText) : (String[]) appCompatEditText.getTag(j46.tag_on_receive_content_mime_types);
    }

    public static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static t41 j(AppCompatEditText appCompatEditText, t41 t41Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(t41Var);
            appCompatEditText.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return aw8.b(appCompatEditText, t41Var);
        }
        if (((y88) appCompatEditText.getTag(j46.tag_on_receive_content_listener)) == null) {
            return appCompatEditText.b(t41Var);
        }
        t41 t41VarA = y88.a(appCompatEditText, t41Var);
        if (t41VarA == null) {
            return null;
        }
        return appCompatEditText.b(t41VarA);
    }

    public static void k(View view, int i) {
        ArrayList arrayListG = g(view);
        for (int i2 = 0; i2 < arrayListG.size(); i2++) {
            if (((a4) arrayListG.get(i2)).a() == i) {
                arrayListG.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, a4 a4Var, String str, u4 u4Var) {
        t3 t3Var;
        if (u4Var == null && str == null) {
            k(view, a4Var.a());
            i(view, 0);
            return;
        }
        a4 a4Var2 = new a4(null, a4Var.b, str, u4Var, a4Var.c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            t3Var = null;
        } else {
            t3Var = accessibilityDelegateE instanceof s3 ? ((s3) accessibilityDelegateE).a : new t3(accessibilityDelegateE);
        }
        if (t3Var == null) {
            t3Var = new t3();
        }
        n(view, t3Var);
        k(view, a4Var2.a());
        g(view).add(a4Var2);
        i(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            yv8.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void n(View view, t3 t3Var) {
        if (t3Var == null && (e(view) instanceof s3)) {
            t3Var = new t3();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(t3Var == null ? null : t3Var.Y);
    }

    public static void o(View view, CharSequence charSequence) {
        new qv8(j46.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        rv8 rv8Var = e;
        if (charSequence == null) {
            rv8Var.X.remove(view);
            view.removeOnAttachStateChangeListener(rv8Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(rv8Var);
        } else {
            rv8Var.X.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(rv8Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(rv8Var);
            }
        }
    }
}
