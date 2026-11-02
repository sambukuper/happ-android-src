.class public abstract Lyk3;
.super Llb6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lpv3;
.implements Lgw3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lyu3;->k:Lyu3;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Llb6;-><init>(Lyu3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A(Lov3;Lyu3;)Lkb6;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string p1, "Property accessors can only be copied by copying the corresponding property"

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method

.method public final D()Lov3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lmk3;->Y:Lov3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final J()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lmk3;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p0
.end method

.method public final Q()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lmk3;->R()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public abstract T()Lcl3;
.end method

.method public final e()Lzw3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lmk3;->e()Lzw3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()Lex4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lex4;->Y:Lex4;

    .line 9
    .line 10
    return-object p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final s()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final y()Lwd0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
