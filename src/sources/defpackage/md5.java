package defpackage;

import io.sentry.c2;
import java.io.Serializable;
import java.util.HashMap;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class md5 implements Serializable {
    public static final Class Y = Node.class;
    public static final oj3 Z;
    public static final md5 f0;
    public final HashMap X;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        oj3 oj3Var = null;
        try {
            oj3Var = nj3.a;
        } catch (Throwable th) {
            ue3.J(th);
        }
        Z = oj3Var;
        f0 = new md5();
    }

    public md5() {
        HashMap map = new HashMap();
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.X = map2;
        map2.put("java.sql.Timestamp", xb1.i0);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object a(dh8 dh8Var, Class cls) {
        try {
            return it0.g(cls, false);
        } catch (Throwable th) {
            ue3.J(th);
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + it0.n(dh8Var) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public static Object b(dh8 dh8Var, String str) {
        try {
            return a(dh8Var, Class.forName(str));
        } catch (Throwable th) {
            ue3.J(th);
            StringBuilder sbP = p61.p("Failed to find class `", str, "` for handling values of type ");
            sbP.append(it0.n(dh8Var));
            sbP.append(", problem: (");
            sbP.append(th.getClass().getName());
            sbP.append(") ");
            c2.l(sbP, th.getMessage());
            return null;
        }
    }
}
