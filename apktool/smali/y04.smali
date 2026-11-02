.class public final Ly04;
.super Lp04;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final k0:Liz3;

.field public final l0:Lg44;

.field public final m0:Lg44;

.field public final n0:Lg44;


# direct methods
.method public constructor <init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Liz3;Lyu3;)V
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
    invoke-direct {p0, p1, p2, p3, p5}, Lp04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Lyu3;)V

    .line 14
    .line 15
    .line 16
    iput-object p4, p0, Ly04;->k0:Liz3;

    .line 17
    .line 18
    new-instance p2, Lw04;

    .line 19
    .line 20
    const/4 p3, 0x0

    .line 21
    invoke-direct {p2, p0, p3}, Lw04;-><init>(Ly04;B)V

    .line 22
    .line 23
    .line 24
    sget-object p3, Lw74;->X:Lw74;

    .line 25
    .line 26
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, Ly04;->l0:Lg44;

    .line 31
    .line 32
    new-instance p2, Lx04;

    .line 33
    .line 34
    invoke-direct {p2, p1, p0}, Lx04;-><init>(Lov3;Ly04;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Ly04;->m0:Lg44;

    .line 42
    .line 43
    new-instance p2, Lx04;

    .line 44
    .line 45
    invoke-direct {p2, p0, p1}, Lx04;-><init>(Ly04;Lov3;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p3, p2}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Ly04;->n0:Lg44;

    .line 53
    .line 54
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
    new-instance v0, Ly04;

    .line 8
    .line 9
    sget-object v3, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, p0, Ly04;->k0:Liz3;

    .line 12
    .line 13
    iget-object v2, p0, Lp04;->Z:Ljava/lang/String;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Ly04;-><init>(Lov3;Ljava/lang/String;Ljava/lang/Object;Liz3;Lyu3;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final V()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 2
    .line 3
    iget-object p0, p0, Liz3;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object p0
.end method

.method public final W()Lmz3;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->l0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmz3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final X()Lpt3;
    .locals 1

    .line 1
    iget-object v0, p0, Ly04;->k0:Liz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lch3;->E(Liz3;)Let3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Let3;->a:Lpt3;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "No signature for function: "

    .line 16
    .line 17
    invoke-static {p0, v0}, Lxw3;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final Y()Lli8;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->m0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lli8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 2
    .line 3
    iget-object p0, p0, Liz3;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    return-object p0
.end method

.method public final e()Lzw3;
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->h:Lz47;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x16

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lz47;->J(Lnw3;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lgz8;

    .line 21
    .line 22
    invoke-static {p0}, Lys0;->c0(Lgz8;)Lzw3;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 2
    .line 3
    iget-object p0, p0, Liz3;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->n:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final i()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->l:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x1a

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final j()Lpw3;
    .locals 0

    .line 1
    iget-object p0, p0, Ly04;->n0:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpw3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final k()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->m:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final m()Lex4;
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->i:Lz47;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x17

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lz47;->J(Lnw3;Ljava/lang/Object;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lex4;

    .line 21
    .line 22
    return-object p0
.end method

.method public final o()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->j:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public final s()Z
    .locals 3

    .line 1
    sget-object v0, Low;->a:[Lnw3;

    .line 2
    .line 3
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, Low;->k:Ldq;

    .line 9
    .line 10
    sget-object v1, Low;->a:[Lnw3;

    .line 11
    .line 12
    const/16 v2, 0x19

    .line 13
    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method
