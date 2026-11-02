.class public abstract Lzh1;
.super Lyh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Y:Laa7;


# direct methods
.method public constructor <init>(Laa7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzh1;->Y:Laa7;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic t0(Lch8;)Lmo8;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lzh1;->v0(Lch8;)Laa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u0(Z)Laa7;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyh1;->o0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lzh1;->Y:Laa7;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Laa7;->u0(Z)Laa7;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lyh1;->m0()Lch8;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, p0}, Laa7;->v0(Lch8;)Laa7;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final v0(Lch8;)Laa7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lyh1;->m0()Lch8;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lea7;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lea7;-><init>(Laa7;Lch8;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    return-object p0
.end method

.method public final w0()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lzh1;->Y:Laa7;

    .line 2
    .line 3
    return-object p0
.end method
