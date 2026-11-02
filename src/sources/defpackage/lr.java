package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.node.LayoutNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappEditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lr implements xo2, ov8, f91, m82, sd0 {
    public static volatile lr g0;
    public static final Object h0 = new Object();
    public static final byte[] i0 = new byte[0];
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;
    public Object f0;

    public lr(Context context, byte b) {
        this.X = b;
        switch (b) {
            case 14:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(u70.i0(u26.materialCalendarStyle, context, wq4.class.getCanonicalName()).data, v56.MaterialCalendar);
                this.Y = yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_dayStyle, 0));
                yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_dayInvalidStyle, 0));
                yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_daySelectedStyle, 0));
                yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_dayTodayStyle, 0));
                ColorStateList colorStateListX = ys0.x(context, typedArrayObtainStyledAttributes, v56.MaterialCalendar_rangeFillColor);
                this.Z = yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_yearStyle, 0));
                yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_yearSelectedStyle, 0));
                this.f0 = yr2.j(context, typedArrayObtainStyledAttributes.getResourceId(v56.MaterialCalendar_yearTodayStyle, 0));
                new Paint().setColor(colorStateListX.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
            default:
                this.f0 = context.getApplicationContext();
                this.Z = new HashSet();
                this.Y = new HashMap();
                break;
        }
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z) {
        pj8[] pj8VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (pj8VarArr = (pj8[]) editable.getSpans(selectionStart, selectionEnd, pj8.class)) != null && pj8VarArr.length > 0) {
                for (pj8 pj8Var : pj8VarArr) {
                    int spanStart = editable.getSpanStart(pj8Var);
                    int spanEnd = editable.getSpanEnd(pj8Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static lr n(Context context) {
        if (g0 == null) {
            synchronized (h0) {
                try {
                    if (g0 == null) {
                        g0 = new lr(context, (byte) 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g0;
    }

    public static boolean r(gz1 gz1Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                pj8[] pj8VarArr = (pj8[]) editable.getSpans(selectionStart, iMin, pj8.class);
                if (pj8VarArr != null && pj8VarArr.length > 0) {
                    for (pj8 pj8Var : pj8VarArr) {
                        int spanStart = editable.getSpanStart(pj8Var);
                        int spanEnd = editable.getSpanEnd(pj8Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    gz1Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    gz1Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public void A(sm0 sm0Var) {
        ((um0) this.f0).X.c = sm0Var;
    }

    public void B(fi1 fi1Var) {
        ((um0) this.f0).X.a = fi1Var;
    }

    public void C(z24 z24Var) {
        ((um0) this.f0).X.b = z24Var;
    }

    public void D(long j) {
        ((um0) this.f0).X.d = j;
    }

    public void E(n31 n31Var, int i, int i2, int i3) {
        n31Var.getClass();
        int i4 = n31Var.b0;
        int i5 = n31Var.c0;
        n31Var.b0 = 0;
        n31Var.c0 = 0;
        n31Var.O(i2);
        n31Var.L(i3);
        if (i4 < 0) {
            n31Var.b0 = 0;
        } else {
            n31Var.b0 = i4;
        }
        if (i5 < 0) {
            n31Var.c0 = 0;
        } else {
            n31Var.c0 = i5;
        }
        n31 n31Var2 = (n31) this.f0;
        n31Var2.t0 = i;
        n31Var2.U();
    }

    public void F(n31 n31Var) {
        ArrayList arrayList = (ArrayList) this.Y;
        arrayList.clear();
        int size = n31Var.q0.size();
        for (int i = 0; i < size; i++) {
            m31 m31Var = (m31) n31Var.q0.get(i);
            int[] iArr = m31Var.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(m31Var);
            }
        }
        n31Var.s0.a = true;
    }

    public void a(LayoutNode layoutNode, bi3 bi3Var) {
        yr2 yr2Var = (yr2) this.Y;
        yr2 yr2Var2 = (yr2) this.Z;
        yr2 yr2Var3 = (yr2) this.f0;
        int iOrdinal = bi3Var.ordinal();
        if (iOrdinal == 0) {
            yr2Var.d(layoutNode);
            yr2Var3.d(layoutNode);
            return;
        }
        if (iOrdinal == 1) {
            yr2Var2.d(layoutNode);
            yr2Var3.d(layoutNode);
            return;
        }
        if (iOrdinal == 2) {
            if (layoutNode.k0 != null) {
                yr2Var3.d(layoutNode);
                return;
            } else {
                yr2Var.d(layoutNode);
                return;
            }
        }
        if (iOrdinal != 3) {
            b61.c();
        } else if (layoutNode.k0 != null) {
            yr2Var3.d(layoutNode);
        } else {
            yr2Var2.d(layoutNode);
        }
    }

    @Override // defpackage.xo2
    public void b(Object obj) {
        vr3.T(true, (xb4) this.Y, (qd0) this.Z, dp1.a());
    }

    @Override // defpackage.m82
    public boolean c(f57 f57Var) {
        wg0 wg0Var = new wg0();
        lx0 lx0Var = new lx0();
        jj0 jj0Var = (jj0) this.Y;
        jh0 jh0Var = new jh0(((lf0) jj0Var).X);
        ik0 ik0Var = (ik0) this.f0;
        mi0 mi0Var = new mi0(wg0Var, lx0Var, jh0Var, ik0Var, new v79(), new l28(ik0Var.a()), jj0Var, null, null);
        e02 e02Var = e02.X;
        return ((Boolean) z51.R(b02.X, new q0(this, mi0Var.a(0, f57Var, true, null, null, e02Var, e02Var), null, (byte) 23))).booleanValue();
    }

    @Override // defpackage.g91
    public void d() {
        ((HappEditText) ((zz2) this.Y).Z).setFocusableInTouchMode(true);
    }

    public qz e() {
        String strConcat = ((String) this.Y) == null ? " backendName" : _UrlKt.FRAGMENT_ENCODE_SET;
        if (((fu5) this.f0) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new qz((String) this.Y, (byte[]) this.Z, (fu5) this.f0);
        }
        bt.i("Missing required properties:".concat(strConcat));
        return null;
    }

    public boolean f(LayoutNode layoutNode) {
        return !(layoutNode.k0 == null) && (((he7) ((yr2) this.Y).Y).contains(layoutNode) || ((he7) ((yr2) this.Z).Y).contains(layoutNode));
    }

    @Override // defpackage.ov8
    public View getRoot() {
        switch (this.X) {
            case 4:
                return (LinearLayout) this.Y;
            case 5:
                return (FrameLayout) this.Y;
            default:
                return (ConstraintLayout) this.Y;
        }
    }

    public void h(Bundle bundle) {
        HashSet hashSet = (HashSet) this.Z;
        String string = ((Context) this.f0).getString(e56.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (rc3.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    i((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new gh7(e);
            }
        }
    }

    public Object i(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = (HashMap) this.Y;
        if (ln7.c()) {
            try {
                String simpleName = cls.getSimpleName();
                if (simpleName.length() > 127) {
                    simpleName = simpleName.substring(0, 127);
                }
                Trace.beginSection(simpleName);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                rc3 rc3Var = (rc3) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = rc3Var.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            i(cls2, hashSet);
                        }
                    }
                }
                objCreate = rc3Var.create((Context) this.f0);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new gh7(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    @Override // defpackage.g91
    public void j() {
        x97.U((HappEditText) ((zz2) this.Y).Z, new i81(this, (byte) 1));
    }

    public sm0 k() {
        return ((um0) this.f0).X.c;
    }

    public ge4 l() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((g55) this.f0)) {
            try {
                ge4 ge4Var = (ge4) this.Z;
                if (ge4Var != null && localeList == ((LocaleList) this.Y)) {
                    return ge4Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ce4(localeList.get(i)));
                }
                ge4 ge4Var2 = new ge4(arrayList);
                this.Y = localeList;
                this.Z = ge4Var2;
                return ge4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public fi1 m() {
        return ((um0) this.f0).X.a;
    }

    public z24 o() {
        return ((um0) this.f0).X.b;
    }

    public long p() {
        return ((um0) this.f0).X.d;
    }

    @Override // defpackage.f91
    public ov8 q() {
        return (zz2) this.Y;
    }

    public boolean s() {
        a63 a63Var;
        IconCompat iconCompat;
        if (((q02) this.f0).F("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.Z;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strM = ((q02) this.f0).M("gcm.n.image");
        if (TextUtils.isEmpty(strM)) {
            a63Var = null;
        } else {
            try {
                a63Var = new a63(new URL(strM));
            } catch (MalformedURLException unused) {
                a63Var = null;
            }
        }
        if (a63Var != null) {
            ExecutorService executorService = (ExecutorService) this.Y;
            z18 z18Var = new z18();
            a63Var.Y = executorService.submit(new sc(a63Var, z18Var, (byte) 27));
            a63Var.Z = z18Var.a;
        }
        mj0 mj0VarA = ox0.a((FirebaseMessagingService) this.Z, (q02) this.f0);
        r65 r65Var = (r65) mj0VarA.Y;
        if (a63Var != null) {
            try {
                fb9 fb9Var = a63Var.Z;
                w45.s(fb9Var);
                Bitmap bitmap = (Bitmap) g28.c(fb9Var, 5L);
                r65Var.e(bitmap);
                p65 p65Var = new p65();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                p65Var.e = iconCompat;
                p65Var.f = null;
                p65Var.g = true;
                r65Var.f(p65Var);
            } catch (InterruptedException unused2) {
                a63Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Objects.toString(e.getCause());
            } catch (TimeoutException unused3) {
                a63Var.close();
            }
        }
        ((NotificationManager) ((FirebaseMessagingService) this.Z).getSystemService("notification")).notify((String) mj0VarA.Z, 0, ((r65) mj0VarA.Y).b());
        return true;
    }

    @Override // defpackage.sd0
    public Object t(qd0 qd0Var) {
        qd0Var.a(new xb(this, (byte) 13), dp1.a());
        ((kv2) this.f0).X.set(qd0Var);
        return "HandlerScheduledFuture-" + ((Callable) this.Z).toString();
    }

    public String toString() {
        switch (this.X) {
            case 18:
                StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
                ArrayList arrayList = (ArrayList) this.f0;
                sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
                sb.append(')');
                while (this != null) {
                    sb.append(' ');
                    sb.append(((Class) this.Z).getName());
                    this = (lr) this.Y;
                }
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xo2
    public void u(Throwable th) {
        boolean z = th instanceof CancellationException;
        qd0 qd0Var = (qd0) this.Z;
        if (z) {
            mb6.s(null, qd0Var.d(new fy7(((String) this.f0).concat(" cancelled."), th)));
        } else {
            qd0Var.b(null);
        }
    }

    public boolean v(CharSequence charSequence, int i, int i2, oj8 oj8Var) {
        if ((oj8Var.c & 3) == 0) {
            re1 re1Var = (re1) this.f0;
            dv4 dv4VarB = oj8Var.b();
            int iA = dv4VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) dv4VarB.f0).getShort(iA + dv4VarB.X);
            }
            re1Var.getClass();
            ThreadLocal threadLocal = re1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = re1Var.a.hasGlyph(sb.toString());
            int i3 = oj8Var.c & 4;
            oj8Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (oj8Var.c & 3) == 2;
    }

    public boolean w() {
        return !(((he7) ((yr2) this.Y).Y).isEmpty() && ((he7) ((yr2) this.f0).Y).isEmpty() && ((he7) ((yr2) this.Z).Y).isEmpty());
    }

    public boolean x(int i, e30 e30Var, m31 m31Var) {
        d30 d30Var = (d30) this.Z;
        int[] iArr = m31Var.p0;
        int[] iArr2 = m31Var.t;
        d30Var.a = iArr[0];
        d30Var.b = iArr[1];
        d30Var.c = m31Var.q();
        d30Var.d = m31Var.k();
        d30Var.i = false;
        d30Var.j = i;
        boolean z = d30Var.a == 3;
        boolean z2 = d30Var.b == 3;
        boolean z3 = z && m31Var.W > 0.0f;
        boolean z4 = z2 && m31Var.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            d30Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            d30Var.b = 1;
        }
        ((b) e30Var).b(m31Var, d30Var);
        m31Var.O(d30Var.e);
        m31Var.L(d30Var.f);
        m31Var.E = d30Var.h;
        m31Var.I(d30Var.g);
        d30Var.j = 0;
        return d30Var.i;
    }

    public Object y(CharSequence charSequence, int i, int i2, int i3, boolean z, kz1 kz1Var) {
        int i4;
        char c;
        mz1 mz1Var = new mz1((fv4) ((z47) this.Z).f0);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zR = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zR) {
                    fv4 fv4Var = (fv4) mz1Var.c.a.get(iCodePointAt);
                    if (mz1Var.a == 2) {
                        if (fv4Var != null) {
                            mz1Var.c = fv4Var;
                            mz1Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                mz1Var.a();
                            } else if (iCodePointAt != 65039) {
                                fv4 fv4Var2 = mz1Var.c;
                                if (fv4Var2.b != null) {
                                    if (mz1Var.f != 1) {
                                        mz1Var.d = fv4Var2;
                                        mz1Var.a();
                                    } else if (mz1Var.b()) {
                                        mz1Var.d = mz1Var.c;
                                        mz1Var.a();
                                    } else {
                                        mz1Var.a();
                                    }
                                    c = 3;
                                } else {
                                    mz1Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (fv4Var == null) {
                        mz1Var.a();
                        c = 1;
                    } else {
                        mz1Var.a = (byte) 2;
                        mz1Var.c = fv4Var;
                        mz1Var.f = 1;
                        c = 2;
                    }
                    mz1Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && v(charSequence, i4, iCharCount, mz1Var.d.b)) {
                            break;
                        }
                        zR = kz1Var.r(charSequence, i4, iCharCount, mz1Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (mz1Var.a == 2 && mz1Var.c.b != null && ((mz1Var.f > 1 || mz1Var.b()) && i5 < i3 && zR && (z || !v(charSequence, i4, iCharCount, mz1Var.c.b)))) {
            kz1Var.r(charSequence, i4, iCharCount, mz1Var.c.b);
        }
        return kz1Var.i();
    }

    public void z(String str) {
        if (str != null) {
            this.Y = str;
        } else {
            b61.i("Null backendName");
        }
    }

    public /* synthetic */ lr(byte b, boolean z) {
        this.X = b;
    }

    public lr(q02 q02Var, byte[] bArr, byte[] bArr2) {
        this.X = (byte) 3;
        this.f0 = q02Var;
        this.Z = ch3.o(bArr);
        this.Y = ch3.o(bArr2);
    }

    public /* synthetic */ lr(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    public lr(lr lrVar, Class cls) {
        this.X = (byte) 18;
        this.Y = lrVar;
        this.Z = cls;
    }

    public lr(byte b) {
        this.X = b;
        switch (b) {
            case 8:
                e68 e68Var = new e68();
                e68Var.a = Float.NaN;
                this.Y = e68Var;
                this.Z = new yr2((byte) 20, false);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                this.Y = new yr2((byte) 24);
                this.Z = new yr2((byte) 24);
                this.f0 = new yr2((byte) 24);
                break;
            case 23:
                this.Y = new int[10];
                this.Z = new int[10];
                this.f0 = new int[10];
                break;
            case 26:
                this.Y = new s05();
                break;
            default:
                this.f0 = new g55((byte) 29);
                break;
        }
    }

    public lr(ld2 ld2Var) {
        this.X = (byte) 1;
        this.Y = ld2Var;
        this.Z = i0;
        this.f0 = new int[32];
    }

    public lr(FirebaseMessagingService firebaseMessagingService, q02 q02Var, ExecutorService executorService) {
        this.X = (byte) 22;
        this.Y = executorService;
        this.Z = firebaseMessagingService;
        this.f0 = q02Var;
    }

    public lr(j52 j52Var, i52 i52Var, zz2 zz2Var) {
        this.X = (byte) 25;
        this.Z = j52Var;
        this.f0 = i52Var;
        this.X = (byte) 25;
        this.Y = zz2Var;
    }

    public lr(um0 um0Var) {
        this.X = (byte) 15;
        this.f0 = um0Var;
        this.Y = new wl6((Object) this, (byte) 17);
    }

    public /* synthetic */ lr(byte b, Object obj, Object obj2, Object obj3, boolean z) {
        this.X = b;
        this.f0 = obj;
        this.Y = obj2;
        this.Z = obj3;
    }

    public lr(n31 n31Var) {
        this.X = (byte) 12;
        this.Y = new ArrayList();
        this.Z = new d30();
        this.f0 = n31Var;
    }

    public lr(z47 z47Var, be beVar, re1 re1Var, Set set) {
        this.X = (byte) 24;
        this.Y = beVar;
        this.Z = z47Var;
        this.f0 = re1Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            y(str, 0, str.length(), 1, true, new z31(str, (byte) 1));
        }
    }

    public lr(dn2 dn2Var, vn1 vn1Var, zy0 zy0Var) {
        this.X = (byte) 11;
        this.Y = dn2Var;
        this.Z = vn1Var;
        this.f0 = zy0Var;
    }
}
