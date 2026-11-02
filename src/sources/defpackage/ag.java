package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ag implements gn2 {
    public final /* synthetic */ byte X;
    public static final ag Y = new ag(0);
    public static final ag Z = new ag(1);
    public static final ag f0 = new ag(2);
    public static final ag g0 = new ag(3);
    public static final ag h0 = new ag(4);
    public static final ag i0 = new ag(5);
    public static final ag j0 = new ag(6);
    public static final ag k0 = new ag(7);
    public static final ag l0 = new ag(8);
    public static final ag m0 = new ag(9);
    public static final ag n0 = new ag(10);
    public static final ag o0 = new ag(11);
    public static final ag p0 = new ag(12);
    public static final ag q0 = new ag(13);
    public static final ag r0 = new ag(14);
    public static final ag s0 = new ag(15);
    public static final ag t0 = new ag(16);
    public static final ag u0 = new ag(17);
    public static final ag v0 = new ag(18);
    public static final ag w0 = new ag(19);
    public static final ag x0 = new ag(20);
    public static final ag y0 = new ag(21);
    public static final ag z0 = new ag(22);
    public static final ag A0 = new ag(23);
    public static final ag B0 = new ag(24);
    public static final ag C0 = new ag(25);
    public static final ag D0 = new ag(26);
    public static final ag E0 = new ag(27);
    public static final ag F0 = new ag(28);
    public static final ag G0 = new ag(29);

    public /* synthetic */ ag(byte b) {
        this.X = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        String string;
        Class<?> declaringClass;
        byte b = this.X;
        boolean z = false;
        d02 d02Var = d02.X;
        switch (b) {
            case 0:
                return dn8.a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    string.getClass();
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    string.getClass();
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    string.getClass();
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    string.getClass();
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    string.getClass();
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    string.getClass();
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    string.getClass();
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    string.getClass();
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    string.getClass();
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 2:
                ld0 ld0Var = (ld0) obj;
                int i = ta0.l;
                ld0Var.getClass();
                return Boolean.valueOf(wv0.m0(ff7.f, w45.z(ld0Var)));
            case 3:
                ld0 ld0Var2 = (ld0) obj;
                int i2 = ta0.l;
                ld0Var2.getClass();
                if ((ld0Var2 instanceof ho2) && wv0.m0(ff7.f, w45.z(ld0Var2))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                Class cls = (Class) obj;
                mj0 mj0Var = uc0.a;
                cls.getClass();
                return new ev3(cls);
            case 5:
                Class cls2 = (Class) obj;
                mj0 mj0Var2 = uc0.a;
                cls2.getClass();
                return new ew3(cls2);
            case 6:
                Class cls3 = (Class) obj;
                mj0 mj0Var3 = uc0.a;
                cls3.getClass();
                return w45.G(uc0.a(cls3), d02Var, false, d02Var, 8);
            case 7:
                Class cls4 = (Class) obj;
                mj0 mj0Var4 = uc0.a;
                cls4.getClass();
                return w45.G(uc0.a(cls4), d02Var, true, d02Var, 8);
            case 8:
                mj0 mj0Var5 = uc0.a;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 9:
                zu3 zu3Var = (zu3) obj;
                zu3Var.getClass();
                if (!zu3Var.n() || (declaringClass = zc1.M(zu3Var).getDeclaringClass()) == null) {
                    return null;
                }
                return yb6.a.b(declaringClass);
            case 10:
                zu3 zu3Var2 = (zu3) obj;
                zu3Var2.getClass();
                return zu3Var2.getTypeParameters();
            case 11:
                mo8 mo8Var = (mo8) obj;
                mo8Var.getClass();
                return Boolean.valueOf(mo8Var.n0() instanceof bo0);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((ho2) obj).getClass();
                return null;
            case 13:
                ((ho2) obj).getClass();
                return null;
            case 14:
                ((ho2) obj).getClass();
                return null;
            case 15:
                ld0 ld0Var3 = (ld0) obj;
                ld0Var3.getClass();
                return Boolean.valueOf(x97.C(ld0Var3));
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                sm smVar = (sm) obj;
                smVar.getClass();
                return new hu(smVar, (byte) 1);
            case 17:
                pv3 pv3Var = (pv3) obj;
                pv3Var.getClass();
                return "  - " + pv3Var + " (" + i21.F(pv3Var) + ')';
            case 18:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objR0 = eu.r0(bounds);
                if (objR0 instanceof TypeVariable) {
                    return (TypeVariable) objR0;
                }
                return null;
            case 19:
                Class cls5 = (Class) obj;
                cls5.getClass();
                if (Modifier.isStatic(cls5.getModifiers())) {
                    return null;
                }
                return cls5.getDeclaringClass();
            case 20:
                Class cls6 = (Class) obj;
                cls6.getClass();
                TypeVariable[] typeParameters = cls6.getTypeParameters();
                typeParameters.getClass();
                return eu.Y(typeParameters);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 22:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return eu.K0(actualTypeArguments);
            case 23:
                pv3 pv3Var2 = (pv3) obj;
                pv3Var2.getClass();
                return "  - " + pv3Var2 + " (" + i21.D(pv3Var2) + ')';
            case 24:
                mz3 mz3Var = (mz3) obj;
                mz3Var.getClass();
                return mz3Var.e;
            case 25:
                mz3 mz3Var2 = (mz3) obj;
                mz3Var2.getClass();
                return mz3Var2.c;
            case 26:
                t14 t14Var = (t14) obj;
                wk1 wk1Var = wk1.c;
                t14Var.getClass();
                return t14Var;
            case 27:
                wk1 wk1Var2 = wk1.c;
                return _UrlKt.FRAGMENT_ENCODE_SET;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                t14 t14Var2 = (t14) obj;
                nw3[] nw3VarArr = zk1.Z;
                t14Var2.getClass();
                return t14Var2;
            default:
                nw3[] nw3VarArr2 = zk1.Z;
                ((ot8) obj).getClass();
                return "...";
        }
    }
}
