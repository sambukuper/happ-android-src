package io.sentry;

import defpackage.s91;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements t0, y0, a1, d4, t1, u1, m5, ILogger {
    public static final u2 X = new u2();
    public static final u2 Y = new u2();
    public static final u2 Z = new u2();
    public static final u2 f0 = new u2();
    public static final u2 g0 = new u2();

    @Override // io.sentry.d4
    /* JADX INFO: renamed from: Y */
    public c4 getO0() {
        return c3.a;
    }

    @Override // io.sentry.t1
    public z3 b(b7 b7Var, List list, s6 s6Var) {
        return null;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.w c(io.sentry.protocol.k kVar, n0 n0Var) {
        return io.sentry.protocol.w.Y;
    }

    @Override // io.sentry.ILogger
    public void d(s5 s5Var, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(s5Var + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.ILogger
    public void e(s5 s5Var, String str, Throwable th) {
        if (th == null) {
            h(s5Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(s5Var + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.u1
    public io.sentry.transport.g f(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(sentryAndroidOptions, new s91(sentryAndroidOptions.getMonotonicTicker(), sentryAndroidOptions), sentryAndroidOptions.getTransportGate(), cVar);
    }

    @Override // io.sentry.d4
    public io.sentry.protocol.w g() {
        return io.sentry.protocol.w.Y;
    }

    @Override // io.sentry.ILogger
    public void h(s5 s5Var, String str, Object... objArr) {
        System.out.println(s5Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean i(s5 s5Var) {
        return true;
    }

    @Override // io.sentry.t1
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.d4
    public io.sentry.protocol.w k(Boolean bool) {
        return io.sentry.protocol.w.Y;
    }

    @Override // io.sentry.m5
    public boolean p() {
        return false;
    }

    @Override // io.sentry.d4
    public void D() {
    }

    @Override // io.sentry.d4
    public void U() {
    }

    @Override // io.sentry.t1
    public void close() {
    }

    @Override // io.sentry.t1
    public void start() {
    }

    @Override // io.sentry.d4
    public void stop() {
    }

    @Override // io.sentry.d4
    public void C(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.d4
    public void J(io.sentry.android.replay.d dVar) {
    }

    @Override // io.sentry.d4
    public void X(String str) {
    }

    @Override // io.sentry.t1
    public void a(s1 s1Var) {
    }

    @Override // io.sentry.d4
    public void m(boolean z) {
    }
}
