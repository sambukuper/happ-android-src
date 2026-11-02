.class public final Lmn4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Lnm4;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnm4;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmn4;->h0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lmn4;->i0:Lnm4;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lmn4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lmn4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmn4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Lmn4;

    .line 2
    .line 3
    iget-object v1, p0, Lmn4;->h0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lmn4;->i0:Lnm4;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lmn4;-><init>(Ljava/lang/String;Lnm4;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lmn4;->g0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lmn4;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb71;

    .line 4
    .line 5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lof7;->a:Lof7;

    .line 9
    .line 10
    new-instance p1, Lsn;

    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    iget-object v2, p0, Lmn4;->i0:Lnm4;

    .line 15
    .line 16
    iget-object p0, p0, Lmn4;->h0:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {p1, v0, v2, p0, v1}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lof7;->b(Ljava/lang/String;Lgn2;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ldn8;->a:Ldn8;

    .line 25
    .line 26
    return-object p0
.end method
