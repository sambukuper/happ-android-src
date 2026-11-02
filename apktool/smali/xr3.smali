.class public interface abstract annotation Lxr3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lxr3;
        defaultImpl = Lxr3;
        include = .enum Ltr3;->X:Ltr3;
        property = ""
        requireTypeIdForSubtypes = .enum Ljd5;->Y:Ljd5;
        visible = false
        writeTypeIdForDefaultImpl = .enum Ljd5;->Y:Ljd5;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract defaultImpl()Ljava/lang/Class;
.end method

.method public abstract include()Ltr3;
.end method

.method public abstract property()Ljava/lang/String;
.end method

.method public abstract requireTypeIdForSubtypes()Ljd5;
.end method

.method public abstract use()Lur3;
.end method

.method public abstract visible()Z
.end method

.method public abstract writeTypeIdForDefaultImpl()Ljd5;
.end method
