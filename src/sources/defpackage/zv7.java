package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zv7 implements f91, v06, fa5 {
    public static zv7 f0;
    public Object X;
    public Object Y;
    public Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zv7(aj0 aj0Var, Size size) {
        Rational rational;
        this.X = aj0Var;
        aj0Var.c();
        aj0Var.j();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listT = aj0Var.t(256);
            if (listT.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listT, new rx0(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.Y = rational;
        this.Z = new hx7(aj0Var, rational);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object a(fb9 fb9Var) throws IOException {
        try {
            return g28.c(fb9Var, 30L);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ru.a);
        arrayList2.add(ru.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!ru.a((Rational) it2.next(), size));
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Rational l(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? ru.a : ru.b;
        }
        if (i == 1) {
            return z ? ru.c : ru.d;
        }
        hi5.z0("SupportedOutputSizesCollector");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap m(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = h(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (ru.a(rational, size)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zv7 r(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new zv7(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void x(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(xx7 xx7Var, Map.Entry entry) {
        xx7 xx7Var2 = (xx7) entry.getValue();
        Objects.toString(xx7Var2);
        hi5.z0("SurfaceProcessorNode");
        jz jzVar = new jz(xx7Var.g.a, ((xy) entry.getKey()).d, xx7Var.c ? (cj0) this.Y : null, ((xy) entry.getKey()).f, ((xy) entry.getKey()).g);
        int i = ((xy) entry.getKey()).c;
        xx7Var2.getClass();
        s08.b();
        xx7Var2.a();
        mb6.s("Consumer can only be linked once.", !xx7Var2.j);
        xx7Var2.j = true;
        wx7 wx7Var = xx7Var2.l;
        zo0 zo0VarG0 = vr3.g0(wx7Var.c(), new ux7(xx7Var2, wx7Var, i, jzVar, (jz) null), km4.J());
        zo0VarG0.a(new zo2(zo0VarG0, new xd6((byte) 14, this, xx7Var2, false), (byte) 0), km4.J());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList colorStateListV;
        TypedArray typedArray = (TypedArray) this.Y;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListV = w79.v((Context) this.X, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        boolean zY = ue3.y(hi5.a0(this));
        si3 si3Var = (si3) this.X;
        si3Var.h0.setFocusableInTouchMode(zY);
        si3Var.s0.setFocusableInTouchMode(zY);
        si3Var.r0.setFocusableInTouchMode(zY);
        si3Var.o0.setFocusableInTouchMode(zY);
        si3Var.f0.setFocusableInTouchMode(zY);
        si3Var.w0.setFocusableInTouchMode(zY);
        si3Var.v0.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable e(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.Y;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : u70.O((Context) this.X, resourceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable f(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.Y).hasValue(i) || (resourceId = ((TypedArray) this.Y).getResourceId(i, 0)) == 0) {
            return null;
        }
        aq aqVarA = aq.a();
        Context context = (Context) this.X;
        synchronized (aqVarA) {
            drawableD = aqVarA.a.d(context, resourceId, true);
        }
        return drawableD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Typeface g(int i, int i2, oq oqVar) {
        int resourceId = ((TypedArray) this.Y).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.Z;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.Z = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.X;
        ThreadLocal threadLocal = xf6.a;
        if (context.isRestricted()) {
            return null;
        }
        return xf6.a(context, resourceId, typedValue2, i2, oqVar, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get() {
        return new we8(new f08((byte) 13), new f08((byte) 9), (of1) ((y5) this.X).get(), (jl1) ((xy0) this.Y).get(), (yr6) ((yr6) this.Z).get());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ void i(fb9 fb9Var) {
        yq6 yq6Var = (yq6) this.X;
        String str = (String) this.Y;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.Z;
        l97 l97Var = yq6Var.a;
        synchronized (l97Var) {
            l97Var.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j() {
        si3 si3Var = (si3) this.X;
        x97.U(si3Var.h0, new fv7(this, (byte) 0));
        x97.U(si3Var.s0, new fv7(this, (byte) 1));
        x97.U(si3Var.r0, new fv7(this, (byte) 2));
        x97.U(si3Var.o0, new fv7(this, (byte) 3));
        x97.U(si3Var.f0, new fv7(this, (byte) 4));
        x97.U(si3Var.w0, new fv7(this, (byte) 5));
        x97.U(si3Var.v0, new fv7(this, (byte) 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: boolean */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayList k(er8 er8Var) {
        Size[] sizeArr;
        Rational rational;
        aj0 aj0Var = (aj0) this.X;
        i63 i63Var = (i63) er8Var;
        List list = (List) i63Var.a(i63.B, (Object) null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null) {
            return arrayList;
        }
        ef6 ef6Var = (ef6) i63Var.a(i63.A, (Object) null);
        List list2 = (List) i63Var.a(i63.z, (Object) null);
        int iN = er8Var.n();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iN) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = aj0Var.t(iN);
        }
        ArrayList arrayList2 = new ArrayList(listAsList);
        Collections.sort(arrayList2, new rx0(true));
        if (arrayList2.isEmpty()) {
            hi5.z0("SupportedOutputSizesCollector");
        }
        if (ef6Var != null) {
            Size size = (Size) ((i63) er8Var).a(i63.y, (Object) null);
            i63Var.H(0);
            if (!((Boolean) er8Var.a(er8.V, Boolean.FALSE)).booleanValue()) {
                er8Var.n();
            }
            er8Var.toString();
            arrayList2.toString();
            hi5.z0("SupportedOutputSizesCollector");
            ef6 ef6Var2 = (ef6) i63Var.d(i63.A);
            Rational rational2 = (Rational) this.Y;
            pz2 pz2Var = ef6Var2.a;
            HashMap mapM = m(arrayList2);
            boolean z = rational2 == null || rational2.getNumerator() >= rational2.getDenominator();
            pz2Var.getClass();
            Rational rationalL = l(0, z);
            ArrayList<Rational> arrayList3 = new ArrayList(mapM.keySet());
            Collections.sort(arrayList3, new qu(rationalL, rational2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Rational rational3 : arrayList3) {
                linkedHashMap.put(rational3, (List) mapM.get(rational3));
            }
            if (size != null) {
                Size size2 = cb7.a;
                int height = size.getHeight() * size.getWidth();
                Iterator it2 = linkedHashMap.keySet().iterator();
                while (it2.hasNext()) {
                    List<Size> list3 = (List) linkedHashMap.get((Rational) it2.next());
                    ArrayList arrayList4 = new ArrayList();
                    for (Size size3 : list3) {
                        if (cb7.a(size3) <= height) {
                            arrayList4.add(size3);
                        }
                    }
                    list3.clear();
                    list3.addAll(arrayList4);
                }
            }
            ff6 ff6Var = ef6Var2.b;
            if (ff6Var != null) {
                Iterator it3 = linkedHashMap.keySet().iterator();
                while (it3.hasNext()) {
                    List list4 = (List) linkedHashMap.get((Rational) it3.next());
                    if (!list4.isEmpty()) {
                        boolean z2 = ff6Var.b;
                        if (ff6Var != ff6.c) {
                            Size size4 = ff6Var.a;
                            if (z2 == 0) {
                                boolean zContains = list4.contains(size4);
                                list4.clear();
                                if (zContains) {
                                    list4.add(size4);
                                }
                            } else if (z2 == 1) {
                                x(list4, size4, true);
                            } else if (z2 == 2) {
                                x(list4, size4, false);
                            } else if (z2 == 3) {
                                y(list4, size4, true);
                            } else if (z2 == 4) {
                                y(list4, size4, false);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = linkedHashMap.values().iterator();
            while (it4.hasNext()) {
                for (Size size5 : (List) it4.next()) {
                    if (!arrayList5.contains(size5)) {
                        arrayList5.add(size5);
                    }
                }
            }
            return arrayList5;
        }
        hx7 hx7Var = (hx7) this.Z;
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        ArrayList<Size> arrayList6 = new ArrayList(arrayList2);
        Collections.sort(arrayList6, new rx0(true));
        ArrayList arrayList7 = new ArrayList();
        i63 i63Var2 = (i63) er8Var;
        Size size6 = (Size) i63Var2.a(i63.y, (Object) null);
        Size size7 = (Size) arrayList6.get(0);
        if (size6 == null) {
            size6 = size7;
        } else if (cb7.a(size7) < size6.getHeight() * size6.getWidth()) {
            size6 = size7;
        }
        Size sizeA = hx7Var.a(i63Var2);
        Size size8 = cb7.b;
        int iA = cb7.a(size8);
        if (cb7.a(size6) < iA) {
            size8 = cb7.a;
        } else if (sizeA != null) {
            if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                size8 = sizeA;
            }
        }
        for (Size size9 : arrayList6) {
            if (cb7.a(size9) <= size6.getHeight() * size6.getWidth()) {
                if (size9.getHeight() * size9.getWidth() >= cb7.a(size8) && !arrayList7.contains(size9)) {
                    arrayList7.add(size9);
                }
            }
        }
        if (arrayList7.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size8 + "\nmaxSize = " + size6 + "\ninitial size list: " + arrayList6);
        }
        zx zxVar = i63.s;
        if (i63Var2.h(zxVar)) {
            rational = l(((Integer) i63Var2.d(zxVar)).intValue(), hx7Var.d);
        } else {
            Size sizeA2 = hx7Var.a(i63Var2);
            if (sizeA2 != null) {
                Iterator it5 = h(arrayList7).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                        break;
                    }
                    Rational rational4 = (Rational) it5.next();
                    if (ru.a(rational4, sizeA2)) {
                        rational = rational4;
                        break;
                    }
                }
            } else {
                rational = null;
            }
        }
        if (sizeA == null) {
            sizeA = (Size) i63Var2.a(i63.x, (Object) null);
        }
        ArrayList arrayList8 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList8.addAll(arrayList7);
            if (sizeA != null) {
                x(arrayList8, sizeA, true);
                return arrayList8;
            }
        } else {
            HashMap mapM2 = m(arrayList7);
            if (sizeA != null) {
                Iterator it6 = mapM2.keySet().iterator();
                while (it6.hasNext()) {
                    x((List) mapM2.get((Rational) it6.next()), sizeA, true);
                }
            }
            ArrayList arrayList9 = new ArrayList(mapM2.keySet());
            Collections.sort(arrayList9, new qu(rational, hx7Var.c));
            Iterator it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                for (Size size10 : (List) mapM2.get((Rational) it7.next())) {
                    if (!arrayList8.contains(size10)) {
                        arrayList8.add(size10);
                    }
                }
            }
        }
        return arrayList8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean n() {
        si3 si3Var = (si3) this.X;
        return si3Var.j0.getVisibility() == 0 && si3Var.l0.getVisibility() == 0 && si3Var.v0.getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean o() {
        si3 si3Var = (si3) this.X;
        return si3Var.j0.getVisibility() == 0 && si3Var.l0.getVisibility() == 0 && si3Var.w0.getVisibility() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean p() {
        if (((lh7) this.X).getValue() != this.Z) {
            return true;
        }
        zv7 zv7Var = (zv7) this.Y;
        return zv7Var != null && zv7Var.p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ov8 q() {
        return (si3) this.X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean s() {
        boolean zA;
        zv7 zv7Var;
        ck4 ck4Var = ((dw7) this.Y).n;
        if (ck4Var == null) {
            return false;
        }
        int iB = ((aw7) this.Z).b();
        b6 b6Var = ck4Var.X;
        l lVarI = b6Var.A0.I(iB + 1);
        if (lVarI == null) {
            zA = ck4.a(ck4Var, iB);
        } else if (lVarI instanceof yv7) {
            zA = ((ConstraintLayout) ((c6) ((yv7) lVarI).v.Y).j0).requestFocus();
        } else {
            l lVarI2 = b6Var.A0.I(iB + 2);
            aw7 aw7Var = lVarI2 instanceof aw7 ? (aw7) lVarI2 : null;
            zA = (aw7Var == null || (zv7Var = aw7Var.w) == null) ? ck4.a(ck4Var, iB) : ((si3) zv7Var.X).h0.requestFocus();
        }
        return zA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean t() {
        boolean zRequestFocus;
        ck4 ck4Var = ((dw7) this.Y).n;
        if (ck4Var == null) {
            return false;
        }
        b6 b6Var = ck4Var.X;
        l lVarI = b6Var.A0.I(((aw7) this.Z).b() - 2);
        if (lVarI instanceof aw7) {
            zRequestFocus = ((si3) ((aw7) lVarI).w.X).h0.requestFocus();
        } else {
            zRequestFocus = lVarI instanceof yv7 ? ((ConstraintLayout) ((c6) ((yv7) lVarI).v.Y).j0).requestFocus() : b6Var.i0.requestFocus();
        }
        return zRequestFocus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(String str, String str2, String str3, String str4) throws IOException {
        xa2 xa2Var = (xa2) this.Y;
        if (str2 == null || str3 == null) {
            u52.s("FIS auth token or FIS ID is empty");
            return;
        }
        xa2Var.a();
        uc2 uc2Var = xa2Var.c;
        String str5 = uc2Var.h;
        xa2Var.a();
        String str6 = uc2Var.a;
        if (str5 == null) {
            u52.s("Project ID or API Key is missing");
            return;
        }
        URL url = new URL(p61.n(oi0.t("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            url.toString();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                } catch (IOException unused2) {
                }
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode == 404 || responseCode == 403) {
                        u52.s(oi0.m("Topic ", str4, " failed: ", responseMessage));
                        return;
                    }
                    if (responseCode >= 500) {
                        u52.s("INTERNAL_SERVER_ERROR");
                        return;
                    }
                    throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                }
            } catch (IOException e) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e);
            }
        } catch (Throwable th) {
            try {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    inputStream2.close();
                }
            } catch (IOException unused3) {
            }
            try {
                InputStream errorStream2 = httpURLConnection.getErrorStream();
                if (errorStream2 != null) {
                    errorStream2.close();
                }
            } catch (IOException unused4) {
            }
            httpURLConnection.disconnect();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v() {
        ((TypedArray) this.Y).recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(iy iyVar) {
        em7 em7Var = new em7((byte) 10);
        we8 we8Var = (we8) this.Z;
        qz qzVar = (qz) this.X;
        y02 y02Var = (y02) this.Y;
        of1 of1Var = we8Var.c;
        lr lrVarA = qz.a();
        lrVarA.z(qzVar.a);
        lrVarA.f0 = fu5.X;
        lrVarA.Z = qzVar.b;
        qz qzVarE = lrVarA.e();
        fu6 fu6Var = new fu6((byte) 4);
        fu6Var.i0 = new HashMap();
        fu6Var.g0 = Long.valueOf(we8Var.a.j());
        fu6Var.h0 = Long.valueOf(we8Var.b.j());
        fu6Var.Y = "FCM_CLIENT_EVENT_LOGGING";
        wu4 wu4Var = iyVar.a;
        zz2 zz2Var = e06.a;
        zz2Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zz2Var.X(wu4Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        fu6Var.f0 = new s02(y02Var, byteArrayOutputStream.toByteArray());
        fu6Var.Z = null;
        of1Var.b.execute(new j0(of1Var, qzVarE, em7Var, fu6Var.v()));
    }

    public zv7(dw7 dw7Var, aw7 aw7Var, si3 si3Var) {
        this.Y = dw7Var;
        this.Z = aw7Var;
        this.X = si3Var;
    }

    public zv7(kf3 kf3Var, Method[] methodArr, Method method) {
        kf3Var.getClass();
        this.X = kf3Var;
        this.Y = methodArr;
        this.Z = method;
    }

    public zv7(Context context, TypedArray typedArray) {
        this.X = context;
        this.Y = typedArray;
    }

    public /* synthetic */ zv7(Object obj, Object obj2, Object obj3) {
        this.X = obj;
        this.Y = obj2;
        this.Z = obj3;
    }

    public zv7(rj8 rj8Var, zv7 zv7Var) {
        this.X = rj8Var;
        this.Y = zv7Var;
        this.Z = rj8Var.X;
    }

    public zv7(byte b) {
        switch (b) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                this.X = new WeakHashMap();
                this.Y = new WeakHashMap();
                this.Z = new WeakHashMap();
                break;
            case 11:
            default:
                this.X = null;
                break;
            case 12:
                List list = Collections.EMPTY_LIST;
                this.X = list;
                this.Y = list;
                break;
        }
    }
}
