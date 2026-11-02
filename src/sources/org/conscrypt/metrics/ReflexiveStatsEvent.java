package org.conscrypt.metrics;

import org.conscrypt.Platform;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ReflexiveStatsEvent {
    private static final Class<?> c_statsEvent;
    private static final OptionalMethod newBuilder;
    private static final boolean sdkVersionBiggerThan32;
    private final Object statsEvent;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class Builder {
        private static final OptionalMethod build;
        private static final Class<?> c_statsEvent_Builder;
        private static final OptionalMethod setAtomId;
        private static final OptionalMethod usePooledBuffer;
        private static final OptionalMethod writeBoolean;
        private static final OptionalMethod writeInt;
        private static final OptionalMethod writeIntArray;
        private static final OptionalMethod writeLong;
        private final Object builder;

        static {
            Class<?> clsInitStatsEventBuilderClass = initStatsEventBuilderClass();
            c_statsEvent_Builder = clsInitStatsEventBuilderClass;
            Class cls = Integer.TYPE;
            setAtomId = new OptionalMethod(clsInitStatsEventBuilderClass, "setAtomId", cls);
            writeBoolean = new OptionalMethod(clsInitStatsEventBuilderClass, "writeBoolean", Boolean.TYPE);
            writeInt = new OptionalMethod(clsInitStatsEventBuilderClass, "writeInt", cls);
            writeLong = new OptionalMethod(clsInitStatsEventBuilderClass, "writeLong", Long.TYPE);
            build = new OptionalMethod(clsInitStatsEventBuilderClass, "build", new Class[0]);
            usePooledBuffer = new OptionalMethod(clsInitStatsEventBuilderClass, "usePooledBuffer", new Class[0]);
            writeIntArray = new OptionalMethod(clsInitStatsEventBuilderClass, "writeIntArray", int[].class);
        }

        private Builder() {
            this.builder = ReflexiveStatsEvent.newBuilder.invokeStatic(new Object[0]);
        }

        private static Class<?> initStatsEventBuilderClass() {
            try {
                return Class.forName("android.util.StatsEvent$Builder");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public ReflexiveStatsEvent build() {
            return new ReflexiveStatsEvent(build.invoke(this.builder, new Object[0]));
        }

        public Builder setAtomId(int i) {
            setAtomId.invoke(this.builder, Integer.valueOf(i));
            return this;
        }

        public void usePooledBuffer() {
            usePooledBuffer.invoke(this.builder, new Object[0]);
        }

        public Builder writeBoolean(boolean z) {
            writeBoolean.invoke(this.builder, Boolean.valueOf(z));
            return this;
        }

        public Builder writeInt(int i) {
            writeInt.invoke(this.builder, Integer.valueOf(i));
            return this;
        }

        public Builder writeIntArray(int[] iArr) {
            if (ReflexiveStatsEvent.sdkVersionBiggerThan32) {
                writeIntArray.invoke(this.builder, iArr);
            }
            return this;
        }

        public Builder writeLong(long j) {
            writeLong.invoke(this.builder, Long.valueOf(j));
            return this;
        }
    }

    static {
        Class<?> clsInitStatsEventClass = initStatsEventClass();
        c_statsEvent = clsInitStatsEventClass;
        newBuilder = new OptionalMethod(clsInitStatsEventClass, "newBuilder", new Class[0]);
        sdkVersionBiggerThan32 = Platform.isSdkGreater(32);
    }

    private ReflexiveStatsEvent(Object obj) {
        this.statsEvent = obj;
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i, boolean z, int i2, int i3, int i4, int i5, int[] iArr) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setAtomId(i);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeIntArray(iArr);
        builderNewBuilder.usePooledBuffer();
        return builderNewBuilder.build();
    }

    private static Class<?> initStatsEventClass() {
        try {
            return Class.forName("android.util.StatsEvent");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Object getStatsEvent() {
        return this.statsEvent;
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i, boolean z, int i2, int i3, int i4, int i5) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setAtomId(i);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.usePooledBuffer();
        return builderNewBuilder.build();
    }
}
