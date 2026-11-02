package io.sentry;

import defpackage.b8;
import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements o1 {
    public static final Charset c = Charset.forName("UTF-8");
    public final s6 a;
    public final HashMap b;

    public o2(s6 s6Var) {
        this.a = s6Var;
        HashMap map = new HashMap();
        this.b = map;
        byte b = 4;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(b));
        map.put(g.class, new f((byte) 0));
        byte b2 = 5;
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(b2));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a((byte) 6));
        byte b3 = 7;
        map.put(DebugImage.class, new io.sentry.clientreport.a(b3));
        byte b4 = 8;
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(b4));
        byte b5 = 9;
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(b5));
        byte b6 = 10;
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a(b6));
        byte b7 = 12;
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(b7));
        byte b8 = 14;
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(b8));
        map.put(io.sentry.protocol.b0.class, new io.sentry.clientreport.a((byte) 29));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a((byte) 15));
        byte b9 = 16;
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a(b9));
        byte b10 = 17;
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a(b10));
        byte b11 = 18;
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(b11));
        map.put(w3.class, new f((byte) 1));
        byte b12 = 2;
        map.put(x3.class, new f(b12));
        byte b13 = 3;
        map.put(z3.class, new f(b13));
        map.put(a4.class, new f(b));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(b12));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(b13));
        byte b14 = 19;
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(b14));
        map.put(f4.class, new f(b2));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.d0(b5));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.d0(b6));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.d0(b7));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.d0(b8));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.d0(b9));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.d0(b10));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.d0(b11));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a((byte) 20));
        byte b15 = 21;
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(b15));
        map.put(c5.class, new f(b3));
        map.put(i5.class, new f(b4));
        map.put(j5.class, new f(b5));
        byte b16 = 22;
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(b16));
        map.put(r5.class, new f(b6));
        map.put(s5.class, new f((byte) 11));
        map.put(t5.class, new f(b7));
        map.put(v5.class, new f((byte) 15));
        map.put(z5.class, new f(b11));
        byte b17 = 24;
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(b17));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a((byte) 25));
        map.put(u6.class, new f(b14));
        byte b18 = 26;
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(b18));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a((byte) 27));
        map.put(io.sentry.protocol.c0.class, new io.sentry.clientreport.a((byte) 28));
        map.put(w4.class, new f((byte) 6));
        map.put(io.sentry.protocol.e0.class, new io.sentry.protocol.d0((byte) 0));
        map.put(io.sentry.protocol.f0.class, new io.sentry.protocol.d0((byte) 1));
        map.put(d7.class, new f(b15));
        map.put(f7.class, new f(b16));
        map.put(h7.class, new f((byte) 23));
        map.put(j7.class, new f(b17));
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.d0(b12));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a((byte) 13));
        map.put(q7.class, new f(b18));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a((byte) 0));
        map.put(io.sentry.protocol.k0.class, new io.sentry.protocol.d0(b));
        map.put(io.sentry.protocol.j0.class, new io.sentry.protocol.d0((byte) 3));
    }

    @Override // io.sentry.o1
    public final void a(Object obj, Writer writer) throws IOException {
        io.sentry.util.b.s(obj, "The entity is required.");
        s6 s6Var = this.a;
        ILogger logger = s6Var.getLogger();
        s5 s5Var = s5.DEBUG;
        if (logger.i(s5Var)) {
            s6Var.getLogger().h(s5Var, "Serializing object: %s", f(obj, s6Var.isEnablePrettySerializationOutput()));
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(writer, s6Var.getMaxDepth());
        ((b8) cVar.Z).n(cVar, s6Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.o1
    public final Object b(Reader reader, Class cls) {
        Object objE0;
        s6 s6Var = this.a;
        try {
            m2 m2Var = new m2(reader);
            try {
                a2 a2Var = (a2) this.b.get(cls);
                if (a2Var != null) {
                    objE0 = cls.cast(a2Var.a(m2Var, s6Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        m2Var.close();
                        return null;
                    }
                    objE0 = m2Var.E0();
                }
                m2Var.close();
                return objE0;
            } catch (Throwable th) {
                try {
                    m2Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            s6Var.getLogger().e(s5.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.o1
    public final io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream) {
        s6 s6Var = this.a;
        try {
            return s6Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            s6Var.getLogger().e(s5.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.o1
    public final String d(Map map) {
        return f(map, false);
    }

    @Override // io.sentry.o1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        s6 s6Var = this.a;
        io.sentry.util.b.s(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c), 512);
        try {
            ((c5) cVar.Y).serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, s6Var.getMaxDepth()), s6Var.getLogger());
            bufferedWriter.write("\n");
            for (h5 h5Var : (Iterable) cVar.Z) {
                try {
                    byte[] bArrG = h5Var.g();
                    h5Var.a.serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, s6Var.getMaxDepth()), s6Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrG);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    s6Var.getLogger().e(s5.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    public final String f(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        s6 s6Var = this.a;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(stringWriter, s6Var.getMaxDepth());
        if (z) {
            cVar.s("\t");
        }
        ((b8) cVar.Z).n(cVar, s6Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
