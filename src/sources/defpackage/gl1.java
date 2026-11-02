package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gl1 {
    public static final fl1 a;
    public static final fl1 b;
    public static final fl1 c;
    public static final fl1 d;
    public static final fl1 e;
    public static final fl1 f;
    public static final fl1 g;
    public static final fl1 h;
    public static final fl1 i;
    public static final fl1 j;
    public static final be k;
    public static final ra l;
    public static final be m;
    public static final xx4 n;
    public static final HashMap o;

    static {
        xy8 xy8Var = xy8.f0;
        fl1 fl1Var = new fl1(xy8Var, (byte) 0);
        a = fl1Var;
        yy8 yy8Var = yy8.f0;
        fl1 fl1Var2 = new fl1(yy8Var, (byte) 1);
        b = fl1Var2;
        zy8 zy8Var = zy8.f0;
        fl1 fl1Var3 = new fl1(zy8Var, (byte) 2);
        c = fl1Var3;
        uy8 uy8Var = uy8.f0;
        fl1 fl1Var4 = new fl1(uy8Var, (byte) 3);
        d = fl1Var4;
        az8 az8Var = az8.f0;
        fl1 fl1Var5 = new fl1(az8Var, (byte) 4);
        e = fl1Var5;
        wy8 wy8Var = wy8.f0;
        fl1 fl1Var6 = new fl1(wy8Var, (byte) 5);
        f = fl1Var6;
        ty8 ty8Var = ty8.f0;
        fl1 fl1Var7 = new fl1(ty8Var, (byte) 6);
        g = fl1Var7;
        vy8 vy8Var = vy8.f0;
        fl1 fl1Var8 = new fl1(vy8Var, (byte) 7);
        h = fl1Var8;
        bz8 bz8Var = bz8.f0;
        fl1 fl1Var9 = new fl1(bz8Var, (byte) 8);
        i = fl1Var9;
        Collections.unmodifiableSet(eu.L0(new fl1[]{fl1Var, fl1Var2, fl1Var4, fl1Var6}));
        HashMap map = new HashMap(6);
        map.put(fl1Var2, 0);
        map.put(fl1Var, 0);
        map.put(fl1Var4, 1);
        map.put(fl1Var3, 1);
        map.put(fl1Var5, 2);
        Collections.unmodifiableMap(map);
        j = fl1Var5;
        k = new be((byte) 23);
        byte b2 = 24;
        l = new ra(b2, false);
        m = new be(b2);
        try {
            Iterator it = Arrays.asList(new xx4[0]).iterator();
            n = it.hasNext() ? (xx4) it.next() : xx4.a;
            HashMap map2 = new HashMap();
            o = map2;
            map2.put(xy8Var, fl1Var);
            map2.put(yy8Var, fl1Var2);
            map2.put(zy8Var, fl1Var3);
            map2.put(uy8Var, fl1Var4);
            map2.put(az8Var, fl1Var5);
            map2.put(wy8Var, fl1Var6);
            map2.put(ty8Var, fl1Var7);
            map2.put(vy8Var, fl1Var8);
            map2.put(bz8Var, fl1Var9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(fl1 fl1Var, fl1 fl1Var2) {
        if (fl1Var == null) {
            a(12);
            throw null;
        }
        l5 l5Var = fl1Var.a;
        if (fl1Var2 == null) {
            a(13);
            throw null;
        }
        l5 l5Var2 = fl1Var2.a;
        Integer numA = l5Var.a(l5Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = l5Var2.a(l5Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static jd1 c(i86 i86Var, ld0 ld0Var, ed1 ed1Var) {
        jd1 jd1VarC;
        if (ld0Var == null) {
            a(8);
            throw null;
        }
        for (jd1 jd1Var = (jd1) ld0Var.a(); jd1Var != null && jd1Var.e() != f; jd1Var = (jd1) bl1.h(jd1Var, jd1.class, true)) {
            if (!jd1Var.e().a(i86Var, jd1Var, ed1Var)) {
                return jd1Var;
            }
        }
        if (!(ld0Var instanceof yg8) || (jd1VarC = c(i86Var, ((yg8) ld0Var).J0, ed1Var)) == null) {
            return null;
        }
        return jd1VarC;
    }

    public static boolean d(ed1 ed1Var, ed1 ed1Var2) {
        lh4 lh4VarE = bl1.e(ed1Var2);
        return lh4VarE != lh4.F0 && lh4VarE == bl1.e(ed1Var);
    }

    public static boolean e(fl1 fl1Var) {
        if (fl1Var != null) {
            return fl1Var == a || fl1Var == b;
        }
        a(14);
        throw null;
    }

    public static boolean f(ld0 ld0Var, ed1 ed1Var) {
        return c(l, ld0Var, ed1Var) == null;
    }

    public static fl1 g(l5 l5Var) {
        if (l5Var == null) {
            a(15);
            throw null;
        }
        fl1 fl1Var = (fl1) o.get(l5Var);
        if (fl1Var != null) {
            return fl1Var;
        }
        u52.j(l5Var, "Inapplicable visibility: ");
        return null;
    }
}
