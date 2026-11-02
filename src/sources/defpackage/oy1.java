package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSession;
import org.conscrypt.ConscryptHostnameVerifier;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class oy1 implements i7, o48, b80, ln0, ConscryptHostnameVerifier, r61, gi1, d91, o64, t97, ry0, de3, de2, m22 {
    public final /* synthetic */ byte X;
    public static final oy1 Y = new oy1(1);
    public static final oy1 Z = new oy1(2);
    public static final rm f0 = new rm();
    public static final oy1 g0 = new oy1(4);
    public static final oy1 h0 = new oy1(5);
    public static final oy1 i0 = new oy1(6);
    public static final oy1 j0 = new oy1(7);
    public static final oy1 k0 = new oy1(8);
    public static final oy1 l0 = new oy1(9);
    public static final wc m0 = new wc(0);
    public static final wc n0 = new wc(1);
    public static final wc o0 = new wc(2);
    public static final /* synthetic */ oy1 p0 = new oy1(11);
    public static final oy1 q0 = new oy1(12);
    public static final oy1 r0 = new oy1(13);
    public static final oy1 s0 = new oy1(14);
    public static final oy1 t0 = new oy1(15);
    public static final oy1 u0 = new oy1(16);
    public static final oy1 v0 = new oy1(17);
    public static final oy1 w0 = new oy1(18);
    public static final oy1 x0 = new oy1(19);
    public static final oy1 y0 = new oy1(20);
    public static final oy1 z0 = new oy1(21);
    public static final s86 A0 = new s86(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ oy1 B0 = new oy1(23);
    public static final /* synthetic */ oy1 C0 = new oy1(24);
    public static final oy1 D0 = new oy1(25);
    public static final /* synthetic */ oy1 E0 = new oy1(26);
    public static final oy1 F0 = new oy1(27);
    public static final oy1 G0 = new oy1(28);
    public static final oy1 H0 = new oy1(29);

    public /* synthetic */ oy1(byte b) {
        this.X = b;
    }

    public static boolean A(jh8 jh8Var, xi8 xi8Var, ah8 ah8Var, zk6 zk6Var) {
        boolean zB;
        xi8Var.getClass();
        ah8Var.getClass();
        mh8 mh8VarE = xi8Var.E(zk6Var);
        int iK = xi8Var.k(ah8Var);
        mh8VarE.getClass();
        int iZ = xi8Var.Z(mh8VarE);
        if (iK == iZ && iK == xi8Var.c(zk6Var)) {
            for (int i = 0; i < iZ; i++) {
                bh8 bh8VarA0 = xi8Var.A0(zk6Var, i);
                bh8VarA0.getClass();
                x14 x14VarP = xi8Var.p(bh8VarA0);
                if (x14VarP != null) {
                    bh8 bh8VarY0 = xi8Var.y0(ah8Var, i);
                    bh8VarY0.getClass();
                    xi8Var.l(bh8VarY0);
                    x14 x14VarP2 = xi8Var.p(bh8VarY0);
                    x14VarP2.getClass();
                    dj8 dj8VarX = xi8Var.x(xi8Var.h0(mh8VarE, i));
                    dj8 dj8VarL = xi8Var.l(bh8VarA0);
                    dj8 dj8Var = dj8.INV;
                    if (dj8VarX == dj8Var) {
                        dj8VarX = dj8VarL;
                    } else if (dj8VarL != dj8Var && dj8VarX != dj8VarL) {
                        dj8VarX = null;
                    }
                    if (dj8VarX == null) {
                        return jh8Var.a;
                    }
                    if (dj8VarX == dj8Var) {
                        C(xi8Var, x14VarP2, x14VarP);
                        C(xi8Var, x14VarP, x14VarP2);
                    }
                    int i2 = jh8Var.f;
                    if (i2 > 100) {
                        b61.o(x14VarP2, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    jh8Var.f = i2 + 1;
                    int iOrdinal = dj8VarX.ordinal();
                    oy1 oy1Var = Y;
                    if (iOrdinal == 0) {
                        zB = B(oy1Var, jh8Var, x14VarP, x14VarP2);
                    } else if (iOrdinal == 1) {
                        zB = B(oy1Var, jh8Var, x14VarP2, x14VarP);
                    } else {
                        if (iOrdinal != 2) {
                            b61.c();
                            return false;
                        }
                        zB = v(jh8Var, x14VarP2, x14VarP);
                    }
                    jh8Var.f--;
                    if (!zB) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean B(oy1 oy1Var, jh8 jh8Var, x14 x14Var, x14 x14Var2) {
        xi8 xi8Var = jh8Var.c;
        x14Var.getClass();
        x14Var2.getClass();
        if (x14Var == x14Var2) {
            return true;
        }
        rn2 rn2VarP = xi8Var.P();
        Boolean bool = rn2VarP != null ? (Boolean) rn2VarP.K(x14Var, x14Var2) : null;
        return bool != null ? bool.booleanValue() : Y.u(jh8Var, xi8Var, x14Var, x14Var2);
    }

    public static void C(xi8 xi8Var, x14 x14Var, x14 x14Var2) {
        xi8Var.getClass();
        zk6 zk6VarT0 = xi8Var.t0(x14Var);
        if (zk6VarT0 instanceof fo0) {
            fo0 fo0Var = (fo0) zk6VarT0;
            if (xi8Var.d(fo0Var)) {
                return;
            }
            eo0 eo0VarR = xi8Var.r(fo0Var);
            eo0VarR.getClass();
            bh8 bh8VarF0 = xi8Var.f0(eo0VarR);
            bh8VarF0.getClass();
            if (xi8Var.j(bh8VarF0) && xi8Var.F(fo0Var) == un0.X) {
                xi8Var.p0(x14Var2);
            }
        }
    }

    public static void D(byte[] bArr, int i, ArrayList arrayList) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        byteBufferWrap.getShort();
        short s = byteBufferWrap.getShort();
        int i2 = byteBufferWrap.getShort() & 65535;
        int i3 = byteBufferWrap.getShort() & 65535;
        byteBufferWrap.getShort();
        byteBufferWrap.getShort();
        if ((s & 15) != 0) {
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            E(byteBufferWrap);
            byteBufferWrap.getShort();
            byteBufferWrap.getShort();
        }
        for (int i5 = 0; i5 < i3 && byteBufferWrap.remaining() >= 2; i5++) {
            E(byteBufferWrap);
            if (byteBufferWrap.remaining() < 10) {
                return;
            }
            int i6 = byteBufferWrap.getShort() & 65535;
            int i7 = byteBufferWrap.getShort() & 65535;
            byteBufferWrap.getInt();
            int i8 = byteBufferWrap.getShort() & 65535;
            if (byteBufferWrap.remaining() < i8) {
                byteBufferWrap.remaining();
                return;
            }
            if (i6 == 1 && i7 == 1 && i8 == 4) {
                byte[] bArr2 = new byte[4];
                byteBufferWrap.get(bArr2);
                ArrayList arrayList2 = new ArrayList(4);
                for (int i9 = 0; i9 < 4; i9++) {
                    arrayList2.add(Integer.valueOf(bArr2[i9] & 255));
                }
                arrayList.add(wv0.y0(arrayList2, ".", null, null, null, 62));
            } else {
                byteBufferWrap.position(byteBufferWrap.position() + i8);
            }
        }
    }

    public static void E(ByteBuffer byteBuffer) {
        byte b;
        int i;
        while (byteBuffer.hasRemaining() && (i = (b = byteBuffer.get()) & 255) != 0) {
            if ((b & 192) == 192) {
                if (byteBuffer.hasRemaining()) {
                    byteBuffer.get();
                    return;
                }
                return;
            } else {
                if (byteBuffer.remaining() < i) {
                    byteBuffer.position(byteBuffer.limit());
                    return;
                }
                byteBuffer.position(byteBuffer.position() + i);
            }
        }
    }

    public static byte[] p(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(new Random().nextInt(65535));
        dataOutputStream.writeShort(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        Iterator it = fm7.F0(str, new String[]{"."}, 6).iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(iq0.a);
            bytes.getClass();
            dataOutputStream.writeByte(bytes.length);
            dataOutputStream.write(bytes);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final boolean q(xi8 xi8Var, zk6 zk6Var) {
        xi8Var.getClass();
        if (!xi8Var.L(zk6Var)) {
            if (!(zk6Var instanceof fo0)) {
                return false;
            }
            eo0 eo0VarR = xi8Var.r((fo0) zk6Var);
            eo0VarR.getClass();
            bh8 bh8VarF0 = xi8Var.f0(eo0VarR);
            bh8VarF0.getClass();
            x14 x14VarP = xi8Var.p(bh8VarF0);
            if (x14VarP == null || !xi8Var.L(xi8Var.a0(x14VarP))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean r(xi8 xi8Var, jh8 jh8Var, zk6 zk6Var, zk6 zk6Var2, boolean z) {
        xi8Var.getClass();
        Collection<x14> collectionV = xi8Var.V(zk6Var);
        if ((collectionV instanceof Collection) && collectionV.isEmpty()) {
            return false;
        }
        for (x14 x14Var : collectionV) {
            x14Var.getClass();
            if (dh3.f(xi8Var.p0(x14Var), xi8Var.E(zk6Var2))) {
                return true;
            }
            if (z && B(Y, jh8Var, zk6Var2, x14Var)) {
                return true;
            }
        }
        return false;
    }

    public static List s(jh8 jh8Var, xi8 xi8Var, zk6 zk6Var, mh8 mh8Var) {
        dt7 dt7VarS;
        ih8 ih8Var = ih8.c;
        xi8Var.getClass();
        xi8Var.D0(zk6Var, mh8Var);
        if (xi8Var.s(mh8Var) || !xi8Var.v(zk6Var)) {
            if (!xi8Var.z0(mh8Var)) {
                oc7 oc7Var = new oc7();
                jh8Var.b();
                xi8 xi8Var2 = jh8Var.c;
                ArrayDeque arrayDeque = jh8Var.g;
                arrayDeque.getClass();
                pc7 pc7Var = jh8Var.h;
                pc7Var.getClass();
                arrayDeque.push(zk6Var);
                while (!arrayDeque.isEmpty()) {
                    zk6 zk6Var2 = (zk6) arrayDeque.pop();
                    zk6Var2.getClass();
                    if (pc7Var.add(zk6Var2)) {
                        zk6 zk6VarS0 = xi8Var.s0(zk6Var2);
                        if (zk6VarS0 == null) {
                            zk6VarS0 = zk6Var2;
                        }
                        if (xi8Var.i0(xi8Var.E(zk6VarS0), mh8Var)) {
                            oc7Var.add(zk6VarS0);
                            dt7VarS = ih8Var;
                        } else {
                            dt7VarS = xi8Var.c(zk6VarS0) == 0 ? ih8.b : xi8Var2.S(zk6VarS0);
                        }
                        if (dt7VarS.equals(ih8Var)) {
                            dt7VarS = null;
                        }
                        if (dt7VarS != null) {
                            Iterator it = xi8Var2.C(xi8Var2.E(zk6Var2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(dt7VarS.g(jh8Var, (x14) it.next()));
                            }
                        }
                    }
                }
                jh8Var.a();
                return oc7Var;
            }
            if (xi8Var.i0(xi8Var.E(zk6Var), mh8Var)) {
                zk6 zk6VarS1 = xi8Var.s0(zk6Var);
                if (zk6VarS1 != null) {
                    zk6Var = zk6VarS1;
                }
                return i21.K(zk6Var);
            }
        }
        return d02.X;
    }

    public static List t(jh8 jh8Var, xi8 xi8Var, zk6 zk6Var, mh8 mh8Var) {
        List listS = s(jh8Var, xi8Var, zk6Var, mh8Var);
        if (listS.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listS) {
                zk6 zk6Var2 = (zk6) obj;
                zk6Var2.getClass();
                ah8 ah8VarE0 = xi8Var.E0(zk6Var2);
                int iK = xi8Var.k(ah8VarE0);
                int i = 0;
                while (true) {
                    if (i >= iK) {
                        arrayList.add(obj);
                        break;
                    }
                    bh8 bh8VarY0 = xi8Var.y0(ah8VarE0, i);
                    bh8VarY0.getClass();
                    x14 x14VarP = xi8Var.p(bh8VarY0);
                    if ((x14VarP != null ? xi8Var.o0(x14VarP) : null) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listS;
    }

    public static boolean v(jh8 jh8Var, x14 x14Var, x14 x14Var2) {
        w79 w79Var = jh8Var.d;
        oc ocVar = jh8Var.e;
        x14Var.getClass();
        x14Var2.getClass();
        xi8 xi8Var = jh8Var.c;
        if (x14Var == x14Var2) {
            return true;
        }
        if (z(xi8Var, x14Var) && z(xi8Var, x14Var2)) {
            x14 x14VarL = w79Var.L(ocVar.C(x14Var));
            x14 x14VarL2 = w79Var.L(ocVar.C(x14Var2));
            zk6 zk6VarA = xi8Var.A(x14VarL);
            if (!xi8Var.i0(xi8Var.p0(x14VarL), xi8Var.p0(x14VarL2))) {
                return false;
            }
            if (xi8Var.c(zk6VarA) == 0) {
                return xi8Var.G(x14VarL) || xi8Var.G(x14VarL2) || xi8Var.C0(zk6VarA) == xi8Var.C0(xi8Var.A(x14VarL2));
            }
        }
        oy1 oy1Var = Y;
        return B(oy1Var, jh8Var, x14Var, x14Var2) && B(oy1Var, jh8Var, x14Var2, x14Var);
    }

    public static ji8 y(xi8 xi8Var, x14 x14Var, zk6 zk6Var) {
        x14 x14VarP;
        xi8Var.getClass();
        int iC = xi8Var.c(x14Var);
        int i = 0;
        while (true) {
            if (i >= iC) {
                return null;
            }
            bh8 bh8VarA0 = xi8Var.A0(x14Var, i);
            bh8VarA0.getClass();
            bh8 bh8Var = xi8Var.j(bh8VarA0) ? null : bh8VarA0;
            if (bh8Var != null && (x14VarP = xi8Var.p(bh8Var)) != null) {
                boolean z = xi8Var.j0(xi8Var.A(x14VarP)) && xi8Var.j0(xi8Var.A(zk6Var));
                if (x14VarP.equals(zk6Var) || (z && dh3.f(xi8Var.p0(x14VarP), xi8Var.p0(zk6Var)))) {
                    mh8 mh8VarP0 = xi8Var.p0(x14Var);
                    mh8VarP0.getClass();
                    return xi8Var.h0(mh8VarP0, i);
                }
                ji8 ji8VarY = y(xi8Var, x14VarP, zk6Var);
                if (ji8VarY != null) {
                    return ji8VarY;
                }
            }
            i++;
        }
    }

    public static boolean z(xi8 xi8Var, x14 x14Var) {
        xi8Var.getClass();
        x14Var.getClass();
        mh8 mh8VarP0 = xi8Var.p0(x14Var);
        mh8VarP0.getClass();
        if (!xi8Var.D(mh8VarP0)) {
            return false;
        }
        xi8Var.o(x14Var);
        return (xi8Var.H(x14Var) || xi8Var.l0(x14Var) || xi8Var.B0(x14Var)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object F(List list, String str, int i, pq1 pq1Var, s51 s51Var) {
        cr1 cr1Var;
        Object rj6Var;
        LinkedHashMap linkedHashMap;
        if (s51Var instanceof cr1) {
            cr1Var = (cr1) s51Var;
            int i2 = cr1Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cr1Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                cr1Var = new cr1(this, s51Var);
            }
        } else {
            cr1Var = new cr1(this, s51Var);
        }
        Object obj = cr1Var.g0;
        int i3 = cr1Var.i0;
        try {
            if (i3 == 0) {
                w39.n0(obj);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                er1 er1Var = new er1(list, str, i, linkedHashMap2, pq1Var, null);
                cr1Var.f0 = linkedHashMap2;
                cr1Var.i0 = 1;
                Object objN = gv3.n(er1Var, cr1Var);
                c71 c71Var = c71.X;
                if (objN == c71Var) {
                    return c71Var;
                }
                linkedHashMap = linkedHashMap2;
            } else {
                if (i3 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                LinkedHashMap linkedHashMap3 = cr1Var.f0;
                w39.n0(obj);
                linkedHashMap = linkedHashMap3;
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            rj6Var = linkedHashMap;
            if (zIsEmpty) {
                rj6Var = null;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }

    @Override // defpackage.d91
    public Iterable a(Object obj) {
        switch (this.X) {
            case 14:
                int i = el1.a;
                Collection collectionQ = ((ot8) obj).q();
                ArrayList arrayList = new ArrayList(xv0.Z(collectionQ, 10));
                Iterator it = ((ArrayList) collectionQ).iterator();
                while (it.hasNext()) {
                    arrayList.add(((ot8) it.next()).a());
                }
                return arrayList;
            default:
                int i2 = h54.p;
                Collection collectionC = ((sx4) obj).l().c();
                collectionC.getClass();
                return new gu(w27.m0(new hu(collectionC, (byte) 1), cl1.E0), (byte) 2);
        }
    }

    @Override // defpackage.de2
    public t14 b(nz5 nz5Var, String str, aa7 aa7Var, aa7 aa7Var2) {
        nz5Var.getClass();
        str.getClass();
        aa7Var.getClass();
        aa7Var2.getClass();
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return u32.c(s32.ERROR_FLEXIBLE_TYPE, str, aa7Var.toString(), aa7Var2.toString());
        }
        if (!nz5Var.l(lu3.f)) {
            return dh3.s(aa7Var, aa7Var2);
        }
        r66 r66Var = new r66(aa7Var, aa7Var2);
        v14.a.b(aa7Var, aa7Var2);
        return r66Var;
    }

    @Override // defpackage.b80
    public Rect c(Activity activity) throws Exception {
        switch (this.X) {
            case 6:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i2 = rect.right + dimensionPixelSize;
                        if (i2 == point.x) {
                            rect.right = i2;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    return new Rect((Rect) objInvoke);
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    b80.b.getClass();
                    return pz2.w0.c(activity);
                }
        }
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        switch (this.X) {
            case 20:
                Object objK = y5Var.k(new e26(p94.class, Executor.class));
                objK.getClass();
                return nr4.x((Executor) objK);
            default:
                Object objK2 = y5Var.k(new e26(ql8.class, Executor.class));
                objK2.getClass();
                return nr4.x((Executor) objK2);
        }
    }

    @Override // defpackage.i7
    public Collection e(sx4 sx4Var) {
        return d02.X;
    }

    @Override // defpackage.i7
    public Collection f(sx4 sx4Var) {
        sx4Var.getClass();
        return d02.X;
    }

    @Override // defpackage.o48
    public void j(zy0 zy0Var, lp2 lp2Var, int i) {
        lp2Var.X(-2101003086);
        int i2 = (lp2Var.f(this) ? 32 : 16) | i;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            zy0Var.K(lp2Var, 6);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 3, i, this, zy0Var);
        }
    }

    @Override // defpackage.i7
    public Collection k(sx4 sx4Var) {
        return d02.X;
    }

    @Override // defpackage.i7
    public Collection l(v15 v15Var, sx4 sx4Var) {
        sx4Var.getClass();
        return d02.X;
    }

    @Override // defpackage.gi1
    public float m(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.m22
    public Boolean o() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x021b  */
    /* JADX WARN: Code duplicated, block: B:160:0x027d  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:176:0x02be  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:190:0x0307  */
    /* JADX WARN: Code duplicated, block: B:191:0x030c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0314  */
    /* JADX WARN: Code duplicated, block: B:201:0x032a A[LOOP:9: B:199:0x0324->B:201:0x032a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0352 A[LOOP:10: B:203:0x034c->B:205:0x0352, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x037c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0395  */
    /* JADX WARN: Code duplicated, block: B:217:0x03a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:228:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:233:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0448  */
    /* JADX WARN: Code duplicated, block: B:245:0x0454  */
    /* JADX WARN: Code duplicated, block: B:250:0x046b  */
    /* JADX WARN: Code duplicated, block: B:252:0x047d  */
    /* JADX WARN: Code duplicated, block: B:254:0x048c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0491  */
    /* JADX WARN: Code duplicated, block: B:259:0x049f  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:267:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:271:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:277:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:281:0x0508 A[LOOP:7: B:275:0x04e4->B:281:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0401 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:310:0x04c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x04af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x04af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[LOOP:12: B:31:0x00a4->B:333:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[LOOP:13: B:47:0x00e8->B:336:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, xi8] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    public boolean u(jh8 jh8Var, xi8 xi8Var, x14 x14Var, x14 x14Var2) {
        Boolean boolValueOf;
        Boolean bool;
        mh8 mh8VarE;
        oc7<zk6> oc7Var;
        ArrayDeque arrayDeque;
        pc7 pc7Var;
        boolean z;
        ArrayList arrayList;
        List<zk6> listS;
        zk6 zk6Var;
        ih8 ih8Var;
        Iterator it;
        ArrayList<zk6> arrayList2;
        int size;
        mh8 mh8VarE2;
        mh8 mh8VarE3;
        ArrayDeque arrayDeque2;
        pc7 pc7Var2;
        zk6 zk6Var2;
        ih8 ih8Var2;
        Iterator it2;
        zk6 zk6VarG;
        mh8 mh8VarE4;
        at atVar;
        int iZ;
        ?? r6;
        boolean zA;
        boolean zA2;
        bh8 bh8VarW;
        x14 x14VarP;
        zk6 zk6VarT0;
        mh8 mh8VarE5;
        mh8 mh8VarE6;
        ji8 ji8VarY;
        Collection collectionC;
        Iterator it3;
        Collection collectionC2;
        Iterator it4;
        boolean z2;
        x14Var.getClass();
        oc ocVar = jh8Var.e;
        x14 x14VarC = ocVar.C(x14Var);
        w79 w79Var = jh8Var.d;
        x14 x14VarL = w79Var.L(x14VarC);
        x14Var2.getClass();
        x14 x14VarL2 = w79Var.L(ocVar.C(x14Var2));
        xi8Var.getClass();
        x14VarL.getClass();
        zk6 zk6VarA = xi8Var.A(x14VarL);
        x14VarL2.getClass();
        zk6 zk6VarA0 = xi8Var.a0(x14VarL2);
        boolean z3 = false;
        boolean z4 = true;
        if (!xi8Var.J0(zk6VarA) && !xi8Var.J0(zk6VarA0)) {
            xi8Var.n0(zk6VarA);
            xi8Var.Y(zk6VarA);
            xi8Var.Y(zk6VarA0);
            fo0 fo0VarU0 = xi8Var.u0(zk6VarA0);
            x14 x14VarB = fo0VarU0 != null ? xi8Var.B(fo0VarU0) : null;
            if (fo0VarU0 == null || x14VarB == null) {
                mh8VarE5 = xi8Var.E(zk6VarA0);
                mh8VarE5.getClass();
                if (xi8Var.q(mh8VarE5)) {
                    collectionC2 = xi8Var.C(mh8VarE5);
                    if (!(collectionC2 instanceof Collection) && collectionC2.isEmpty()) {
                        z2 = true;
                        break;
                    }
                    it4 = collectionC2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z2 = true;
                            break;
                        }
                        if (!B(Y, jh8Var, zk6VarA, (x14) it4.next())) {
                            z2 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } else {
                    mh8VarE6 = xi8Var.E(zk6VarA);
                    if (zk6VarA instanceof fo0) {
                        ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                        if (ji8VarY == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        mh8VarE6.getClass();
                        if (xi8Var.q(mh8VarE6)) {
                            collectionC = xi8Var.C(mh8VarE6);
                            if ((collectionC instanceof Collection) || !collectionC.isEmpty()) {
                                it3 = collectionC.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                                        if (ji8VarY == null && xi8Var.a(ji8VarY, xi8Var.E(zk6VarA0))) {
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    } else if (!(((x14) it3.next()) instanceof fo0)) {
                                    }
                                }
                            } else {
                                ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                                if (ji8VarY == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (xi8Var.C0(zk6VarA0)) {
                    x14VarB = xi8Var.I0(x14VarB);
                } else if (xi8Var.J(zk6VarA0)) {
                    x14VarB = xi8Var.W(x14VarB);
                }
                if (B(this, jh8Var, zk6VarA, x14VarB)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    mh8VarE5 = xi8Var.E(zk6VarA0);
                    mh8VarE5.getClass();
                    if (xi8Var.q(mh8VarE5)) {
                        collectionC2 = xi8Var.C(mh8VarE5);
                        if (!(collectionC2 instanceof Collection)) {
                            it4 = collectionC2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!B(Y, jh8Var, zk6VarA, (x14) it4.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        } else {
                            it4 = collectionC2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!B(Y, jh8Var, zk6VarA, (x14) it4.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        mh8VarE6 = xi8Var.E(zk6VarA);
                        if (zk6VarA instanceof fo0) {
                            mh8VarE6.getClass();
                            if (xi8Var.q(mh8VarE6)) {
                                collectionC = xi8Var.C(mh8VarE6);
                                if (collectionC instanceof Collection) {
                                    it3 = collectionC.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                                            if (ji8VarY == null) {
                                            }
                                        } else if (!(((x14) it3.next()) instanceof fo0)) {
                                        }
                                    }
                                } else {
                                    it3 = collectionC.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                                            if (ji8VarY == null) {
                                            }
                                        } else if (!(((x14) it3.next()) instanceof fo0)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        } else {
                            ji8VarY = y(xi8Var, zk6VarA0, zk6VarA);
                            if (ji8VarY == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        }
                    }
                }
            }
        } else if (jh8Var.a) {
            boolValueOf = Boolean.TRUE;
        } else if (!xi8Var.C0(zk6VarA) || xi8Var.C0(zk6VarA0)) {
            if (!xi8Var.J0(zk6VarA)) {
                zk6VarA = xi8Var.g(zk6VarA);
            }
            if (!xi8Var.J0(zk6VarA0)) {
                zk6VarA0 = xi8Var.g(zk6VarA0);
            }
            zk6VarA.getClass();
            zk6VarA0.getClass();
            boolValueOf = Boolean.valueOf(z39.I(xi8Var, zk6VarA, zk6VarA0));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        zk6 zk6VarA2 = xi8Var.A(x14VarL);
        zk6 zk6VarA1 = xi8Var.a0(x14VarL2);
        ih8 ih8Var3 = ih8.c;
        ih8 ih8Var4 = ih8.b;
        xi8 xi8Var2 = jh8Var.c;
        if (!xi8Var2.C0(zk6VarA1) && !xi8Var2.l0(zk6VarA2) && !xi8Var2.J(zk6VarA2) && ((!(zk6VarA2 instanceof fo0) || !xi8Var2.w0((fo0) zk6VarA2)) && !z68.R(jh8Var, zk6VarA2, ih8Var4))) {
            if (xi8Var2.J(zk6VarA1) || z68.R(jh8Var, zk6VarA1, ih8.d) || xi8Var2.v(zk6VarA2)) {
                return false;
            }
            mh8 mh8VarE7 = xi8Var2.E(zk6VarA1);
            mh8VarE7.getClass();
            if (!z68.Y(jh8Var, zk6VarA2, mh8VarE7)) {
                jh8Var.b();
                ArrayDeque arrayDeque3 = jh8Var.g;
                arrayDeque3.getClass();
                pc7 pc7Var3 = jh8Var.h;
                pc7Var3.getClass();
                arrayDeque3.push(zk6VarA2);
                loop0: while (true) {
                    if (arrayDeque3.isEmpty()) {
                        jh8Var.a();
                        return false;
                    }
                    zk6 zk6Var3 = (zk6) arrayDeque3.pop();
                    zk6Var3.getClass();
                    if (pc7Var3.add(zk6Var3)) {
                        ih8 ih8Var5 = xi8Var2.C0(zk6Var3) ? ih8Var3 : ih8Var4;
                        if (ih8Var5.equals(ih8Var3)) {
                            ih8Var5 = null;
                        }
                        if (ih8Var5 == null) {
                            continue;
                        } else {
                            Iterator it5 = xi8Var2.C(xi8Var2.E(zk6Var3)).iterator();
                            while (it5.hasNext()) {
                                zk6 zk6VarG2 = ih8Var5.g(jh8Var, (x14) it5.next());
                                if (z68.Y(jh8Var, zk6VarG2, mh8VarE7)) {
                                    jh8Var.a();
                                    break loop0;
                                }
                                arrayDeque3.add(zk6VarG2);
                            }
                        }
                    }
                }
            }
        }
        if (!xi8Var.L(zk6VarA2) && !xi8Var.L(zk6VarA1)) {
            bool = null;
        } else if (q(xi8Var, zk6VarA2) && q(xi8Var, zk6VarA1)) {
            bool = Boolean.TRUE;
        } else if (xi8Var.L(zk6VarA2)) {
            if (r(xi8Var, jh8Var, zk6VarA2, zk6VarA1, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (xi8Var.L(zk6VarA1)) {
            mh8 mh8VarE8 = xi8Var.E(zk6VarA2);
            if (mh8VarE8 instanceof qg3) {
                Collection collectionC3 = xi8Var.C(mh8VarE8);
                if (!(collectionC3 instanceof Collection) || !collectionC3.isEmpty()) {
                    Iterator it6 = collectionC3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            x14 x14Var3 = (x14) it6.next();
                            x14Var3.getClass();
                            zk6 zk6VarT1 = xi8Var.t0(x14Var3);
                            if (zk6VarT1 == null || !xi8Var.L(zk6VarT1)) {
                            }
                        } else if (!r(xi8Var, jh8Var, zk6VarA1, zk6VarA2, true)) {
                            bool = null;
                        }
                    }
                } else if (!r(xi8Var, jh8Var, zk6VarA1, zk6VarA2, true)) {
                    bool = null;
                }
            } else if (!r(xi8Var, jh8Var, zk6VarA1, zk6VarA2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        mh8 mh8VarE9 = xi8Var.E(zk6VarA1);
        if (xi8Var.i0(xi8Var.E(zk6VarA2), mh8VarE9)) {
            mh8VarE9.getClass();
            if (xi8Var.Z(mh8VarE9) != 0) {
                mh8VarE = xi8Var.E(zk6VarA1);
                mh8VarE.getClass();
                if (!xi8Var.v0(mh8VarE)) {
                    mh8VarE9.getClass();
                    if (xi8Var2.v(zk6VarA2)) {
                        if (!xi8Var2.s(mh8VarE9) || xi8Var2.q0(mh8VarE9)) {
                            oc7Var = new oc7();
                            jh8Var.b();
                            arrayDeque = jh8Var.g;
                            arrayDeque.getClass();
                            pc7Var = jh8Var.h;
                            pc7Var.getClass();
                            arrayDeque.push(zk6VarA2);
                            while (!arrayDeque.isEmpty()) {
                                zk6Var = (zk6) arrayDeque.pop();
                                zk6Var.getClass();
                                if (!pc7Var.add(zk6Var)) {
                                    if (xi8Var2.v(zk6Var)) {
                                        oc7Var.add(zk6Var);
                                        ih8Var = ih8Var3;
                                    } else {
                                        ih8Var = ih8Var4;
                                    }
                                    if (ih8Var.equals(ih8Var3)) {
                                        ih8Var = null;
                                    }
                                    if (ih8Var == null) {
                                        it = xi8Var2.C(xi8Var2.E(zk6Var)).iterator();
                                        while (it.hasNext()) {
                                            arrayDeque.add(ih8Var.g(jh8Var, (x14) it.next()));
                                            z3 = z3;
                                        }
                                    }
                                }
                            }
                            z = z3;
                            jh8Var.a();
                            arrayList = new ArrayList();
                            for (zk6 zk6Var4 : oc7Var) {
                                zk6Var4.getClass();
                                bw0.d0(arrayList, t(jh8Var, xi8Var2, zk6Var4, mh8VarE9));
                            }
                            listS = arrayList;
                        } else {
                            listS = s(jh8Var, xi8Var2, zk6VarA2, mh8VarE9);
                        }
                        listS.size();
                        arrayList2 = new ArrayList(xv0.Z(listS, 10));
                        for (zk6 zk6Var5 : listS) {
                            zk6Var5.getClass();
                            x14 x14VarL3 = jh8Var.d.L(zk6Var5);
                            x14VarL3.getClass();
                            zk6VarT0 = xi8Var.t0(x14VarL3);
                            if (zk6VarT0 == null) {
                                zk6Var5 = zk6VarT0;
                            }
                            arrayList2.add(zk6Var5);
                        }
                        size = arrayList2.size();
                        if (size != 0) {
                            mh8VarE2 = xi8Var.E(zk6VarA2);
                            mh8VarE2.getClass();
                            if (xi8Var.s(mh8VarE2)) {
                                return xi8Var.x0(mh8VarE2);
                            }
                            mh8VarE3 = xi8Var.E(zk6VarA2);
                            mh8VarE3.getClass();
                            if (xi8Var.x0(mh8VarE3)) {
                                return true;
                            }
                            jh8Var.b();
                            arrayDeque2 = jh8Var.g;
                            arrayDeque2.getClass();
                            pc7Var2 = jh8Var.h;
                            pc7Var2.getClass();
                            arrayDeque2.push(zk6VarA2);
                            while (!arrayDeque2.isEmpty()) {
                                zk6Var2 = (zk6) arrayDeque2.pop();
                                zk6Var2.getClass();
                                if (!pc7Var2.add(zk6Var2)) {
                                    if (xi8Var.v(zk6Var2)) {
                                        ih8Var2 = ih8Var3;
                                    } else {
                                        ih8Var2 = ih8Var4;
                                    }
                                    if (ih8Var2.equals(ih8Var3)) {
                                        ih8Var2 = null;
                                    }
                                    if (ih8Var2 == null) {
                                        continue;
                                    } else {
                                        it2 = xi8Var2.C(xi8Var2.E(zk6Var2)).iterator();
                                        while (it2.hasNext()) {
                                            zk6VarG = ih8Var2.g(jh8Var, (x14) it2.next());
                                            zk6VarG.getClass();
                                            mh8VarE4 = xi8Var.E(zk6VarG);
                                            mh8VarE4.getClass();
                                            if (xi8Var.x0(mh8VarE4)) {
                                                jh8Var.a();
                                                return true;
                                            }
                                            arrayDeque2.add(zk6VarG);
                                        }
                                    }
                                }
                            }
                            jh8Var.a();
                            return z;
                        }
                        if (size != 1) {
                            zk6 zk6Var6 = (zk6) wv0.q0(arrayList2);
                            zk6Var6.getClass();
                            return A(jh8Var, xi8Var, xi8Var.E0(zk6Var6), zk6VarA1);
                        }
                        atVar = new at(xi8Var.Z(mh8VarE9));
                        iZ = xi8Var.Z(mh8VarE9);
                        r6 = z;
                        while (true) {
                            if (r6 < iZ) {
                                zA = A(jh8Var, xi8Var, atVar, zk6VarA1);
                                break;
                            }
                            if (xi8Var.x(xi8Var.h0(mh8VarE9, r6)) != dj8.OUT) {
                                zA = z;
                                break;
                            }
                            ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
                            for (zk6 zk6Var7 : arrayList2) {
                                zk6Var7.getClass();
                                bh8VarW = xi8Var.w(zk6Var7, r6);
                                if (bh8VarW != null) {
                                    boolean z5 = z4;
                                    if (xi8Var.l(bh8VarW) != dj8.INV) {
                                        bh8VarW = null;
                                    }
                                    if (bh8VarW == null && (x14VarP = xi8Var.p(bh8VarW)) != null) {
                                        arrayList3.add(x14VarP);
                                        z4 = z5;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + zk6Var7 + ", subType: " + zk6VarA2 + ", superType: " + zk6VarA1).toString());
                            }
                            boolean z6 = z4;
                            x14 x14VarD0 = xi8Var.d0(arrayList3);
                            x14VarD0.getClass();
                            atVar.add(xi8Var.e0(x14VarD0));
                            z4 = z6;
                            r6++;
                        }
                        if (zA) {
                            return z4;
                        }
                        zA2 = z;
                        for (zk6 zk6Var8 : arrayList2) {
                            if (zA2) {
                                zk6Var8.getClass();
                                zA2 = A(jh8Var, xi8Var, xi8Var.E0(zk6Var8), zk6VarA1);
                            }
                        }
                        return zA2;
                    }
                    listS = t(jh8Var, xi8Var2, zk6VarA2, mh8VarE9);
                    z = false;
                    listS.size();
                    arrayList2 = new ArrayList(xv0.Z(listS, 10));
                    while (r11.hasNext()) {
                        zk6Var5.getClass();
                        x14 x14VarL4 = jh8Var.d.L(zk6Var5);
                        x14VarL4.getClass();
                        zk6VarT0 = xi8Var.t0(x14VarL4);
                        if (zk6VarT0 == null) {
                            zk6Var5 = zk6VarT0;
                        }
                        arrayList2.add(zk6Var5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        mh8VarE2 = xi8Var.E(zk6VarA2);
                        mh8VarE2.getClass();
                        if (xi8Var.s(mh8VarE2)) {
                            return xi8Var.x0(mh8VarE2);
                        }
                        mh8VarE3 = xi8Var.E(zk6VarA2);
                        mh8VarE3.getClass();
                        if (xi8Var.x0(mh8VarE3)) {
                            return true;
                        }
                        jh8Var.b();
                        arrayDeque2 = jh8Var.g;
                        arrayDeque2.getClass();
                        pc7Var2 = jh8Var.h;
                        pc7Var2.getClass();
                        arrayDeque2.push(zk6VarA2);
                        while (!arrayDeque2.isEmpty()) {
                            zk6Var2 = (zk6) arrayDeque2.pop();
                            zk6Var2.getClass();
                            if (!pc7Var2.add(zk6Var2)) {
                                if (xi8Var.v(zk6Var2)) {
                                    ih8Var2 = ih8Var3;
                                } else {
                                    ih8Var2 = ih8Var4;
                                }
                                if (ih8Var2.equals(ih8Var3)) {
                                    ih8Var2 = null;
                                }
                                if (ih8Var2 == null) {
                                    continue;
                                } else {
                                    it2 = xi8Var2.C(xi8Var2.E(zk6Var2)).iterator();
                                    while (it2.hasNext()) {
                                        zk6VarG = ih8Var2.g(jh8Var, (x14) it2.next());
                                        zk6VarG.getClass();
                                        mh8VarE4 = xi8Var.E(zk6VarG);
                                        mh8VarE4.getClass();
                                        if (xi8Var.x0(mh8VarE4)) {
                                            jh8Var.a();
                                            return true;
                                        }
                                        arrayDeque2.add(zk6VarG);
                                    }
                                }
                            }
                        }
                        jh8Var.a();
                        return z;
                    }
                    if (size != 1) {
                        zk6 zk6Var9 = (zk6) wv0.q0(arrayList2);
                        zk6Var9.getClass();
                        return A(jh8Var, xi8Var, xi8Var.E0(zk6Var9), zk6VarA1);
                    }
                    atVar = new at(xi8Var.Z(mh8VarE9));
                    iZ = xi8Var.Z(mh8VarE9);
                    r6 = z;
                    while (true) {
                        if (r6 < iZ) {
                            zA = A(jh8Var, xi8Var, atVar, zk6VarA1);
                            break;
                        }
                        if (xi8Var.x(xi8Var.h0(mh8VarE9, r6)) != dj8.OUT) {
                            zA = z;
                            break;
                        }
                        ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList2, 10));
                        while (r13.hasNext()) {
                            zk6Var7.getClass();
                            bh8VarW = xi8Var.w(zk6Var7, r6);
                            if (bh8VarW != null) {
                                boolean z7 = z4;
                                if (xi8Var.l(bh8VarW) != dj8.INV) {
                                    bh8VarW = null;
                                }
                                if (bh8VarW == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + zk6Var7 + ", subType: " + zk6VarA2 + ", superType: " + zk6VarA1).toString());
                        }
                        boolean z8 = z4;
                        x14 x14VarD1 = xi8Var.d0(arrayList4);
                        x14VarD1.getClass();
                        atVar.add(xi8Var.e0(x14VarD1));
                        z4 = z8;
                        r6++;
                    }
                    if (zA) {
                        return z4;
                    }
                    zA2 = z;
                    while (r3.hasNext()) {
                        if (zA2) {
                            zk6Var8.getClass();
                            zA2 = A(jh8Var, xi8Var, xi8Var.E0(zk6Var8), zk6VarA1);
                        }
                    }
                    return zA2;
                }
            }
        } else {
            mh8VarE = xi8Var.E(zk6VarA1);
            mh8VarE.getClass();
            if (!xi8Var.v0(mh8VarE)) {
                mh8VarE9.getClass();
                if (xi8Var2.v(zk6VarA2)) {
                    if (xi8Var2.s(mh8VarE9)) {
                    }
                    oc7Var = new oc7();
                    jh8Var.b();
                    arrayDeque = jh8Var.g;
                    arrayDeque.getClass();
                    pc7Var = jh8Var.h;
                    pc7Var.getClass();
                    arrayDeque.push(zk6VarA2);
                    while (!arrayDeque.isEmpty()) {
                        zk6Var = (zk6) arrayDeque.pop();
                        zk6Var.getClass();
                        if (!pc7Var.add(zk6Var)) {
                            if (xi8Var2.v(zk6Var)) {
                                oc7Var.add(zk6Var);
                                ih8Var = ih8Var3;
                            } else {
                                ih8Var = ih8Var4;
                            }
                            if (ih8Var.equals(ih8Var3)) {
                                ih8Var = null;
                            }
                            if (ih8Var == null) {
                                it = xi8Var2.C(xi8Var2.E(zk6Var)).iterator();
                                while (it.hasNext()) {
                                    arrayDeque.add(ih8Var.g(jh8Var, (x14) it.next()));
                                    z3 = z3;
                                }
                            }
                        }
                    }
                    z = z3;
                    jh8Var.a();
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        zk6Var4.getClass();
                        bw0.d0(arrayList, t(jh8Var, xi8Var2, zk6Var4, mh8VarE9));
                    }
                    listS = arrayList;
                    listS.size();
                    arrayList2 = new ArrayList(xv0.Z(listS, 10));
                    while (r11.hasNext()) {
                        zk6Var5.getClass();
                        x14 x14VarL5 = jh8Var.d.L(zk6Var5);
                        x14VarL5.getClass();
                        zk6VarT0 = xi8Var.t0(x14VarL5);
                        if (zk6VarT0 == null) {
                            zk6Var5 = zk6VarT0;
                        }
                        arrayList2.add(zk6Var5);
                    }
                    size = arrayList2.size();
                    if (size != 0) {
                        mh8VarE2 = xi8Var.E(zk6VarA2);
                        mh8VarE2.getClass();
                        if (xi8Var.s(mh8VarE2)) {
                            return xi8Var.x0(mh8VarE2);
                        }
                        mh8VarE3 = xi8Var.E(zk6VarA2);
                        mh8VarE3.getClass();
                        if (xi8Var.x0(mh8VarE3)) {
                            return true;
                        }
                        jh8Var.b();
                        arrayDeque2 = jh8Var.g;
                        arrayDeque2.getClass();
                        pc7Var2 = jh8Var.h;
                        pc7Var2.getClass();
                        arrayDeque2.push(zk6VarA2);
                        while (!arrayDeque2.isEmpty()) {
                            zk6Var2 = (zk6) arrayDeque2.pop();
                            zk6Var2.getClass();
                            if (!pc7Var2.add(zk6Var2)) {
                                if (xi8Var.v(zk6Var2)) {
                                    ih8Var2 = ih8Var3;
                                } else {
                                    ih8Var2 = ih8Var4;
                                }
                                if (ih8Var2.equals(ih8Var3)) {
                                    ih8Var2 = null;
                                }
                                if (ih8Var2 == null) {
                                    continue;
                                } else {
                                    it2 = xi8Var2.C(xi8Var2.E(zk6Var2)).iterator();
                                    while (it2.hasNext()) {
                                        zk6VarG = ih8Var2.g(jh8Var, (x14) it2.next());
                                        zk6VarG.getClass();
                                        mh8VarE4 = xi8Var.E(zk6VarG);
                                        mh8VarE4.getClass();
                                        if (xi8Var.x0(mh8VarE4)) {
                                            jh8Var.a();
                                            return true;
                                        }
                                        arrayDeque2.add(zk6VarG);
                                    }
                                }
                            }
                        }
                        jh8Var.a();
                        return z;
                    }
                    if (size != 1) {
                        zk6 zk6Var10 = (zk6) wv0.q0(arrayList2);
                        zk6Var10.getClass();
                        return A(jh8Var, xi8Var, xi8Var.E0(zk6Var10), zk6VarA1);
                    }
                    atVar = new at(xi8Var.Z(mh8VarE9));
                    iZ = xi8Var.Z(mh8VarE9);
                    r6 = z;
                    while (true) {
                        if (r6 < iZ) {
                            zA = A(jh8Var, xi8Var, atVar, zk6VarA1);
                            break;
                        }
                        if (xi8Var.x(xi8Var.h0(mh8VarE9, r6)) != dj8.OUT) {
                            zA = z;
                            break;
                        }
                        ArrayList arrayList5 = new ArrayList(xv0.Z(arrayList2, 10));
                        while (r13.hasNext()) {
                            zk6Var7.getClass();
                            bh8VarW = xi8Var.w(zk6Var7, r6);
                            if (bh8VarW != null) {
                                boolean z9 = z4;
                                if (xi8Var.l(bh8VarW) != dj8.INV) {
                                    bh8VarW = null;
                                }
                                if (bh8VarW == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + zk6Var7 + ", subType: " + zk6VarA2 + ", superType: " + zk6VarA1).toString());
                        }
                        boolean z10 = z4;
                        x14 x14VarD2 = xi8Var.d0(arrayList5);
                        x14VarD2.getClass();
                        atVar.add(xi8Var.e0(x14VarD2));
                        z4 = z10;
                        r6++;
                    }
                    if (zA) {
                        return z4;
                    }
                    zA2 = z;
                    while (r3.hasNext()) {
                        if (zA2) {
                            zk6Var8.getClass();
                            zA2 = A(jh8Var, xi8Var, xi8Var.E0(zk6Var8), zk6VarA1);
                        }
                    }
                    return zA2;
                }
                listS = t(jh8Var, xi8Var2, zk6VarA2, mh8VarE9);
                z = false;
                listS.size();
                arrayList2 = new ArrayList(xv0.Z(listS, 10));
                while (r11.hasNext()) {
                    zk6Var5.getClass();
                    x14 x14VarL6 = jh8Var.d.L(zk6Var5);
                    x14VarL6.getClass();
                    zk6VarT0 = xi8Var.t0(x14VarL6);
                    if (zk6VarT0 == null) {
                        zk6Var5 = zk6VarT0;
                    }
                    arrayList2.add(zk6Var5);
                }
                size = arrayList2.size();
                if (size != 0) {
                    mh8VarE2 = xi8Var.E(zk6VarA2);
                    mh8VarE2.getClass();
                    if (xi8Var.s(mh8VarE2)) {
                        return xi8Var.x0(mh8VarE2);
                    }
                    mh8VarE3 = xi8Var.E(zk6VarA2);
                    mh8VarE3.getClass();
                    if (xi8Var.x0(mh8VarE3)) {
                        return true;
                    }
                    jh8Var.b();
                    arrayDeque2 = jh8Var.g;
                    arrayDeque2.getClass();
                    pc7Var2 = jh8Var.h;
                    pc7Var2.getClass();
                    arrayDeque2.push(zk6VarA2);
                    while (!arrayDeque2.isEmpty()) {
                        zk6Var2 = (zk6) arrayDeque2.pop();
                        zk6Var2.getClass();
                        if (!pc7Var2.add(zk6Var2)) {
                            if (xi8Var.v(zk6Var2)) {
                                ih8Var2 = ih8Var3;
                            } else {
                                ih8Var2 = ih8Var4;
                            }
                            if (ih8Var2.equals(ih8Var3)) {
                                ih8Var2 = null;
                            }
                            if (ih8Var2 == null) {
                                continue;
                            } else {
                                it2 = xi8Var2.C(xi8Var2.E(zk6Var2)).iterator();
                                while (it2.hasNext()) {
                                    zk6VarG = ih8Var2.g(jh8Var, (x14) it2.next());
                                    zk6VarG.getClass();
                                    mh8VarE4 = xi8Var.E(zk6VarG);
                                    mh8VarE4.getClass();
                                    if (xi8Var.x0(mh8VarE4)) {
                                        jh8Var.a();
                                        return true;
                                    }
                                    arrayDeque2.add(zk6VarG);
                                }
                            }
                        }
                    }
                    jh8Var.a();
                    return z;
                }
                if (size != 1) {
                    zk6 zk6Var11 = (zk6) wv0.q0(arrayList2);
                    zk6Var11.getClass();
                    return A(jh8Var, xi8Var, xi8Var.E0(zk6Var11), zk6VarA1);
                }
                atVar = new at(xi8Var.Z(mh8VarE9));
                iZ = xi8Var.Z(mh8VarE9);
                r6 = z;
                while (true) {
                    if (r6 < iZ) {
                        zA = A(jh8Var, xi8Var, atVar, zk6VarA1);
                        break;
                    }
                    if (xi8Var.x(xi8Var.h0(mh8VarE9, r6)) != dj8.OUT) {
                        zA = z;
                        break;
                    }
                    ArrayList arrayList6 = new ArrayList(xv0.Z(arrayList2, 10));
                    while (r13.hasNext()) {
                        zk6Var7.getClass();
                        bh8VarW = xi8Var.w(zk6Var7, r6);
                        if (bh8VarW != null) {
                            boolean z11 = z4;
                            if (xi8Var.l(bh8VarW) != dj8.INV) {
                                bh8VarW = null;
                            }
                            if (bh8VarW == null) {
                            }
                        }
                        throw new IllegalStateException(("Incorrect type: " + zk6Var7 + ", subType: " + zk6VarA2 + ", superType: " + zk6VarA1).toString());
                    }
                    boolean z12 = z4;
                    x14 x14VarD3 = xi8Var.d0(arrayList6);
                    x14VarD3.getClass();
                    atVar.add(xi8Var.e0(x14VarD3));
                    z4 = z12;
                    r6++;
                }
                if (zA) {
                    return z4;
                }
                zA2 = z;
                while (r3.hasNext()) {
                    if (zA2) {
                        zk6Var8.getClass();
                        zA2 = A(jh8Var, xi8Var, xi8Var.E0(zk6Var8), zk6VarA1);
                    }
                }
                return zA2;
            }
        }
        return true;
    }

    @Override // org.conscrypt.ConscryptHostnameVerifier
    public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        return true;
    }

    public boolean w() {
        return this instanceof bq4;
    }

    public void x(float f, float f2, float f3, l77 l77Var) {
        l77Var.c(f, 0.0f);
    }

    @Override // defpackage.o64
    public void cancel() {
    }

    @Override // defpackage.o64
    public void g() {
    }

    @Override // defpackage.t97
    public void lock() {
    }

    @Override // defpackage.t97
    public void unlock() {
    }

    @Override // defpackage.de3
    public void i(g48 g48Var) {
    }
}
