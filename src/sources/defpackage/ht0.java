package defpackage;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ht0 {
    public static final ht0 e = new ht0();
    public final Field a;
    public final Field b;
    public final String c;
    public final String d;

    public ht0() {
        String string;
        Field fieldA;
        String string2;
        Field fieldA2 = null;
        try {
            fieldA = a(EnumSet.class, "elementType");
            string = null;
        } catch (Exception e2) {
            string = e2.toString();
            fieldA = null;
        }
        this.a = fieldA;
        this.c = string;
        try {
            string2 = null;
            fieldA2 = a(EnumMap.class, "keyType");
        } catch (Exception e3) {
            string2 = e3.toString();
        }
        this.b = fieldA2;
        this.d = string2;
    }

    public static Field a(Class cls, String str) {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        bt.i(pc6.q("No field named '", str, "' in class '", cls.getName(), "'"));
        return null;
    }
}
