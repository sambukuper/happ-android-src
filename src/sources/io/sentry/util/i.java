package io.sentry.util;

import defpackage.u52;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.q3;
import io.sentry.s5;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q3 {
    public final ArrayDeque X;

    public i(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.X = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.q3
    public final Long A() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return Long.valueOf(((Number) objG).longValue());
        }
        return null;
    }

    @Override // io.sentry.q3
    public final Object E0() {
        return g();
    }

    @Override // io.sentry.q3
    public final void F0() throws IOException {
        ArrayDeque arrayDeque = this.X;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            u52.s("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            u52.s("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.q3
    public final TimeZone I(ILogger iLogger) {
        String str = (String) g();
        if (str != null) {
            return DesugarTimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.q3
    public final String K() {
        return (String) g();
    }

    @Override // io.sentry.q3
    public final void K0() {
        ArrayDeque arrayDeque = this.X;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.q3
    public final ArrayList M0(ILogger iLogger, a2 a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (g() == null) {
                return null;
            }
            c.b(peek(), "Expected null but was ");
            return null;
        }
        try {
            Q0();
            ArrayList arrayList = new ArrayList();
            while (peek() != io.sentry.vendor.gson.stream.b.END_ARRAY) {
                int size = this.X.size();
                try {
                    arrayList.add(a2Var.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.e(s5.WARNING, "Failed to deserialize object in list.", e);
                    k(size);
                }
            }
            K0();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.q3
    public final HashMap Q(ILogger iLogger, a2 a2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (g() == null) {
                return null;
            }
            c.b(peek(), "Expected null but was ");
            return null;
        }
        try {
            F0();
            HashMap map = new HashMap();
            if (peek() == io.sentry.vendor.gson.stream.b.NAME) {
                while (true) {
                    String strE0 = e0();
                    int size = this.X.size();
                    try {
                        map.put(strE0, a2Var.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.e(s5.WARNING, "Failed to deserialize object in map.", e);
                        k(size);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            j0();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.q3
    public final void Q0() throws IOException {
        ArrayDeque arrayDeque = this.X;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            u52.s("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            u52.s("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.clear();
    }

    @Override // io.sentry.q3
    public final Double d0() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return Double.valueOf(((Number) objG).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.q3
    public final String e0() throws IOException {
        Map.Entry entry = (Map.Entry) this.X.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        c.b(peek(), "Expected a name but was ");
        return null;
    }

    public final Object g() throws IOException {
        try {
            ArrayDeque arrayDeque = this.X;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // io.sentry.q3
    public final boolean hasNext() {
        return !this.X.isEmpty();
    }

    @Override // io.sentry.q3
    public final void j0() {
        ArrayDeque arrayDeque = this.X;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    public final void k(int i) {
        while (true) {
            ArrayDeque arrayDeque = this.X;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.q3
    public final Date l0(ILogger iLogger) {
        String str = (String) g();
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.h(str);
            } catch (Exception unused) {
                return io.sentry.config.a.i(str);
            }
        } catch (Exception e) {
            iLogger.e(s5.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // io.sentry.q3
    public final Boolean m0() {
        return (Boolean) g();
    }

    @Override // io.sentry.q3
    public final double nextDouble() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return ((Number) objG).doubleValue();
        }
        u52.s("Expected double");
        return 0.0d;
    }

    @Override // io.sentry.q3
    public final float nextFloat() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return ((Number) objG).floatValue();
        }
        u52.s("Expected float");
        return 0.0f;
    }

    @Override // io.sentry.q3
    public final int nextInt() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return ((Number) objG).intValue();
        }
        u52.s("Expected int");
        return 0;
    }

    @Override // io.sentry.q3
    public final long nextLong() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return ((Number) objG).longValue();
        }
        u52.s("Expected long");
        return 0L;
    }

    @Override // io.sentry.q3
    public final io.sentry.vendor.gson.stream.b peek() {
        ArrayDeque arrayDeque = this.X;
        if (arrayDeque.isEmpty()) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        if (entry.getKey() != null) {
            return io.sentry.vendor.gson.stream.b.NAME;
        }
        Object value = entry.getValue();
        if (value instanceof Map) {
            return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
        }
        if (value instanceof List) {
            return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
        }
        if (value instanceof String) {
            return io.sentry.vendor.gson.stream.b.STRING;
        }
        if (value instanceof Number) {
            return io.sentry.vendor.gson.stream.b.NUMBER;
        }
        if (value instanceof Boolean) {
            return io.sentry.vendor.gson.stream.b.BOOLEAN;
        }
        return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.q3
    public final String r() throws IOException {
        String str = (String) g();
        if (str != null) {
            return str;
        }
        u52.s("Expected string");
        return null;
    }

    @Override // io.sentry.q3
    public final void v() {
        ArrayDeque arrayDeque = this.X;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.q3
    public final Float w0() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return Float.valueOf(((Number) objG).floatValue());
        }
        return null;
    }

    @Override // io.sentry.q3
    public final Integer x() throws IOException {
        Object objG = g();
        if (objG instanceof Number) {
            return Integer.valueOf(((Number) objG).intValue());
        }
        return null;
    }

    @Override // io.sentry.q3
    public final Object y0(ILogger iLogger, a2 a2Var) {
        ArrayDeque arrayDeque = this.X;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (iLogger != null) {
            return a2Var.a(this, iLogger);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // io.sentry.q3
    public final void z(ILogger iLogger, AbstractMap abstractMap, String str) {
        int size = this.X.size();
        try {
            abstractMap.put(str, g());
        } catch (Exception e) {
            iLogger.d(s5.ERROR, e, "Error deserializing unknown key: %s", str);
            k(size);
        }
    }

    @Override // io.sentry.q3
    public final void L(boolean z) {
    }
}
