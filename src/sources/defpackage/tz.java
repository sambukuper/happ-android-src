package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tz implements dn2 {
    public static final tz Y = new tz((byte) 0);
    public static final tz Z = new tz((byte) 1);
    public static final tz f0 = new tz((byte) 2);
    public static final tz g0 = new tz((byte) 3);
    public static final tz h0 = new tz((byte) 4);
    public static final tz i0 = new tz((byte) 5);
    public static final tz j0 = new tz((byte) 6);
    public static final tz k0 = new tz((byte) 7);
    public static final tz l0 = new tz((byte) 8);
    public static final tz m0 = new tz((byte) 9);
    public static final tz n0 = new tz((byte) 10);
    public static final tz o0 = new tz((byte) 11);
    public static final tz p0 = new tz((byte) 12);
    public static final tz q0 = new tz((byte) 13);
    public static final tz r0 = new tz((byte) 14);
    public final /* synthetic */ byte X;

    public tz(sf3 sf3Var) {
        this.X = (byte) 15;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws IllegalAccessException {
        ok1 ok1Var;
        ok1 ok1Var2;
        byte b = this.X;
        int i = 0;
        d02 d02Var = d02.X;
        Class cls = Void.TYPE;
        switch (b) {
            case 0:
                return new dw0(z51.d(1308617531));
            case 1:
                la0 la0Var = la0.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(ma0.class, ma0.class.getClassLoader());
                serviceLoaderLoad.getClass();
                ma0 ma0Var = (ma0) wv0.s0(serviceLoaderLoad);
                if (ma0Var != null) {
                    return ma0Var;
                }
                bt.i("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new dw0(dw0.b);
            case 3:
                ee1 ee1Var = new ee1(new ve4("DefaultBuiltIns"));
                ee1Var.c();
                return ee1Var;
            case 4:
                nw3[] nw3VarArr = wj1.k0;
                cls.getClass();
                return cls;
            case 5:
                ra raVar = pk1.c;
                Field[] fields = pk1.class.getFields();
                fields.getClass();
                ArrayList<Field> arrayList = new ArrayList();
                int length = fields.length;
                while (i < length) {
                    Field field = fields[i];
                    if (Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                    i++;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Field field2 : arrayList) {
                    Object obj = field2.get(null);
                    pk1 pk1Var = obj instanceof pk1 ? (pk1) obj : null;
                    if (pk1Var != null) {
                        int i2 = pk1Var.b;
                        String name = field2.getName();
                        name.getClass();
                        ok1Var = new ok1(i2, name);
                    } else {
                        ok1Var = null;
                    }
                    if (ok1Var != null) {
                        arrayList2.add(ok1Var);
                    }
                }
                return arrayList2;
            case 6:
                ra raVar2 = pk1.c;
                Field[] fields2 = pk1.class.getFields();
                fields2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int length2 = fields2.length;
                while (i < length2) {
                    Field field3 = fields2[i];
                    if (Modifier.isStatic(field3.getModifiers())) {
                        arrayList3.add(field3);
                    }
                    i++;
                }
                ArrayList<Field> arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (dh3.f(((Field) obj2).getType(), Integer.TYPE)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Field field4 : arrayList4) {
                    Object obj3 = field4.get(null);
                    obj3.getClass();
                    int iIntValue = ((Integer) obj3).intValue();
                    if (iIntValue == ((-iIntValue) & iIntValue)) {
                        String name2 = field4.getName();
                        name2.getClass();
                        ok1Var2 = new ok1(iIntValue, name2);
                    } else {
                        ok1Var2 = null;
                    }
                    if (ok1Var2 != null) {
                        arrayList5.add(ok1Var2);
                    }
                }
                return arrayList5;
            case 7:
                int i3 = tl1.h;
                return d02Var;
            case 8:
                Set set = zl1.b;
                return d02Var;
            case 9:
                i32 i32Var = i32.X;
                return (ee1) ee1.f.getValue();
            case 10:
                return null;
            case 11:
                nw3[] nw3VarArr2 = dk3.g;
                Map mapSingletonMap = Collections.singletonMap(uj3.a, new bm7("Deprecated in Java"));
                mapSingletonMap.getClass();
                return mapSingletonMap;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                av4 av4Var = av4.a;
                ServiceLoader serviceLoaderLoad2 = ServiceLoader.load(bv4.class, bv4.class.getClassLoader());
                serviceLoaderLoad2.getClass();
                List listY0 = wv0.Y0(serviceLoaderLoad2);
                if (!listY0.isEmpty()) {
                    return listY0;
                }
                bt.i("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 13:
                return "There is more input to consume";
            case 14:
                pw3 pw3Var = rg7.a;
                cls.getClass();
                return cls;
            default:
                throw null;
        }
    }

    public /* synthetic */ tz(byte b) {
        this.X = b;
    }
}
