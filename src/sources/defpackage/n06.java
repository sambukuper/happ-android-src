package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n06 implements c85 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final x82 f = new x82("key", p61.s(p61.r(k06.class, new ov(1))));
    public static final x82 g = new x82("value", p61.s(p61.r(k06.class, new ov(2))));
    public static final pn3 h = new pn3((byte) 1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final o06 d = new o06(this);

    public n06(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
    }

    public static int h(x82 x82Var) {
        k06 k06Var = (k06) ((Annotation) x82Var.b.get(k06.class));
        if (k06Var != null) {
            return k06Var.tag();
        }
        throw new z02("Field has no @Protobuf config");
    }

    @Override // defpackage.c85
    public final c85 a(x82 x82Var, Object obj) {
        f(x82Var, obj, true);
        return this;
    }

    public final void b(x82 x82Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        k06 k06Var = (k06) ((Annotation) x82Var.b.get(k06.class));
        if (k06Var == null) {
            throw new z02("Field has no @Protobuf config");
        }
        int iOrdinal = k06Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(k06Var.tag() << 3);
            i(i);
        } else if (iOrdinal == 1) {
            i(k06Var.tag() << 3);
            i((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((k06Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void c(x82 x82Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        k06 k06Var = (k06) ((Annotation) x82Var.b.get(k06.class));
        if (k06Var == null) {
            throw new z02("Field has no @Protobuf config");
        }
        int iOrdinal = k06Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(k06Var.tag() << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(k06Var.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((k06Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.c85
    public final c85 d(x82 x82Var, int i) {
        b(x82Var, i, true);
        return this;
    }

    @Override // defpackage.c85
    public final c85 e(x82 x82Var, long j) throws IOException {
        c(x82Var, j, true);
        return this;
    }

    public final void f(x82 x82Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(x82Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(x82Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(h, x82Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(x82Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            i((h(x82Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(x82Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(x82Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(x82Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        b85 b85Var = (b85) this.b.get(obj.getClass());
        if (b85Var != null) {
            g(b85Var, x82Var, obj, z);
            return;
        }
        ht8 ht8Var = (ht8) this.c.get(obj.getClass());
        if (ht8Var != null) {
            o06 o06Var = this.d;
            o06Var.a = false;
            o06Var.c = x82Var;
            o06Var.b = z;
            ht8Var.a(obj, o06Var);
            return;
        }
        if (obj instanceof g06) {
            b(x82Var, ((g06) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(x82Var, ((Enum) obj).ordinal(), true);
        } else {
            g(w79.b, x82Var, obj, z);
        }
    }

    public final void g(b85 b85Var, x82 x82Var, Object obj, boolean z) throws IOException {
        h84 h84Var = new h84();
        h84Var.X = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = h84Var;
            try {
                b85Var.a(obj, this);
                this.a = outputStream;
                long j = h84Var.X;
                h84Var.close();
                if (z && j == 0) {
                    return;
                }
                i((h(x82Var) << 3) | 2);
                j(j);
                b85Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h84Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void j(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
