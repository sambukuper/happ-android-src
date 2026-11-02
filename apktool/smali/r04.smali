.class public final Lr04;
.super Lh14;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lwv3;


# instance fields
.field public final o0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lkz3;Lyu3;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct/range {p0 .. p5}, Lh14;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lkz3;Lyu3;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lzk3;

    .line 17
    .line 18
    const/4 p2, 0x7

    .line 19
    invoke-direct {p1, p0, p2}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Lw74;->X:Lw74;

    .line 23
    .line 24
    invoke-static {p2, p1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lr04;->o0:Lg44;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final A(Lov3;Lyu3;)Lkb6;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lr04;

    .line 8
    .line 9
    sget-object v3, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, p0, Ll14;->g0:Lkz3;

    .line 12
    .line 13
    iget-object v2, p0, Ll14;->Z:Ljava/lang/String;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lr04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lkz3;Lyu3;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final d()Luv3;
    .locals 0

    .line 1
    iget-object p0, p0, Lr04;->o0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lq04;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Lvv3;
    .locals 0

    .line 10
    iget-object p0, p0, Lr04;->o0:Lg44;

    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq04;

    return-object p0
.end method
