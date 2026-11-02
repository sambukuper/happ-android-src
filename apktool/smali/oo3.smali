.class public interface abstract annotation Loo3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Loo3;
        lenient = .enum Ljd5;->Y:Ljd5;
        locale = "##default"
        pattern = ""
        radix = -0x1
        shape = .enum Lmo3;->k0:Lmo3;
        timezone = "##default"
        with = {}
        without = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract lenient()Ljd5;
.end method

.method public abstract locale()Ljava/lang/String;
.end method

.method public abstract pattern()Ljava/lang/String;
.end method

.method public abstract radix()I
.end method

.method public abstract shape()Lmo3;
.end method

.method public abstract timezone()Ljava/lang/String;
.end method

.method public abstract with()[Lko3;
.end method

.method public abstract without()[Lko3;
.end method
