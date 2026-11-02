.class public interface abstract annotation Lfp3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lfp3;
        content = .enum Ldp3;->X:Ldp3;
        contentFilter = Ljava/lang/Void;
        value = .enum Ldp3;->X:Ldp3;
        valueFilter = Ljava/lang/Void;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract content()Ldp3;
.end method

.method public abstract contentFilter()Ljava/lang/Class;
.end method

.method public abstract value()Ldp3;
.end method

.method public abstract valueFilter()Ljava/lang/Class;
.end method
