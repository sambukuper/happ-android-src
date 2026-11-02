package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import io.sentry.ILogger;
import io.sentry.internal.debugmeta.c;
import io.sentry.n2;
import io.sentry.s5;
import io.sentry.util.e;
import io.sentry.vendor.a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;

    public b8(Context context, int i) {
        this.a = (byte) 0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, c8.j(context, i));
        x7 x7Var = new x7();
        x7Var.a = -1;
        x7Var.c = contextThemeWrapper;
        x7Var.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        this.c = x7Var;
        this.b = i;
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = dh3.k(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public void a(long j) {
        if (c(j)) {
            return;
        }
        int i = this.b;
        long[] jArrCopyOf = (long[]) this.c;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.c = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.b) {
            this.b = i + 1;
        }
    }

    public void b() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    g86 g86Var = (g86) wv0.t0(arrayList);
                    if ((g86Var != null ? (d53) g86Var.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((g86) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.c)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public c8 d() {
        x7 x7Var = (x7) this.c;
        c8 c8Var = new c8((ContextThemeWrapper) x7Var.c, this.b);
        View view = (View) x7Var.g;
        a8 a8Var = c8Var.i0;
        if (view != null) {
            a8Var.p = view;
        } else {
            CharSequence charSequence = (CharSequence) x7Var.f;
            if (charSequence != null) {
                a8Var.d = charSequence;
                TextView textView = a8Var.n;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                a8Var.c.setTitle(charSequence);
            }
            Drawable drawable = (Drawable) x7Var.e;
            if (drawable != null) {
                a8Var.l = drawable;
                ImageView imageView = a8Var.m;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    a8Var.m.setImageDrawable(drawable);
                }
            }
        }
        if (((ListAdapter) x7Var.j) != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) x7Var.d).inflate(a8Var.t, (ViewGroup) null);
            int i = x7Var.b ? a8Var.u : a8Var.v;
            ListAdapter z7Var = (ListAdapter) x7Var.j;
            if (z7Var == null) {
                z7Var = new z7((ContextThemeWrapper) x7Var.c, i, R.id.text1, null);
            }
            a8Var.q = z7Var;
            a8Var.r = x7Var.a;
            if (((DialogInterface.OnClickListener) x7Var.k) != null) {
                alertController$RecycleListView.setOnItemClickListener(new w7(x7Var, a8Var));
            }
            if (x7Var.b) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            a8Var.e = alertController$RecycleListView;
        }
        View view2 = (View) x7Var.h;
        if (view2 != null) {
            a8Var.f = view2;
            a8Var.g = false;
        }
        c8Var.setCancelable(true);
        c8Var.setCanceledOnTouchOutside(true);
        c8Var.setOnCancelListener(null);
        c8Var.setOnDismissListener(null);
        pt4 pt4Var = (pt4) x7Var.i;
        if (pt4Var != null) {
            c8Var.setOnKeyListener(pt4Var);
        }
        return c8Var;
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public String[] g() {
        t33 t33VarA = ((z33) this.c).a(this.b);
        if (t33VarA == null) {
            throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        String[] strArr = new String[t33VarA.b];
        for (int i = 0; i < t33VarA.b; i++) {
            String strG = ((z33) this.c).g(t33VarA.h((z33) this.c, i));
            if (strG == null) {
                throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            strArr[i] = strG;
        }
        return strArr;
    }

    public boolean h() {
        return this.b < ((ArrayList) this.c).size();
    }

    public HashMap i(Map map, ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public void j(sm2 sm2Var, int i, int i2) {
        ((by0) this.c).g(new ww7(sm2Var), i, i2);
    }

    public void k() {
        xp0 xp0Var = xp0.c;
        char[] cArr = (char[]) this.c;
        xp0Var.getClass();
        cArr.getClass();
        synchronized (xp0Var) {
            int i = xp0Var.b;
            if (cArr.length + i < yt.a) {
                xp0Var.b = i + cArr.length;
                xp0Var.a.addLast(cArr);
            }
        }
    }

    public void l(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.c)[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public Object m(ILogger iLogger, Object obj) {
        Object objQ;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = e.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return e.a((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        HashSet hashSet = (HashSet) this.c;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.c = hashSet;
        }
        if (hashSet.contains(obj)) {
            iLogger.h(s5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.b) {
                hashSet.remove(obj);
                iLogger.h(s5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    objQ = new ArrayList();
                    int length2 = objArr.length;
                    while (i < length2) {
                        objQ.add(m(iLogger, objArr[i]));
                        i++;
                    }
                } else if (obj instanceof Collection) {
                    objQ = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objQ.add(m(iLogger, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objQ = i((Map) obj, iLogger);
                } else {
                    objQ = q(iLogger, obj);
                    if (objQ.isEmpty()) {
                        objQ = obj.toString();
                    }
                }
                return objQ;
            } catch (Exception e) {
                iLogger.e(s5.INFO, "Not serializing object due to throwing sub-path.", e);
                return null;
            }
        } finally {
            hashSet.remove(obj);
        }
    }

    public void n(c cVar, ILogger iLogger, Object obj) throws IOException {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.Y;
        if (obj == null) {
            cVar2.p();
            return;
        }
        if (obj instanceof Character) {
            cVar.y(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            cVar.y((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            cVar.z(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            cVar.x((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                cVar.y(a.f(((Date) obj).getTime()));
                return;
            } catch (Exception e) {
                iLogger.e(s5.ERROR, "Error when serializing Date", e);
                cVar2.p();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                cVar.y(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                iLogger.e(s5.ERROR, "Error when serializing TimeZone", e2);
                cVar2.p();
                return;
            }
        }
        if (obj instanceof n2) {
            ((n2) obj).serialize(cVar, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            o(cVar, iLogger, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            o(cVar, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            o(cVar, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            p(cVar, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            cVar.y(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = e.a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            o(cVar, iLogger, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            cVar.z(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            cVar.y(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            cVar.y(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            cVar.y(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            cVar.y(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            p(cVar, iLogger, e.a((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            cVar.y(obj.toString());
            return;
        }
        try {
            b8 b8Var = (b8) this.c;
            if (b8Var == null) {
                b8Var = new b8((byte) 15, this.b);
                this.c = b8Var;
            }
            n(cVar, iLogger, b8Var.m(iLogger, obj));
        } catch (Exception e3) {
            iLogger.e(s5.ERROR, "Failed serializing unknown object.", e3);
            cVar.y("[OBJECT]");
        }
    }

    public void o(c cVar, ILogger iLogger, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.Y;
        cVar2.D();
        cVar2.g();
        int i = cVar2.Z;
        int[] iArrCopyOf = cVar2.Y;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar2.Y = iArrCopyOf;
        }
        int i2 = cVar2.Z;
        cVar2.Z = i2 + 1;
        iArrCopyOf[i2] = 1;
        cVar2.X.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n(cVar, iLogger, it.next());
        }
        cVar2.k(1, 2, ']');
    }

    public void p(c cVar, ILogger iLogger, Map map) throws IOException {
        cVar.k();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                cVar.p((String) obj);
                n(cVar, iLogger, map.get(obj));
            }
        }
        cVar.m();
    }

    public HashMap q(ILogger iLogger, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.h(s5.INFO, pc6.p("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void r(ht4 ht4Var, d53 d53Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object arrayList = linkedHashMap.get(ht4Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(ht4Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        g86 g86Var = new g86(new WeakReference(d53Var), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(g86Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g86 g86Var2 = (g86) arrayList2.get(i);
                if (j >= g86Var2.c) {
                    if (g86Var2.a.get() == d53Var) {
                        arrayList2.set(i, g86Var);
                        break;
                    } else {
                        arrayList2.add(i, g86Var);
                        break;
                    }
                }
            }
        }
        b();
    }

    public void s(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                int[] iArr = z33.x;
                int i = this.b;
                int i2 = i >>> 28;
                int i3 = iArr[i2];
                if (i3 == 0) {
                    String strG = ((z33) this.c).g(i);
                    if (strG != null) {
                        return strG;
                    }
                    throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
                }
                if (i3 == 1) {
                    return "(binary blob)";
                }
                if (i3 == 2) {
                    return "(table)";
                }
                if (i3 == 7) {
                    if (i2 == 7) {
                        return Integer.toString((i << 4) >> 4);
                    }
                    throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
                }
                if (i3 == 8) {
                    return "(array)";
                }
                if (i3 != 14) {
                    return "???";
                }
                int[] iArrD = ((z33) this.c).d(i);
                if (iArrD == null) {
                    throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
                }
                StringBuilder sb = new StringBuilder("[");
                sb.append(iArrD.length);
                sb.append("]{");
                if (iArrD.length != 0) {
                    sb.append(iArrD[0]);
                    for (int i4 = 1; i4 < iArrD.length; i4++) {
                        sb.append(", ");
                        sb.append(iArrD[i4]);
                    }
                }
                sb.append('}');
                return sb.toString();
            case 7:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b8(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ b8(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public b8(x11 x11Var, int i) {
        this.a = (byte) 17;
        w45.s(x11Var);
        this.c = x11Var;
        this.b = i;
    }

    public b8() {
        this.a = (byte) 10;
        this.c = new LinkedHashMap();
    }

    public b8(pj0 pj0Var) {
        this.a = (byte) 13;
        this.c = pj0Var;
        this.b = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b8(by0 by0Var, int i) {
        this((byte) 11, i);
        this.a = (byte) 11;
        this.c = by0Var;
    }

    public b8(ArrayList arrayList) {
        this.a = (byte) 12;
        this.c = arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b8(Context context) {
        this(context, c8.j(context, 0));
        this.a = (byte) 0;
    }

    public /* synthetic */ b8(byte b) {
        this.a = b;
    }
}
