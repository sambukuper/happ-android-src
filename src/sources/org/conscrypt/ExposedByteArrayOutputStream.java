package org.conscrypt;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposedByteArrayOutputStream() {
    }

    public byte[] array() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public void setCountManually(int i) {
        ((ByteArrayOutputStream) this).count = i;
    }

    public ExposedByteArrayOutputStream(int i) {
        super(i);
    }
}
