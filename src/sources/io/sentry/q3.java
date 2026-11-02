package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface q3 extends Closeable {
    Long A();

    Object E0();

    void F0();

    TimeZone I(ILogger iLogger);

    String K();

    void K0();

    void L(boolean z);

    ArrayList M0(ILogger iLogger, a2 a2Var);

    HashMap Q(ILogger iLogger, a2 a2Var);

    void Q0();

    Double d0();

    String e0();

    boolean hasNext();

    void j0();

    Date l0(ILogger iLogger);

    Boolean m0();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    io.sentry.vendor.gson.stream.b peek();

    String r();

    void v();

    Float w0();

    Integer x();

    Object y0(ILogger iLogger, a2 a2Var);

    void z(ILogger iLogger, AbstractMap abstractMap, String str);
}
